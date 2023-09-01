package in.vp.main.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.vp.dto.UserDto;
import in.vp.entity.User;
import in.vp.repository.UserRepository;
import jakarta.validation.Valid;
@Service
public class UserServiceImpl implements UserService {
@Autowired
UserRepository userRepository;
	@Override
	public User AddUser(@Valid UserDto userdto) {
		User user=new User();
		BeanUtils.copyProperties(userdto, user);
	
		user =  userRepository.save(user);
	
		return user;
		
	}

}
