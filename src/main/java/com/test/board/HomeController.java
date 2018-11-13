package com.test.board;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("nick", "장동건");
		
		// 00~06시:새벽, 06~12:오전, 12~18:오후, 18~24:밤
		
		/*int hour = date.getHours();
		
		if(hour < 12) {
			model.addAttribute("hour", "아침");
		} else if(hour > 12 && hour < 18) {
			model.addAttribute("hour", "낮");
		} else {
			model.addAttribute("hour", "밤");
		}*/
		
		model.addAttribute("hour", "새벽,오전,오후,밤".split(",")[date.getHours()/6]);
		
		return "home";
	}
	
}
