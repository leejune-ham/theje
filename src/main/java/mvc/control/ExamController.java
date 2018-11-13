package mvc.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import mvc.model.Exam;

@Controller
public class ExamController {

	@RequestMapping(value = "mvc/first")
	public String first(Model model) {
		
		System.out.println("mvc/first ����?");
		model.addAttribute("st", new Exam("ù��°", 88,87,86));
		
		return "mvc/first";
	}
	
	@RequestMapping(value = "mvc/second")
	public ModelAndView second() {
		
		ModelAndView mv = new ModelAndView("mvc/second");
		// model.addAttribute("st", new Exam("����", 88,87,86));
		
		mv.addObject("st", new Exam("�ι�°", 83,72,61));
		
		return mv;
	}
	
	@RequestMapping(value = "mvc/third")
	public String third(@ModelAttribute("st") Exam st) {
		
		st.setName("����°");
		st.setJum(new int[] {28,67,96});
		
		return "mvc/third";
	}
	
	@RequestMapping(value = "mvc/four")
	public String four(@ModelAttribute("st") Exam st) {
		
		//st.setName("�׹�°");
		//st.setJum(new int[] {28,67,96});
		
		return "mvc/four";
	}
	
	@RequestMapping(value = "mvc/five", method=RequestMethod.GET)
	public String five() {
		
		return "mvc/five";
	}
	
	@RequestMapping(value = "mvc/five", method=RequestMethod.POST)
	public String fiveComplete(Exam st) {
		
		return "mvc/fiveReg";
	}
	
	/*@RequestMapping(value = "mvc/fiveReg", method=RequestMethod.POST)
	public String fiveReg(@ModelAttribute("st") Exam st) {
		
		return "mvc/fiveReg";
	}*/
}
