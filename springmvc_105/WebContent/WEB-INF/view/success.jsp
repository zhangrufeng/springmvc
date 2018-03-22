<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  Success Page
  
  request user:${requestScope.user}
  <br></br>
  session user:${sessionScope.user}
  <br><br>
  
  request comapny:${requestScope.comapny}
  <br><br>
  session comapny:${sessionScope.comapny}
</body>
</html>