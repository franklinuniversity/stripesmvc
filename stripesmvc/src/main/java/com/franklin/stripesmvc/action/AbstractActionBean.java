/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.franklin.stripesmvc.action;


import com.franklin.stripesmvc.ext.ActionBeanContextImpl;
import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;

/**
 *
 * @author jesse
 */
public abstract class AbstractActionBean implements ActionBean {

    // this is where you can add our Spring Beans
    
    protected ActionBeanContextImpl context;
    
    @Override
    public void setContext(ActionBeanContext abc) {
        context = (ActionBeanContextImpl)abc;
    }
    
    @Override
    public ActionBeanContextImpl getContext() {
        return context;
    }
    
}
