package mvc.control;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelController {

	@RequestMapping(value="model/detail")
	String detail(Model model) {
		
		model.addAttribute("dd", "detail");
		return "model/view";
	}
	
	@ModelAttribute("fruit")
	List<String> fruit() {
		return Arrays.asList("사과,바나나,딸기,포도".split(","));
	}
	
	@RequestMapping(value="model/list")
	String list(Model model) {
		
		model.addAttribute("dd", "detail");
		return "model/view";
	}
	
	@RequestMapping(value="model/insert")
	String insert(Model model) {
		
		model.addAttribute("dd", "detail");
		return "model/view";
	}
	
}
