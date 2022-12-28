<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>ĐĂNG KÝ</title>
    <link rel="stylesheet" href="index.css">
  </head>
  <body>
    <form action="/javaweb/dangky" method="post">
      <div class="form">
        <p> Tên đăng nhâp:</p><input class="username" placeholder="Username" name="username"><br>
        <br><p>Mật khẩu:</p><input class="password" placeholder="Password" name="password" type="password"><br>
        <br><p>Giới tính:</p><select class="gender" name="gender">
          <option value="Nam">Nam</option>
          <option value="Nu">Nữ</option>
          <option value="Khac">Khác</option>
        </select><br>
        <br><p>Ngày sinh:</p><input class="birthday" name="birthday" type="date">
        <br></br>
            <p>Tình trạng hôn nhân:</p><br>
            <input class="married" name="married" type="radio" value="Married"><span>Đã kết hôn</span><br>
            <input class="single" name="married" type="radio" value="Single"><span>Độc thân</span><br>
            <input class="diff" name="married" type="radio" value="Gay"><span>Khác</span><br>
        <br>
        <p>Sở thích:</p><br>
        <input class="read" name="hobbies" type="checkbox" value="Doc sach">Đọc sách
        <input class="travel" name="hobbies" type="checkbox" value="Du lich">Du lịch
        <input class="game" name="hobbies" type="checkbox" value="Choi game">Chơi game
        <input class="music" name="hobbies" type="checkbox" value="Am nhac">Âm nhạc<br>
        <input class="difference" name="hobbies" type="checkbox" value="Khac">Khác/Không có<br>
        <br><p>Quốc tịch:</p><input class="country" name="country" placeholder="Country"><br>
        <br><p>Ghi chú:</p>
        <br><textarea class="note" name="notes" rows="4" cols="60"></textarea><hr>
        <p>Admin co dep trai ko =))))</p><br>
          	<input name="A" type="radio">Có <br>
			<input name="B" type="radio">Đz VL<br>
			<input name="C" type="radio">Chắc chắn rồi<br>
          <br>
            <button class="sign-btn">Đăng ký</button>
            <button class="reset-btn" type="reset">Reset</button>  
      </div>
    </form>    
  </body>
</html>