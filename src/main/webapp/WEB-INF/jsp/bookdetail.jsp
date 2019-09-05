<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 2019/9/4
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>

<title>详情页面</title>
</head>
<body>

<table border="1" cellspacing="0" cellpadding="0">

    <tr>
        <th>编号</th>
        <th>书名</th>
        <th>图片</th>
        <th>现价</th>
        <th>原价</th>
        <th>折扣</th>
        <th>作者</th>
        <th>出版社</th>
        <th>出版日期</th>
        <th>介绍</th>
    </tr>
    <tr>
        <td>${bookInfo.id}</td>
        <td>${bookInfo.bookName}</td>
        <td><img src="${bookInfo.bookImg}"></td>
        <td>${bookInfo.bookNowPrice}</td>
        <td>${bookInfo.bookPrePrice}</td>
        <td>${bookInfo.bookDiscount}</td>
        <td>${bookInfo.bookAuthor}</td>
        <td>${bookInfo.bookPublish}</td>
        <td>${bookInfo.bookPublishDate}</td>
        <td>${bookInfo.bookDetail}</td>
    </tr>



</table>


</body>
</html>
