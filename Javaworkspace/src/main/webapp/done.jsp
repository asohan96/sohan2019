<%@page import="com.lti.bank.dto.SecondaryAccountDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payment Done</title>
</head>
<body>
<h2>Payment Done, please wait while we redirect you back from where you came</h2>

<%
	SecondaryAccountDTO s = (SecondaryAccountDTO) session.getAttribute("secondaryAccountDTO");
	response.setHeader("refresh", "2; URL=" + s.getRedirectUrl());
%>
</body>
</html>