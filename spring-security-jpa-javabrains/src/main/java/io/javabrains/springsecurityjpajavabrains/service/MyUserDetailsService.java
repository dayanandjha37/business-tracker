package io.javabrains.springsecurityjpajavabrains.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import io.javabrains.springsecurityjpajavabrains.Entity.User;
import io.javabrains.springsecurityjpajavabrains.dao.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository repo;
	
	@Autowired
	private PasswordEncoder encoder;
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = repo.findByUsername(username);

		if (user == null)
			throw new UsernameNotFoundException(username);

		return new MyUserDetails(user);

	}

	public User getValidation(User user) {
		
		if (!((user.getRname() == "") || (user.getUsername() == "") || (user.getUemail() == "") || (user.getPassword() == "")
				|| (user.getUmobile() == ""))) {

        user.setPassword(encoder.encode(user.getPassword()));
	
			return repo.save(user); 
		} else {
			return null;
		}

	}

}
