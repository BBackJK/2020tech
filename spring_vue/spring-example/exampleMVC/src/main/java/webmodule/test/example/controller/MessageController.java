package webmodule.test.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import webmodule.test.example.dto.MessageDto;
import webmodule.test.example.dto.MessageResultDto;
import webmodule.test.example.service.MessageService;

@RestController
public class MessageController {

	// MessageService를 Service 어노테이션으로  
	// bean 객체로 선언한 후 wiring 시킨다.
	@Autowired
	private MessageService messageService;
	
	// get일 때만 동작
//	@RequestMapping(value="/message/save", method= RequestMethod.GET)
//	@ResponseBody
//	public MessageResultDto saveMessage(@RequestParam("msg") String msg) {
//		messageService.save(msg);
//		
//		MessageResultDto resultDto = new MessageResultDto();
//		resultDto.setInput(msg);
//		resultDto.setOutput("Hello, " + msg);
//		
//		return resultDto;
//	}
	
	@RequestMapping(value="/message/save", method= RequestMethod.POST)
	@ResponseBody
	public MessageResultDto saveMessage(@RequestBody MessageDto message) {
		
		MessageResultDto resultDto = new MessageResultDto();
		resultDto.setInput(message.getText());
		resultDto.setOutput("Hello, " + message.getText());
		
		return resultDto;
	}
}
