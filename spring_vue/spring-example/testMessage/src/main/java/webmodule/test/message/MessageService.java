package webmodule.test.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageService {
	
	private MessageRepository repository;
	
	// @Autowired를 이용하여 자신인 MessageService도 bean 객체이고
	// 자신의 생성자의 파라미터인 MessageRepository로 bean 객체인 것을 알림.
	public MessageService(@Autowired MessageRepository repository) {
		this.repository = repository;
	}
	
	public void save(String text) {
		this.repository.saveMessage(new Message(text));
	}
}
