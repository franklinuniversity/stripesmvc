/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.franklin.stripesmvc.dao;

import java.util.List;

/**
 *
 * @author jesse
 */
public interface Repository<E> {
    
    E find(int id);
    
    E save(E entity);
    
    E update(E entity);
    
    void remove(E entity);
    
    List<E> findAll();
    
    Long getCount();
}
