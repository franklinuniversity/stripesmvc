<%-- 
    Document   : layout_main
    Created on : Dec 9, 2013, 10:43:23 AM
    Author     : jesse
--%>

<%@page contentType="text/html;charset=ISO-8859-1" language="java"%>
<%@include file="/WEB-INF/jsp/common/taglibs.jsp"%>

<s:layout-definition>
    <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
    <html>
        <head>
            <title>${title}</title>
            <script src="${contextPath}/js/jquery-1.9.1.js"></script>
            <link rel="stylesheet" type="text/css" href="${contextPath}/css/styles.css">
        </head>
        <body>       
            <div id="container">
                <div id="middle">
                    <div id="header">
                        <div  class="page_width">
                            <img src="${contextPath}/images/logo5.png" />
                            <div id="menu">
                                <ul id="nav">
                                    <li><a href="/stripesmvc">Home</a></li>
                                    <li>
                                        <a href="#">About</a>
                                        <ul>
                                            <li><a href="/about/stipes">Stripes</a></li>
                                            <li><a href="/about/project">This Project</a></li>
                                        </ul>
                                    </li>
                                    <li><a href="#">Help</a>
                                        <ul>
                                            <li><a href="/help">Help 1</a></li>
                                            <li><a href="/help">Help 2</a></li>
                                        </ul>
                                    </li>
                                    <li><a href="/contact">Contact</a></li>                   
                                </ul>
                            </div>
                        </div>
                    </div>

                    <div class="page_width">

                        <div id="main_body">
                            <s:messages/>
                            <s:layout-component name="body"/>
                        </div>

                        <br>
                    </div>
                </div>

                <div id="footer">
                    Franklin Stripes MVC 2013
                </div>
            </div>
        </body>
    </html>
</s:layout-definition>
