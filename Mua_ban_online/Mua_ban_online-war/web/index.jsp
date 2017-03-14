<%-- 
    Document   : index
    Created on : Mar 12, 2017, 3:10:42 AM
    Author     : username
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/stype.css" rel="stylesheet"/>
    </head>
    <body>
        
        <div class="wraper">
            
            <%@include file="header.jsp" %>
            <div id="phancach"></div>
            <%@include file="leff.jsp" %>
            <%@include file="center.jsp" %>
            <%@include file="right.jsp" %>
            <%@include file="footer.jsp" %>
            
        </div>
    </body>
</html>
