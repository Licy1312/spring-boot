package com.boot.baofoo;

import com.boot.baofoo.mapper.IUserMapper;
import com.boot.baofoo.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired
	private IUserMapper userMapper;

	@Test
	public void contextLoads() {
		User user = new User();
		user.setUserName("Jinmu");
		user.setPassword("14qed34j45h4401$mr90B92");
		user.setUserType("1");
		userMapper.addUser(user);
	}

}
