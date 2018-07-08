<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Registration</title>
</head>
<body>
<form:form id="regForm" modelAttribute="user" action="register" method="post">
    <table align="center">
        <tr>
            <td>
                <form:label path="username">Username</form:label>
            </td>
            <td>
                <form:input path="username" name="username" id="username" />
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="password">Password</form:label>
            </td>
            <td>
                <form:password path="password" name="password" id="password" />
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="name">Name</form:label>
            </td>
            <td>
                <form:input path="name" name="name" id="name" />
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="surname">LastName</form:label>
            </td>
            <td>
                <form:input path="surname" name="surname" id="surname" />
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="email">Email</form:label>
            </td>
            <td>
                <form:input path="email" name="email" id="email" />
            </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <form:button id="register" name="register">Register</form:button>
            </td>
        </tr>
        <tr></tr>
        <tr>
            <td></td>
            <td><a href="../index.jsp">Home</a>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>