/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.tallerfacade.access;

import co.unicauca.tallerfacade.dominio.Order;
import java.security.Provider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis Tabares
 */
public class OrderRepository implements IOrderRepository {

    private Connection conn;

    public OrderRepository() {
        initDatabase();
    }
    
    @Override
    public boolean saveOrder(Order order) {
        try {
            //Validate product
            if (order == null || order.getDespatch() < 0 || order.getCustomer() == null) {
                return false;
            }
            this.connect();

            String sql = "INSERT INTO Order (despatch, customername, state ) "
                    + "VALUES ( ?, ?, ? )";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, order.getDespatch());
            pstmt.setString(2, order.getCustomer().getName());
            pstmt.setString(3, order.getState().toString());
            pstmt.executeUpdate();
            this.disconnect();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Provider.Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    private void initDatabase() {
        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS Order (\n"
                + "	despatch integer PRIMARY KEY,\n"
                + "	customername text NOT NULL,\n"
                + "	state text NOT NULL\n"
                + ");";

        try {
            this.connect();
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
            
            this.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(Provider.Service.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void connect() {
        // SQLite connection string
        //String url = "jdbc:sqlite:./tallerfacadedb.db";
        String url = "jdbc:sqlite::memory:";

        try {
            conn = DriverManager.getConnection(url);

        } catch (SQLException ex) {
            Logger.getLogger(Provider.Service.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void disconnect() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
