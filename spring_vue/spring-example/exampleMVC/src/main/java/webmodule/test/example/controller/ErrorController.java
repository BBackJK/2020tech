package webmodule.test.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/error")
@Controller
public class ErrorController {
	
	@ExceptionHandler(Exception.class)
	public String handleError(HttpServletRequest request, Exception e) {
		
		return "error";
	}
}
