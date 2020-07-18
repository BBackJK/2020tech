package webmodule.test.hello.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspHelloController {

	@RequestMapping("/jsp-welcome")
	public String hello() {
		return "hello";
	}
}
