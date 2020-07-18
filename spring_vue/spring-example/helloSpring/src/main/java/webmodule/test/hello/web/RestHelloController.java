package webmodule.test.hello.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class RestHelloController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping("/rest-welcome")
	public String hello() {
		logger.debug("rest hello controller logger test");
		return "Hello Spring!";
	}
}
