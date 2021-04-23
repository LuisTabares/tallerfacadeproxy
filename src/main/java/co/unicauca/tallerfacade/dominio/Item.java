/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.tallerfacade.dominio;

/**
 *
 * @author Luis Tabares
 */
public class Item {
    private Dish dish;
    private int amount;
    
    public Item() {
        
    }
    
    public Item(Dish dish, int amount) {
        this.dish = dish;
        this.amount = amount;
    }
    
    public Dish getDish() {
        return this.dish;
    }
    
    public int getAmount() {
        return this.amount;
    }
    
    public void setDish(Dish dish) {
        this.dish = dish;
    }
    
    public void setAmount(int amount) {
        this.amount = amount;
    }
}
