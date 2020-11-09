<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>

    <jsp:include page="../partials/navbar.jsp" />
    <p>Is User : ${user}</p>
    <div class="container">
        <h1>Welcome, ${user}</h1>
    </div>

</body>
</html>
