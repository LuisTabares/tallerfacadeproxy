/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.tallerfacade.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Luis Tabares
 */
public class Order {
    private int despatch;
    private Customer customer;
    private LocalDate date;
    private State state;
    private ArrayList<Item> details;
    
    public Order(Customer customer) {            
        this.date = LocalDate.now();
        
        Random r = new Random();
        String despatchStr = Integer.toString(customer.getId()) + Integer.toString(date.getDayOfYear()) + Integer.toString(r.nextInt(101));
        this.despatch = Integer.parseInt(despatchStr);
        
        this.customer = customer;
        
        this.state = State.NEW;
        
        this.details = new ArrayList<Item>();
    }
    
    public int getDespatch() {
        return this.despatch;
    }
    
    public Customer getCustomer() {
        return this.customer;
    }
    
    public LocalDate getDate() {
        return this.date;
    }
    
    public State getState() {
        return this.state;
    }
    
    public ArrayList<Item> getDetails() {
        return this.details;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    public void setState(State state) {
        this.state = state;
    }
    
    public void setDetails(ArrayList<Item> details) {
        this.details = details;
    }
    
    public void addDish(Dish dish, int amount) {
        Item item = new Item(dish, amount);
        details.add(item);
    }
    
    public int calculateTotal() {
        int total = 0;
        for (Item item : details) {
            total += item.getDish().getPrice() * item.getAmount();
        }
        return total;
    }
}
