/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.franklin.stripesmvc.ext;

import com.franklin.stripesmvc.entity.User;
import net.sourceforge.stripes.action.ActionBeanContext;

/**
 *
 * @author jesse
 */
public class ActionBeanContextImpl extends ActionBeanContext {
    
    
    public void setUser(User user) {
        setCurrent("user", user.getId());
    }
    
    public User getUser() {
        Integer userId = getCurrent("user", null);
        
        return new User();
        //return userDao.read(userId);
    }    
    
    protected void setCurrent(String key, Object value) {
        getRequest().getSession().setAttribute(key, value);
    }
    
    @SuppressWarnings("unchecked")
    protected <T> T getCurrent(String key, T defaultValue) {
        T value = (T) getRequest().getSession().getAttribute(key);
        if (value == null) {
            value = defaultValue;
            setCurrent(key, value);
        }
        return value;
    }
}
