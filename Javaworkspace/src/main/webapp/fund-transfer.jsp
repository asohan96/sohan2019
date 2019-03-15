<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fund Transfer</title>
<h1>Fund Transfer</h1>
</head>
<body>
<form action = "controller/transaction" method= "post">


<p>Enter FromAccount:   <input type="text" name="formaccountNumber"/></br></p>

<p>Enter  ToAccount:   <input type="text" name="toaccount"/></br> </p>

<p>Enter  Amount:  <input type="text" name="amount"/></br></p>

<!-- <p>Enter  TransferMode: 
 <select>
  <option value="IMPS">IMPS</option>
  <option value="NEFT">NEFT</option>
  <option value="RTGS">RTGS</option>
</select></br></p> -->

<p><input type="submit" value="Continue"/></p>
</form>
</body>
</html> 
