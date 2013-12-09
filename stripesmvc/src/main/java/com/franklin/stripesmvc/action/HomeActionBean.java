/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.franklin.stripesmvc.action;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;

/**
 *
 * @author jesse
 */
@UrlBinding("/")
public class HomeActionBean extends AbstractActionBean {
        
    /**
     * Handler to show the Web application index page.
     * @return Resolution
     */
    @DefaultHandler
    public Resolution index(){
        return new ForwardResolution("/WEB-INF/jsp/home.jsp");
    }
}
