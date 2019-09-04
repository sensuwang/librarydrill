<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 2019/9/4
  Time: 13:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/librarydrill/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="/librarydrill/css/base.css">
</head>
<body>
<div>
    <div class="input-group input-group-lg">
        <form action="findbyname">
        <input type="text" class="form-control" placeholder="Bookname"  value="bookName" name = "bookName" aria-describedby="sizing-addon1">
        <input type="submit" value="搜索">
        </form>
    </div>


    <div class="btn-group" role="group" aria-label="...">
        <button type="button" class="btn btn-default">综合</button>
        <button type="button" class="btn btn-default">销量</button>
        <button type="button" class="btn btn-default">出版日期</button>
        <button type="button" class="btn btn-default">价格</button>
    </div>

    <table border="1" cellspacing="0" cellpadding="0">

    <tr>
        <th>编号</th>
        <th>书名</th>
        <th>图片</th>
        <th>现价</th>
        <th>前价</th>
        <th>折扣</th>
        <th>作者</th>
        <th>出版社</th>
        <th>出版日期</th>
        <th>介绍</th>
        <th colspan="3">操作</th>
    </tr>

    <c:forEach items="${ls}" var="d" varStatus="st">
        <tr>
            <td>${d.id}</td>
            <td>${d.bookName}</td>
            <td><img src="${d.bookImg}"></td>
            <td>${d.bookNowPrice}</td>
            <td>${d.bookPrePrice}</td>
            <td>${d.bookDiscount}</td>
            <td>${d.bookAuthor}</td>
            <td>${d.bookPublish}</td>
            <td>${d.bookPublishData}</td>
            <td>${d.bookDetail}</td>
            <td>
                <a href="findbyid?id=${d.id}">详情</a>
            </td>
            <td>
                <a href="editgo?id=${d.id}">修改</a>
            </td>
            <td>
                <a href="delete?id=${d.id}">删除</a>
            </td>
        </tr>
    </c:forEach>

    <tr>
        <td colspan="13">
            <a href="addgo">添加</a>
        </td>
    </tr>

</table>
</div>

</body>

</html>
