<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Kết quả</title>
<link rel="stylesheet" href="index.css">
</head>
<body>
<ul>
<br>
</br>
<br>
</br>
<li>Tên đăng nhập: <b>${param.username}</b></li>
<li>Mật khẩu: <b>${param.password}</b></li>
<li>Giới tính: <b>${param.gender}</b></li>
<li>Ngày sinh: <b>${param.birthday}</b>
<li>Tình trạng hôn nhân: <b>${param.married}</b></li>
<li>Sở thích: <b>${hobbies}</b></li>
<li>Quốc tịch: <b>${param.country}</b></li>
<li>Ghi chú: <b>${param.notes}</b></li>
</ul>
</body>
</html>