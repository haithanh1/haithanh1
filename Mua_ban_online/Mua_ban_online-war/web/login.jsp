<%-- 
    Document   : login
    Created on : Mar 10, 2017, 4:49:50 AM
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
<div class="login-wrap" style="margin-top: 182px;">
  <h2>Login</h2>
  
  
  <div class="form">
      <form>
            <input type="text" placeholder="tài khoản" name="">
            <input type="password" placeholder="mật khẩu" name="">
            <<input type="submit" value="đăng nhập" class="button1">
      </form>
  
   
    <a href="signup.jsp"> <p> bạn chưa co tài khoản? </p></a>
  </div>
</div>

    </body>
</html>
