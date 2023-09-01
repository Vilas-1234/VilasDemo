package in.vp.main.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.vp.dto.LoginRequestDto;
import in.vp.dto.LoginResponseDto;
import in.vp.entity.User;
import in.vp.repository.UserRepository;


@Service
public class LoginServiceImpl implements LoginService{
@Autowired
UserRepository userRepository;
	@Override
	public LoginResponseDto LoginUser(LoginRequestDto loginRequestDto) {
		
		LoginResponseDto loginResponceDto=new LoginResponseDto();
		User user=userRepository.findByEmailAndPassword(loginRequestDto.getEmail(), loginRequestDto.getPassword());
		BeanUtils.copyProperties(user, loginResponceDto);
		return loginResponceDto;
	}

}
