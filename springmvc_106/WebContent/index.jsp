<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <form action="springmvc/testModelAttribute" method="post">
    <input type="hidden" name="id" value="1"><br>
    username:<input type="text" name="username" value="zhangsan"><br>
    email:<input type="text" name="email" value="zhangsan@qq.com"><br>
    age:<input type="text" name="age" value="12"><br>
    <input type="submit" value="submit">
  </form>
</body>
</html>