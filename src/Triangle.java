import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet({"/tam-giac", "/dien-tich", "/chu-vi"})
public class Triangle extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {
	req.getRequestDispatcher("/views/tam-giac.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			double a = Double.parseDouble(req.getParameter("a"));
			double b = Double.parseDouble(req.getParameter("b"));
			double c = Double.parseDouble(req.getParameter("c"));
			//Tính chỉ số của tam giác
			if( (a + b > c) && (a + c > b) && (b + c > a) ) {
				double chuVi = (a + b + c);
				String uri = req.getRequestURI();
				if(uri.contains("dien-tich")) { // [Tính diện tích].Click
				double dienTich = Math.sqrt(chuVi * (a + b - c) * (a + c - b) * (b + c - a))/4;
				req.setAttribute("message", "Diện tích của tam giác là: " + dienTich);
				}
				else if(uri.contains("chu-vi")){ // [Tính chu vi].Click
				req.setAttribute("message", "Chu vi của tam giác là: " + chuVi);
				}
			}
			else {
			req.setAttribute("message",
			"Độ dài các cạnh không hợp lệ!");
			}
			req.getRequestDispatcher("/views/tam-giac.jsp").forward(req, resp);
			
			}
	public void doFilter(HttpServletRequest req, HttpServletResponse resp, FilterChain chain)
			throws ServletException, IOException {
			req.setCharacterEncoding("UTF-8");
			chain.doFilter(req, resp);
	}
}

