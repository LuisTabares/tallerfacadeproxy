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

import co.unicauca.tallerfacadeproxy.access.IOrderRepository;

/**
 * Clase OrderService que sirve para obtener una instancia abstracta del
 * repositorio de ordenes
 *
 * @author Luis Tabares
 */
public class OrderService {

    private final IOrderRepository service;

    /**
     * Constructor privado que evita que otros objetos instancien
     *
     * @param service implementacion de tipo IOrderService
     */
    public OrderService(IOrderRepository service) {
        this.service = service;
    }

    /**
     * Mrtodo que guarda la orden
     *
     * @param order la orden que va a ser guardada
     * @return si la orden pudo ser guardada o no
     * @throws Exception si hubo algun problema con la base de datos
     */
    public boolean saveOrder(Order order) throws Exception {
        return service.saveOrder(order);

    }
}
