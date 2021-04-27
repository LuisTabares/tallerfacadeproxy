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
package co.unicauca.tallerfacadeproxy.access.proxy;

import co.unicauca.tallerfacadeproxy.access.IOrderRepository;

/**
 * Interfaz que implementa el patro proxy para acceder al metodo que guarda
 * en un repositorio
 * @author Luis Tabares
 */
public interface IOrderService {
    /**
     * Metodo que permite guardar en un repositorio sea que este este de forma
     * local o remota
     * @param repo el perositorio en el que se guardara
     */
    public void save(IOrderRepository repo);
}
