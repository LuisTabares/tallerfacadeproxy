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
 * Clase Dish
 * @author Luis Tabares
 */
public class Dish {

    private int id;
    private String name;
    private int price;

    /**
     * Constructor por defecto
     */
    public Dish() {

    }

    /**
     * Constructor parametrizado
     *
     * @param id identificador del plato
     * @param name nombre del plato
     * @param price precio del plato
     */
    public Dish(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    /**
     * Metodo getter
     *
     * @return identificador del plato
     */
    public int getId() {
        return this.id;
    }

    /**
     * Metodo getter
     *
     * @return nombre del plato
     */
    public String getName() {
        return this.name;
    }

    /**
     * Metodo getter
     *
     * @return precio del plato
     */
    public int getPrice() {
        return this.price;
    }

    /**
     * Metodo setter
     *
     * @param id el identificador del plato
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Metodo setter
     *
     * @param name el nombre del plato
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Metodo setter
     *
     * @param price el precio del plato
     */
    public void setPrice(int price) {
        this.price = price;
    }
}
