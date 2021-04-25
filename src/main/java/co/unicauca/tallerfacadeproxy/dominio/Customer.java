/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.tallerfacadeproxy.dominio;

/**
 *
 * @author Luis Tabares
 */
public class Customer {
    private int id;
    private String name;
    private String address;
    private String mobile;
    private String city;
    
    public Customer() {
        
    }
    
    public Customer(int id, String name, String address, String mobile, String city) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.city = city;
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getAddress() {
        return this.address;
    }
    
    public String getMobile() {
        return this.mobile;
    }
    
    public String getCity() {
        return this.city;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void setMobile(String mobile)  {
        this.mobile = mobile;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
}
