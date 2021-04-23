/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.tallerfacade.access;

import co.unicauca.tallerfacade.dominio.Order;

/**
 *
 * @author Luis Tabares
 */
public interface IOrderRepository {
    public boolean saveOrder(Order order);
}
