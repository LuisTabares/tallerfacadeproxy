/*
 * Copyright (C) 2021 Luis Tabares
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package co.unicauca.tallerfacadeproxy.access;

import co.unicauca.tallerfacadeproxy.dominio.Order;
import java.security.Provider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Repositorio que permite acceder a una base de datos de la clase Order
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
            //this.connect();

            String sql = "INSERT INTO Orders (despatch, customername, orderstate ) "
                    + "VALUES ( ?, ?, ? )";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, order.getDespatch());
            pstmt.setString(2, order.getCustomer().getName());
            pstmt.setString(3, order.getState().toString());
            pstmt.executeUpdate();
            //this.disconnect();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Provider.Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /**
     * Metodo que inicializa la base de datos
     */
    private void initDatabase() {
        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS Orders (\n"
                + "	despatch integer PRIMARY KEY,\n"
                + "	customername text NOT NULL,\n"
                + "	orderstate text NOT NULL\n"
                + ");";

        try {
            this.connect();
            Statement stmt = conn.createStatement();
            stmt.execute(sql);

            //this.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(Provider.Service.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Metodo que conecta la base de datos
     */
    public void connect() {
        // SQLite connection string
        //String url = "jdbc:sqlite:./tallerfacadeproxydb.db";
        String url = "jdbc:sqlite::memory:";

        try {
            conn = DriverManager.getConnection(url);

        } catch (SQLException ex) {
            Logger.getLogger(Provider.Service.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Metodo que desconecta la base de datos
     */
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
