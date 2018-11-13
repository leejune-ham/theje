package mvc.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import mvc.model.Stud;

@Controller
@RequestMapping("ppp/{userId}/aaa/{no}")
public class PathController {

	@ModelAttribute("st")
	Stud stud(@PathVariable String userId, @PathVariable int no) {
		Stud st = new Stud();
		st.setId(userId);
		st.setNo(no);
		return st;
	}
	
	@RequestMapping
	String view(@PathVariable String userId, @PathVariable int no) {
		
		System.out.println("view : " + userId + "," + no);
		
		return "path/view";
	}
	
	/*@RequestMapping 안됨. 모호한 매핑
	String view2(@PathVariable String userId, @PathVariable String no) {
		
		System.out.println("view : " + userId + "," + no);
		
		return "path/view";
	}*/
}
