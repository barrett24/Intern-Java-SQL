package front.ctrl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sinc.intern.factory.BeanFactory;
import com.sinc.intern.util.Controller;
import com.sinc.intern.view.util.ModelAndView;

// 와일드카드 매핑을 통해 사용자에대한 응답을 하나로 모을 수 있다
@WebServlet("*.inc")
public class DispatcherServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// get이던 post이던 상관 없도록
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		requestProc(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		requestProc(request, response);
	}
	
	protected void requestProc(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		String uri = request.getRequestURI();
		System.out.println("client uri: " + uri);
		
		// 팩토리를 통해 컨트롤러 객체 생성, 실행 
		BeanFactory factory = BeanFactory.getInstance();
		Controller ctrl = factory.getBean(uri);
		
		ModelAndView mv = ctrl.execute(request, response);
		
		// forward 방식을 써야 데이터를 공유하기 좋다
		if (mv.isSend()) { // true라면 그대로, forward방식
			RequestDispatcher view = request.getRequestDispatcher(mv.getPath());
			view.forward(request, response);
		} else { // false라면 경로 재지정, redirect 방식
			response.sendRedirect(mv.getPath());
		}
	}
}
