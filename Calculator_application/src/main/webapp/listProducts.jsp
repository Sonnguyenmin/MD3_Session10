
<%--
  Created by IntelliJ IDEA.
  User: sonnguyen
  Date: 7/23/2024
  Time: 2:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Trang chủ</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<h1>Danh sách sản phẩm</h1>
<a href="" class="btn btn-primary">Thêm mới nhân viên</a>

<table class="table table-striped">
    <thead>
    <tr>
        <th scope="col">STT</th>
        <th scope="col">Tên</th>
        <th scope="col">Ảnh</th>
        <th scope="col">Giá</th>
        <th scope="col">Số lượng</th>
        <th scope="col" colspan="2">Hành động</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${product}" var = "p" varStatus="loop">
        <tr>
            <td>${loop.count}</td>
            <td>${p.name}</td>
            <td><img src="${p.image}}" alt="" style="width: 60px; height: 60px; border-radius: 4px"></td>
            <td>${p.price}</td>
            <td>${p.stock}</td>
            <td><a href="" class="btn btn-warning ">Sửa</a></td>
            <td><a href="" class="btn btn-danger" onclick="return confirm('Bạn có chắc chắn muốn xóa không')">Xóa</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
