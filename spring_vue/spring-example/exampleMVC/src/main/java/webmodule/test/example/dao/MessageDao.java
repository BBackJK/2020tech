package webmodule.test.example.dao;

import org.springframework.stereotype.Repository;

import webmodule.test.example.dto.MessageDto;

// 파일 시스템, 네트워크를 통해 다른 서비스 자원을 이용하는 것은
// 보통 Repository 어노테이션을 사용
@Repository
public class MessageDao {

	public void saveMessage(MessageDto message) {
		System.out.println("saved! : " + message.getText());
	}
}
