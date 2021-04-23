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
public class Dish {
    private int id;
    private String name;
    private int price;
    
    public Dish() {
        
    }
    
    public Dish(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getPrice() {
        return this.price;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
}
