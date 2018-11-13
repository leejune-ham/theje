package mvc.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class EventExpireChk extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		
		String url = request.getContextPath() + "/interceptor/event";
		
		HttpSession session = request.getSession();
		
		System.out.println("in1:"+url);
		System.out.println(request.getRequestURI());
		if(request.getRequestURI().equals(url) && session.getAttribute("pid") == null) {
			response.sendRedirect("expire");
			return false;
		}
		return true;
	}
}
