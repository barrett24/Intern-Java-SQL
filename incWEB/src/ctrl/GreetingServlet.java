package ctrl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/greeting.do")
public class GreetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// 생성자의 역할, 한번만 만들어짐 (싱클턴의 개념)
	// 서버가 재기동 되거나 시간이 지나고 열면 다시 호출
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init");
	}
	
	// 메모리 해제
	public void destroy() {
		System.out.println("destroy");
	}
	
	
	// 사용자에게 보여지는 부분
	// get과 post의 차이
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		System.out.println("doGet-reStart");
		/*
		 * System.out.println("doGet-reStart");
		 * response.setContentType("text/html;charset=utf-8"); PrintWriter out =
		 * response.getWriter(); out.print("<html>"); out.print("<body>");
		 * out.print("<div align='center'> 뭐이 중헌디 </div>"); out.print("</body>");
		 * out.print("</html>"); out.close();
		 */
		//response.sendRedirect("greeting.jsp");
		RequestDispatcher view = request.getRequestDispatcher("greeting.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		System.out.println("doPost");
	}

}
