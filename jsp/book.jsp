<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="css/book.css" type="text/css" rel="stylesheet">
<title>首页</title>
</head>
<body>
<h3><font>欢迎访问</font></h3>
<hr>
<table>
<tr>
<td>编号</td><td>书名</td><td>作者</td><td>价格</td>
</tr>
<c:forEach items="${requestScope.book_list }" var="book">
<tr>
<td>${book.id }</td>
<td>${book.name }</td>
<td>${book.author }</td>
<td>${book.price}</td>
</tr>
</c:forEach>
</table>
</body>
</html>