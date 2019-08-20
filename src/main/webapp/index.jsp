<html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>  
<body>
<h2>Login Page</h2>
<form action="login.do" method="post">  
    <table>  
        <tr>  
            <td>Name:</td><td><input type="text" name="name"/></td>  
        </tr>  
        <tr>  
            <td>Password:</td><td><input type="password" name="password"/></td>  
        </tr>  
        <tr>  
            <td colspan="2"><input type="submit" value="提交"/></td>  
        </tr>  
    </table>  
</form>  
<a href="register">Click to register</a>
</body>
</html>
