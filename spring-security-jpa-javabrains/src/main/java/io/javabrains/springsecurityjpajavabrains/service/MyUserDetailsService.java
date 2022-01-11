package io.javabrains.springsecurityjpajavabrains.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import io.javabrains.springsecurityjpajavabrains.Entity.OrderDetail;
import io.javabrains.springsecurityjpajavabrains.Entity.User;
import io.javabrains.springsecurityjpajavabrains.dao.SheetRepository;
import io.javabrains.springsecurityjpajavabrains.dao.UserRepository;
import io.javabrains.springsecurityjpajavabrains.helper.Helper;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository repo;
	
	@Autowired
	private SheetRepository sheetRepository;

	@Autowired
	private PasswordEncoder encoder;

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = repo.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException(username);
		}
		return new MyUserDetails(user);

	}

	public User getValidation(User user) {

		if (!((user.getRname() == "") || (user.getUsername() == "") || (user.getUemail() == "")
				|| (user.getPassword() == "") || (user.getUmobile() == ""))) {

			user.setPassword(encoder.encode(user.getPassword()));

			return repo.save(user);
		} else {
			return null;
		}

	}
	
	public void save(MultipartFile file) {
		try {
		List<OrderDetail> doneSheet=Helper.convertExcelToList(file.getInputStream());
		
		this.sheetRepository.saveAll(doneSheet);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public List<OrderDetail> getAllsSheets(){
		
		return this.sheetRepository.findAll();
		
	}

}
