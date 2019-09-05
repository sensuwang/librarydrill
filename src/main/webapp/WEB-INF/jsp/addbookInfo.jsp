<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 2019/9/5
  Time: 9:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="add">

    <table border="1">
        <tr>
            <td colspan="2">添加用户信息</td>
        </tr>
        <tr>
            <td>书名</td>
            <td>
                <input type="text" name="bookName" />
            </td>
        </tr>
        <tr>
            <td>图片</td>
            <td>
                <input type="text" name="bookImg" />
            </td>
        </tr>
        <tr>
            <td>现价</td>
            <td>
                <input type="text" name="bookNowPrice" />
            </td>
        </tr>
        <tr>
            <td>原价</td>
            <td>
                <input type="text" name="bookPrePrice" />
            </td>
        </tr>
        <tr>
            <td>折扣</td>
            <td>
                <input type="text" name="book" />
            </td>
        </tr>
        <tr>
            <td>作者</td>
            <td>
                <input type="text" name="book" />
            </td>
        </tr>
        <tr>
            <td>出版社</td>
            <td>
                <input type="text" name="book" />
            </td>
        </tr>
        <tr>
            <td>出版时间</td>
            <td>
                <input type="text" name="book" />
            </td>
        </tr>
        <tr>
            <td>介绍</td>
            <td>
                <input type="text" name="book" />
            </td>
        </tr>

        <tr>
            <td>
                <a href="/ssmcrud/fanhui">返回</a>
            </td>
            <td>
                <input type="submit" value="提交" />
            </td>
        </tr>


    </table>

</form>


</body>
</html>
