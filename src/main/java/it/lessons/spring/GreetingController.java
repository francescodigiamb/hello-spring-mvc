package it.lessons.spring;

import java.time.LocalTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping ("/")
public class GreetingController {

	@GetMapping ("/greeting")
	public String greeting (@RequestParam ("nome") String nome, Model model) {
		model.addAttribute("name", nome);
		model.addAttribute("time", LocalTime.now());
		return "greeting";
	}
	
}
