package in.vp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.vp.dto.UserDto;
import in.vp.entity.User;
import in.vp.main.service.UserService;
import jakarta.validation.Valid;

@RestController
public class UserController {
@Autowired
 UserService  userservice;

@PostMapping("/register")
public User adduser(@RequestBody @Valid UserDto userdto) {
	
	User user=userservice.AddUser(userdto);
	return user;
}
	
	
}
