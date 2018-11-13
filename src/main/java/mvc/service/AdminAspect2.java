package mvc.service;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AdminAspect2 {

	@Pointcut("execution(* mvc.control.admin.MainController.(..))")
	void toonAlla() {
		
	}
	
	HttpSession session;
	HttpServletResponse response;
	@Around("toonAlla()")
	Object loginAround(ProceedingJoinPoint joinPoint) throws Throwable {
		Object res = null;
		
		System.out.println("loginAround() 실행!!");
		
		for(Object obj : joinPoint.getArgs()) {
			if(obj instanceof HttpSession) {
				session = (HttpSession) obj;
			}
			if(obj instanceof HttpServletResponse) {
				response = (HttpServletResponse) obj;
			}
		}
		
		if(session.getAttribute("pid") == null) {
			System.out.println("세션이 없음");
			response.sendRedirect("/board/");
			return res;
		}
		System.out.println("세션이 있음");
		res = joinPoint.proceed();
		
		return res;
	}
	
}
