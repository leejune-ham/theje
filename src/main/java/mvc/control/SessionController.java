package mvc.control;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SessionController {

	@RequestMapping("session/make")
	String make(HttpSession session) {
		
		session.setAttribute("pid", "aaa");
		session.setAttribute("title", "세션생성");
		return "session/view";
	}
	
	@RequestMapping("session/view")
	String view(HttpSession session) {
		
		System.out.println("pid : " + session.getAttribute("pid"));
		session.setAttribute("title", "세션보기");
		return "session/view";
	}
	
	@RequestMapping("session/modify")
	String modify(HttpSession session) {
		
		session.setAttribute("pid", "bbb");
		session.setAttribute("title", "세션수정");
		return "session/view";
	}
	
	@RequestMapping("session/delete")
	String delete(HttpSession session) {
		
		session.setAttribute("title", "세션삭제");
		session.invalidate(); // 모든 세션 초기화
		return "session/view";
	}
}
