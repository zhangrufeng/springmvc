<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <form action="testHttpMessageConverter" method="post" enctype="multipart/form-data">
    File:<input type="file" name="file"><br>
    desc:<input type="text" name="desc"><br>
    <input type="submit" value="Submit">
  </form>
  <br><br>
  <a href="testResponseEntity">testResponseEntity</a>
</body>
</html>