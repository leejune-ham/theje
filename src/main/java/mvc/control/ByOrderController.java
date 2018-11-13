package mvc.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mvc.model.ByOrder;

@Controller
@RequestMapping(value = "mvc/byOrder")
public class ByOrderController {

	@RequestMapping(method = RequestMethod.GET)
	public String get() {
		
		return "mvc/byOrderForm";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String post(ByOrder bo) {
		bo.execute();
		
		return "mvc/byOrderPost";
	}

}
