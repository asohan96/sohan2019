<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration form</title>
</head>
<body>
<form action = "controller/netbank" method= "post">
<!-- Enter Account Number: <input type="number" name="AccountNumber"><br> -->
Enter  LoginPassword: <input type="password" name=" LoginPassword"/><br> 
<!--  Enter  ConfirmPassword: <input type="password" name=" ConfirmPassword"/><br>
 --> Enter  TransactionPassword: <input type="password" name=" TransactionPassword"/><br>
<!--  Enter  ConfirmTransactionPassword: <input type="password" name=" ConfirmTransactionPassword"/><br>
 -->
<input type="submit" value="Register"/>
</form>

</body>
</html> 
