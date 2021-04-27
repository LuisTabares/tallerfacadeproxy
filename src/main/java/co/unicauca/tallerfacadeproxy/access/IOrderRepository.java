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

import co.unicauca.tallerfacadeproxy.dominio.Order;

/**
 * Interzaz de OrderRepository que implementa el principio de inversion de
 * dependencias
 *
 * @author Luis Tabares
 */
public interface IOrderRepository {

    /**
     * Metodo que guarda una orden en el reposotorio
     *
     * @param order la orden a guardar en el repositorio
     * @return si pudo o no ser guardada la orden en el repositorio
     */
    public boolean createOrder(Order order);
}
