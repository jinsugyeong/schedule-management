package calendar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j2;


@Controller
@Log4j2
public class MainController {

	
	@GetMapping("/")	
	public String main(Model model) {
		
		model.addAttribute("title", "Shedule Management");
		
		log.info("2024-10-22 로그찍기~~~~~~~~~~~~");
		
		return "main";
	}
	
	
}
