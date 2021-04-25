/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.tallerfacade.presentacion;

import co.unicauca.tallerfacade.access.Factory;
import co.unicauca.tallerfacade.access.IOrderRepository;
import co.unicauca.tallerfacade.dominio.Customer;
import co.unicauca.tallerfacade.dominio.Dish;
import co.unicauca.tallerfacade.dominio.OrderFacade;
import co.unicauca.tallerfacade.dominio.State;

/**
 * Cliente que llama a los servicios de la facada
 *
 * @author Libardo Pantoja, Julio A. Hurtado
 */
public class Main {
    public static void main(String[] args) throws Exception {
        OrderFacade facade = new OrderFacade();
        facade.createOrder(new Customer(1, "Carlos Sanchez", "Calle 12 No. 12-12 Barrio Caldas", "3115677899", "Popayán"));
        facade.addDish(new Dish(1, "Hamburguesa vegetariana", 5000), 2);
        facade.addDish(new Dish(2, "Hamburguesa sencilla", 4000), 3);
        facade.addDish(new Dish(3, "Jugo hit", 1000), 2);
        System.out.println("Pedido creado");
        facade.changeState(State.CONFIRMED);
        System.out.println("Se cambio el estado a " + facade.getOrder().getState());
        facade.changeState(State.DISPACHED);
        System.out.println("Se cambio el estado a " + facade.getOrder().getState());
        facade.changeState(State.FINALIZED);
        System.out.println("Se cambio el estado a " + facade.getOrder().getState());
        System.out.println("El valor total del pedido es: " + facade.calculateTotal());
        System.out.println("Total de platos pedidos: " + facade.totalDishes());
        IOrderRepository repo = Factory.getInstance().getRepository("default");
        facade.save(repo);
        System.out.println("Pedido grabado con éxito en la base de datos");
    }
}