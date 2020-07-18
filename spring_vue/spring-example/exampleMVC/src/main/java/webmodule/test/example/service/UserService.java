package webmodule.test.example.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webmodule.test.example.dao.UserDao;
import webmodule.test.example.dto.UserDto;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public boolean save(UserDto user) {
		
		String uuid = UUID.randomUUID().toString();
		
		user.setGuid(uuid);
		
		int affected = userDao.saveUser(user);
		
		return affected > 0 ? true: false;
	}
}
