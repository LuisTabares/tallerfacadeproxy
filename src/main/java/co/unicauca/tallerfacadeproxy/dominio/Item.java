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
 * Clase Item que esta orientada a ser añadida a un pedido
 * @author Luis Tabares
 */
public class Item {

    private Dish dish;
    private int amount;

    /**
     * Contructor por defecto
     */
    public Item() {

    }

    /**
     * Constructor parametrizado
     *
     * @param dish objeto de tipo plato
     * @param amount numero de objetos del tipo plato
     */
    public Item(Dish dish, int amount) {
        this.dish = dish;
        this.amount = amount;
    }

    /**
     * Metodo getter
     *
     * @return objeto de tipo plato del item
     */
    public Dish getDish() {
        return this.dish;
    }

    /**
     * Metodo getter
     *
     * @return cantidad del plato del item
     */
    public int getAmount() {
        return this.amount;
    }

    /**
     * Metodo setter
     *
     * @param dish objeto de tipo plato del item
     */
    public void setDish(Dish dish) {
        this.dish = dish;
    }

    /**
     * Metodo setter
     *
     * @param amount numero de platos que tiene el item
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }
}
