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

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

/**
 * Clase Order
 * @author Luis Tabares
 */
public class Order {

    private int despatch;
    private Customer customer;
    private LocalDate date;
    private State state;
    private ArrayList<Item> details;

    /**
     * Constructor parametrizado de Order
     *
     * @param customer el cliente que realiza la orden
     */
    public Order(Customer customer) {
        //Se inicializan los atributos

        this.date = LocalDate.now();

        Random r = new Random();
        String despatchStr = Integer.toString(customer.getId()) + Integer.toString(date.getDayOfYear()) + Integer.toString(r.nextInt(101));
        this.despatch = Integer.parseInt(despatchStr);

        this.customer = customer;

        this.state = State.NEW;

        this.details = new ArrayList<Item>();
    }

    /**
     * Metodo getter
     *
     * @return el identificador de envio de la orden
     */
    public int getDespatch() {
        return this.despatch;
    }

    /**
     * Metodo getter
     *
     * @return el cliente que realiza la orden
     */
    public Customer getCustomer() {
        return this.customer;
    }

    /**
     * Metodo getter
     *
     * @return la hora a la que fue creada la orden
     */
    public LocalDate getDate() {
        return this.date;
    }

    /**
     * Metodo getter
     *
     * @return el estado en el que se encuentra la orden
     */
    public State getState() {
        return this.state;
    }

    /**
     * Metodo getter
     *
     * @return una lista de los items que conforman la orden
     */
    public ArrayList<Item> getDetails() {
        return this.details;
    }

    /**
     * Metodo setter
     *
     * @param customer el cliente que realiza la orden
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * Metodo setter
     *
     * @param date hora en la que se pide la orden
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * Metodo setter
     *
     * @param state enum State que representa el estado de la orden
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Metodo setter
     *
     * @param details lista de los items que conforman la orden
     */
    public void setDetails(ArrayList<Item> details) {
        this.details = details;
    }

    /**
     * Metodo que permite añadir un nuevo plato
     *
     * @param dish el tipo de plato que se va a pedir
     * @param amount el numero de platos que se van a pedir
     */
    public void addDish(Dish dish, int amount) {
        Item item = new Item(dish, amount);
        details.add(item);
    }

    /**
     * Metodo que permite calcular el costo del pedido
     *
     * @return el costo total del pedido
     */
    public int calculateTotal() {
        int total = 0;
        for (Item item : details) {
            total += item.getDish().getPrice() * item.getAmount();
        }
        return total;
    }
}
