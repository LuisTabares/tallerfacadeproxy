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

/**
 * Clase de un cliente de restaurante
 * @author Luis Tabares
 */
public class Customer {

    private int id;
    private String name;
    private String address;
    private String mobile;
    private String city;

    /**
     * Constructor por defecto
     */
    public Customer() {

    }

    /**
     * Constructor parametrizado
     *
     * @param id identificacion del cliente
     * @param name nombre del cliente
     * @param address direccion de residencia del cliente
     * @param mobile numero telefonico del cliente
     * @param city ciudad de residencia del cliente
     */
    public Customer(int id, String name, String address, String mobile, String city) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.city = city;
    }

    /**
     * Metodo getter
     *
     * @return id del cliente
     */
    public int getId() {
        return this.id;
    }

    /**
     * Metodo getter
     *
     * @return nombre del cliente
     */
    public String getName() {
        return this.name;
    }

    /**
     * Metodo getter
     *
     * @return direccion de residencia del cliente
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Metodo getter
     *
     * @return numero telefonico del cliente
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * Metodo getter
     *
     * @return ciudad de residencia del cliente
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Metodo setter
     *
     * @param id identificacion del cliente
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Metodo setter
     *
     * @param name nombre del cliente
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Metodo setter
     *
     * @param address direccion de residencia del cliente
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Metodo setter
     *
     * @param mobile numero telefonico del cliente
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * Metodo setter
     *
     * @param city ciudad de residencia del cliente
     */
    public void setCity(String city) {
        this.city = city;
    }
}
