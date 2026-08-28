<%--
  Created by IntelliJ IDEA.
  User: lakkhanasudhamkalutara
  Date: 2026-08-27
  Time: 16:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>J2EE Security | Login</title>
</head>
<body>
<h1>J2EE Security Login </h1>

<p style="color: red">
    ${requestScope.message}
</p>
<form action="j_security_check" method="post">
    <table>
        <tr>
            <td><label for="username">Username:</label></td>
            <td><input type="text" id="username" name="j_username" required></td>
        </tr>
        <tr>
            <td><label for="password">Password:</label></td>
            <td><input type="password" id="password" name="j_password" required></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Login"></td>
        </tr>
    </table>


</form>

<h1>Custom Form Auth</h1>

<form action="${pageContext.request.contextPath}/custom_auth" method="POST">
    <table>
        <tr>
            <td><label for="username">Username:</label></td>
            <td><input type="text" id="username" name="username" required></td>
        </tr>
        <tr>
            <td><label for="password">Password:</label></td>
            <td><input type="password" id="password" name="password" required></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Login"></td>
        </tr>
    </table>


</form>
</body>

</html>
