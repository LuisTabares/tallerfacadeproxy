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
package co.unicauca.tallerfacadeproxy.access;

/**
 * Clase Factory que implementa el patron singleton
 * y permite obtener la instancia de uno o mas repositorios
 * @author Luis Tabares
 */
public class Factory {

    private static Factory instance;

    /**
     * Clase singleton
     *
     * @return unica instancia de la clase
     */
    public static Factory getInstance() {

        if (instance == null) {
            instance = new Factory();
        }
        return instance;

    }

    /**
     * Método que crea una instancia concreta de la jerarquia IOrderRepository
     *
     * @param type el tipo de repositorio
     * @return una clase hija de la abstracción IOrderReposotory
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
