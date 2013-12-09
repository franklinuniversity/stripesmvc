/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.franklin.stripesmvc.ext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sourceforge.stripes.action.ActionBeanContext;
import net.sourceforge.stripes.controller.DefaultActionBeanContextFactory;
import net.sourceforge.stripes.controller.StripesFilter;
import net.sourceforge.stripes.integration.spring.SpringHelper;

/**
 *
 * @author jesse
 */
public class ActionBeanContextFactory extends DefaultActionBeanContextFactory {
    
    /**
     *
     * @param req
     * @param resp
     * @return
     * @throws ServletException
     */
    @Override
    public ActionBeanContext getContextInstance(HttpServletRequest req, HttpServletResponse resp) throws ServletException{
        ActionBeanContext abc = super.getContextInstance(req, resp);
        
        ServletContext sc = StripesFilter.getConfiguration().getServletContext();
        
        SpringHelper.injectBeans(abc, sc);
        
        return abc;
    }
}
