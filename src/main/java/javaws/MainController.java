package javaws;
import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Servlet Mappings đến /dangky
@WebServlet("/dangky")
public class MainController extends HttpServlet{
	
	//parameter
	public String username;
	public String password;
	public String gender;
	public String birthday;
	public String married;
	public String country;
	public String notes;
	public String[] hobbies;
	public StringBuilder hobbylist;
	
	//doGet
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			//truy cập dangky.jsp
			req.getRequestDispatcher("/views/dangky.jsp").forward(req, resp);
	}
	
	//doPost
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 username = req.getParameter("username");
		 password = req.getParameter("password");
		 gender = req.getParameter("gender");
		 birthday = req.getParameter("birthday");
		 married = req.getParameter("married");
		 country = req.getParameter("country");
		 notes = req.getParameter("notes");
		 hobbies = req.getParameterValues("hobbies");
		 hobbylist = new StringBuilder();
		 for(String hobby:hobbies) {
			 	hobbylist.append(hobby + ", ");
			}
			
		 System.out.println("\n\nĐĂNG KÝ THÀNH CÔNG!!!");	
		 System.out.println(">>Tên đăng nhập: " + username);
		 System.out.println(">>Mật khẩu: " + password);
		 System.out.println(">>Giới tính: " + gender);
		 System.out.println(">>Ngày sinh: " + birthday);
		 System.out.println(">>Tình trạng hôn nhân: " + married);
		 System.out.println(">>Sở thích: " + hobbylist);
		 System.out.println(">>Quốc tịch: " + country);
		 System.out.println(">>Notes: " + notes);
		 req.setAttribute("username",":"+ username);
		 req.setAttribute("password",":"+ password);
		 req.setAttribute("gender",":"+ gender);
		 req.setAttribute("birthday", ","+ birthday);
		 req.setAttribute("married",":"+ married);
		 req.setAttribute("conntry",":"+ country);
		 req.setAttribute("notes",":"+ notes);
		 req.setAttribute("hobbies",": " + hobbylist.toString());
		 
		 //truy cập dangkydone.jsp trả về kết quả đã nhập
		 req.getRequestDispatcher("/views/dangkydone.jsp").forward(req, resp);
		 
		 //Constructor 
		 Account account = new Account(username, password, gender, birthday, married, country,
				 notes, hobbylist);
		 
		 //Lưu và hiện thị danh sách trong database
		 DAO.addAccount(account);
		 DAO.getListAccount();
		}
	 
	//doFilter
	public void doFilter(HttpServletRequest req, HttpServletResponse resp, FilterChain chain)
				throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		chain.doFilter(req, resp);
	 }
}
