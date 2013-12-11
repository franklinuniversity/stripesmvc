/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.franklin.stripesmvc.entity;

/**
 *
 * @author jesse
 */
public abstract class AbstractEntity {
    
    private int id;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
}
