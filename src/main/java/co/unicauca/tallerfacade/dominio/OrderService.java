/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.tallerfacade.dominio;

import co.unicauca.tallerfacade.access.IOrderRepository;

/**
 *
 * @author Luis Tabares
 */
public class OrderService {
    private final IOrderRepository service;

    /**
     * Constructor privado que evita que otros objetos instancien
     * @param service implementacion de tipo IOrderService
     */
    public OrderService(IOrderRepository service) {
        this.service = service;
    }

    public boolean saveOrder(Order order) throws Exception {
        return service.saveOrder(order);

    }
}
