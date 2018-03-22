<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="com.zrf.springmvc.entities.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
     <form action="testConversionServiceConver" method="post">
       Emaployee:<input type="text" name="employee">
       <input type="submit" value="submit">
     </form>
    <br><br>
  <form:form action="${pageContext.request.contextPath }/emp" method="POST" 
		modelAttribute="employee">
		<form:errors path="*"></form:errors>
		<br>
		<c:if test="${employee.id == null }">
			<!-- path 属性对应 html 表单标签的 name 属性值 -->
			LastName: <form:input path="lastName"/>
			<form:errors path="lastName"></form:errors>
		</c:if>
		<c:if test="${employee.id != null }">
			<form:hidden path="id"/>
			<input type="hidden" name="_method" value="PUT"/>
			<%-- 对于 _method 不能使用 form:hidden 标签, 因为 modelAttribute 对应的 bean 中没有 _method 这个属性 --%>
			<%-- 
			<form:hidden path="_method" value="PUT"/>
			--%>
		</c:if>
		
		<br>
		Email: <form:input path="email"/>
		<form:errors path="email"></form:errors>
		<br>
		<% 
			Map<String, String> genders = new HashMap();
			genders.put("1", "Male");
			genders.put("0", "Female");
			
			request.setAttribute("genders", genders);
		%>
		Gender: 
		<br>
		<form:radiobuttons path="gender" items="${genders }" delimiter="<br>"/>
		<br>
		Department: <form:select path="department.id" 
			items="${departments }" itemLabel="departmentName" itemValue="id"></form:select>
		<br>
		birthday:<form:input path="birthday"/>
		<form:errors path="birthday"></form:errors>
		<br>
		salary:<form:input path="salary"/><br>
     <input type="submit" value="submit">
   </form:form>
</body>
</html>