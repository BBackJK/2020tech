package webmodule.test.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import webmodule.test.example.dto.UserDto;
import webmodule.test.example.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
		
//	@RequestMapping(value="/user/info", method=RequestMethod.GET)
//	public ModelAndView getUserInfo(@RequestParam("username") String username) {
//		
//		UserDto user = new UserDto();
//		user.setUsername(username);
//		
//		userService.save(user);
//		
//		// 생성자 인자로 view jsp template 이름을 지정해줘도 되지만
//		// mv.setViewName("userinfo")로도 설정이 가능하다
//		ModelAndView mv = new ModelAndView("userinfo");
//		
//		// 전달하려고 하는 값 추가
//		mv.addObject("username", username);
//		
//		return mv;
//	}
	
	// userform에 대한 메소드 삽입
	@RequestMapping(value="/user/form", method=RequestMethod.GET)
	public ModelAndView getUserForm() {
		
		ModelAndView mv = new ModelAndView("userform");
		
		// Spring은 user data를 view로 바로 바인딩할 수 있게 해준다.
		mv.addObject("user", new UserDto());
		
		return mv;
	}
	
	// form에서 데이터를 넘겨 줄 페이지 구현  
	@RequestMapping(value="/user/form", method=RequestMethod.POST)
	public String saveUser(UserDto user) {
		
		userService.save(user);
		
		return "redirect:userInfo?username="+user.getUsername();
	}
	
	// /user/form에서 받은 데이터를 리다이렉트할 페이지 구현
	@RequestMapping(value="/user/userInfo", method=RequestMethod.GET)
	public String userInfo(@RequestParam("username") String username, Model model) {
		
		model.addAttribute("username", username);
		
		return "userInfo";
	}
}
