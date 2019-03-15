<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome To Atlantic Bank</title>
</head>
<body>
Transaction amt : ${ secondaryAccountDTO.txAmount }

<form action="controller/atlantic-payment" method="post">
Welcome To Atlantic Bank
Enter Your Account Number : <br>
<input type="number" name="accountNumber" />
Enter Transaction Password : <br>
<input type="password" name="transactionPassword" />
	<button type="submit">Confirm</button>
	</form>
</body>
</html>