package webmodule.test.example.dao;

import org.springframework.stereotype.Repository;

import webmodule.test.example.dto.UserDto;

@Repository
public class UserDao {

	public int saveUser(UserDto user) {
		
		System.out.println("Saved! : " + user);
		
		// 보통 DAO는 저장이나 업데이트 같은 경우는 1(성공)이나 0(실패)를 반환
		return 1;
	}
}
