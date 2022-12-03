<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Triangle</title>
</head>
<body>
<form action="/mo/tam-giac" method="post">
<input name="a" placeholder="Cạnh a?" pattern="[0-9]" title="nhap kieu so"><br>
<input name="b" placeholder="Cạnh b?" pattern="[0-9]" title="nhap kieu so"><br>
<input name="c" placeholder="Cạnh c?" pattern="[0-9]" title="nhap kieu so"><hr>
<button formaction="/mo/dien-tich">Tính diện tích</button>
<button formaction="/mo/chu-vi">Tính chu vi</button>
</form>
<h2>${message}</h3>
</body>
</html>