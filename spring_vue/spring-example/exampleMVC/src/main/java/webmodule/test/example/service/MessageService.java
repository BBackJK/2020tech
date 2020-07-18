package webmodule.test.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webmodule.test.example.dao.MessageDao;
import webmodule.test.example.dto.MessageDto;

// Component 말고 다른 bean 객체를 뜻하는 다른 어노테이션도 존재
// 특별한 기능이 더 있는것이 아니고 용도와 의미를 명확하게 하기 위해서 사용
// @Component
@Service
public class MessageService {
	@Autowired
	private MessageDao messageDao;
	
	public void save(String text) {
			MessageDto messageDto = new MessageDto();
			messageDto.setText(text);
			
			messageDao.saveMessage(messageDto);
	}
}
