<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>RegisterPage</title>
</head>
<body>
<h2>Register Page</h2>
<form action="register.do" method="post">  
    <table>  
        <tr>  
            <td>Name:</td><td><input type="text" name="name"/></td>  
        </tr>  
        <tr>  
            <td>Password:</td><td><input type="password" name="password"/></td>  
        </tr>
         <tr>  
            <td>RePassword:</td><td><input type="password" name="repassword"/></td>  
        </tr>
         <tr>  
            <td>Age:</td><td><input type="text" name="age"/></td>  
        </tr>
         <tr>  
            <td>Grade:</td><td><select name="grade">
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            </select></td>  
        </tr> 
         <tr>  
            <td>Rank:</td><td><input type="text" name="rank"/></td>  
        </tr>      
        <tr>  
            <td colspan="2"><input type="submit" value="提交"/></td>  
        </tr>  
    </table>  
</form>  
</body>
</html>