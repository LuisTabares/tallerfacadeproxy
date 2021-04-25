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
package co.unicauca.tallerfacadeproxy.dominio;

import co.unicauca.tallerfacadeproxy.access.IOrderRepository;

/**
 * Clase que implementa el patron Facade
 *
 * @author Luis Tabares
 */
public class OrderFacade {

    private Order order;

    /**
     * Constructor por defecto
     */
    public OrderFacade() {

    }

    /**
     * Constructor parametrizado
     *
     * @param customer el cliente que crea la orden
     */
    public void createOrder(Customer customer) {
        this.order = new Order(customer);
    }

    /**
     * Metodo que permite añadir un plato a la orden
     *
     * @param dish el plato que se va a pedir
     * @param amount cuantos platos va a pedir
     */
    public void addDish(Dish dish, int amount) {
        this.order.addDish(dish, amount);
    }

    /**
     * Metodo que permite cambiar el estado del pedido
     *
     * @param state enum de tipo State que indica el estado del pedido
     */
    public void changeState(State state) {
        this.order.setState(state);
    }

    /**
     * Metodo que permite cancelar la orden
     */
    public void cancelOrder() {
        this.order.setState(State.CANCELLED);
    }

    /**
     * Metodo que calcula el costo total de la orden
     *
     * @return el costo total de la orden
     */
    public int calculateTotal() {
        return this.order.calculateTotal();
    }

    /**
     * Metodo que retorna la instancia de la orden
     *
     * @return la instancia de la orden
     */
    public Order getOrder() {
        return this.order;
    }

    /**
     * Metodo que retorna el numero de platos que tiene la orden
     *
     * @return el numero de platos de la orden
     */
    public int totalDishes() {
        return this.order.getDetails().size();
    }

    /**
     * Metodo que graba en un repositorio la orden
     *
     * @param repo el repositorio en el que se va a grabar la orden
     * @throws Exception lanza una excepcion si hubo algun problema con la base
     * de datos
     */
    public void save(IOrderRepository repo) throws Exception {
        OrderService orderService = new OrderService(repo);

        orderService.saveOrder(this.getOrder());
    }
}
