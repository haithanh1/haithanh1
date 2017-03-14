<%-- 
    Document   : signup
    Created on : Mar 10, 2017, 4:00:49 PM
    Author     : username
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" href="css/stylelogin.css">
            <link href="css/stype.css" rel="stylesheet"/>
    </head>
    <body>
      <%@include file="header.jsp" %>
       <div class="login-wrap" style="margin-top: 0px;">
           
  <h2>đăng ký tài khoản</h2>
  
  <div class="form">
    <form>
    </form>
    <input type="text" placeholder="Fistname" name="">
    <input type="text" placeholder="lastname" name="">
    <input type="text" placeholder="tài khoản" name="">
    <input type="password" placeholder="mật khẩu" name="">
    <input type="password" placeholder="xác nhận mật khẩu" name="">
    <input type="text" placeholder="dia chỉ" name="">
    <input type="email" placeholder="email" name="" >
    <input type="submit" value="đăng ký" class="button1">
   
  </div>
</div>
        
    </body>
</html>
