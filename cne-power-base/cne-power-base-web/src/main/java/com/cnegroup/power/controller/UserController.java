package com.cnegroup.power.controller;

import com.cnegroup.power.dto.User;
import com.cnegroup.power.rest.UserRestService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangth
 */
@RestController
public class UserController implements UserRestService {

	@Override
	public User getUser() {
		User user = new User();
		user.setName("zhangsan");
		user.setAge(20);
		if (user.getAge() > 10) {
			System.out.println();
		} else {
			System.out.println();
		}
		return user;
	}

}
