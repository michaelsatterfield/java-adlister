
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if(request.getMethod().equalsIgnoreCase("post")) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equalsIgnoreCase("admin")&& password.equalsIgnoreCase("password")){
            response.sendRedirect("/profile.jsp");
        }
    }
%>


<html>
<head>
    <title>Login</title>
</head>
<body>
<%@ include file="partials/navbar.jsp" %>
<form action="/login.jsp" method="POST">
    <div class="container">
        <label for="username">Username</label>
        <input name="username" id="username" type="text" placeholder="Enter Username" name="uname" required>

        <label for="password">Password</label>
        <input name="password" id="password" type="password" placeholder="Enter Password" name="psw" required>

        <button type="submit">Login</button>
        <label>
            <input type="checkbox" checked="checked" name="remember">
        </label>
    </div>




</form>
</body>
</html>