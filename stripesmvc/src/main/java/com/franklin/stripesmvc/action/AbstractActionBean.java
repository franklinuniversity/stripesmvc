/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.franklin.stripesmvc.action;


import com.franklin.stripesmvc.ext.ActionBeanContextImpl;
import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;
import net.sourceforge.stripes.integration.spring.SpringBean;

/**
 *
 * @author jesse
 */
public abstract class AbstractActionBean implements ActionBean {

    // this is where you can add our Spring Beans
    
    protected ActionBeanContextImpl _context;
    
    @Override
    public void setContext(ActionBeanContext abc) {
        _context = (ActionBeanContextImpl)abc;
    }

    @Override
    public ActionBeanContext getContext() {
        return _context;
    }
    
}
