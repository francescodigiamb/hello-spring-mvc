package it.lessons.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping ("/")
	public String hello (@RequestParam ("nome") String nome) {
		return "Hello " + nome;
	}
}
