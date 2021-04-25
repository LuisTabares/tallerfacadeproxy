/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.tallerfacade.access;

/**
 *
 * @author Luis Tabares
 */
public class Factory {
    
    private static Factory instance;
    
     /**
     * Clase singleton
     *
     * @return
     */
    public static Factory getInstance() {

        if (instance == null) {
            instance = new Factory();
        }
        return instance;

    }
    
        /**
     * Método que crea una instancia concreta de la jerarquia ICustomerService
     *
     * @param type
     * @return una clase hija de la abstracción IRepositorioClientes
     */
    public IOrderRepository getRepository(String type) {

        IOrderRepository result = null;

        switch (type) {
            case "default":
                result = new OrderRepository();
                break;
        }

        return result;

    }
}
