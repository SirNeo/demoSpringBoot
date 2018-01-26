package es.jmpalma.demoSpringBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
 public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Hello World Spring Boot!";
	}
}
