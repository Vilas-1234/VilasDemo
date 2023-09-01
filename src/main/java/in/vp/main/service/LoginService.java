package in.vp.main.service;

import in.vp.dto.LoginRequestDto;
import in.vp.dto.LoginResponseDto;

public interface LoginService {

	public LoginResponseDto LoginUser(LoginRequestDto loginRequestDto);

}
