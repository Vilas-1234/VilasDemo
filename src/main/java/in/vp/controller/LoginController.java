package in.vp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.vp.dto.LoginRequestDto;
import in.vp.dto.LoginResponseDto;
import in.vp.main.service.LoginService;

@RestController
public class LoginController {
@Autowired
LoginService loginService;
@PostMapping("/login")
public LoginResponseDto loginuser(@RequestBody LoginRequestDto loginRequestDto) {
	
	return loginService.LoginUser(loginRequestDto);
}

}
