<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   
   
   <form action="springmvc/testRest/1" method="post">
        <input type="hidden" name="_method" value="PUT"/>
        <input type="submit" value="TestRest PUT"/>
        </form>
        <br><br>
    
        <form action="springmvc/testRest/1" method="post">
            <input type="hidden" name="_method" value="DELETE"/>
            <input type="submit" value="TestRest DELETE"/>
        </form>
        <br><br>
        
        <form action="springmvc/testRest" method="post">
            <input type="submit" value="TestRest POST"/>
        </form>
        <br><br>
        
        <a href="springmvc/testRest/1">Test Rest Get</a>
        <br><br>
</body>
</html>