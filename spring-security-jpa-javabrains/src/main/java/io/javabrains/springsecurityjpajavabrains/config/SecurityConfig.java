package io.javabrains.springsecurityjpajavabrains.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import io.javabrains.springsecurityjpajavabrains.service.MyUserDetailsService;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


	@Autowired
	private MyUserDetailsService myUserDetailsService;



	

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(myUserDetailsService);

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.csrf().disable().authorizeRequests()
		.antMatchers("/secured/**").hasAnyAuthority("ADMIN", "MANAGER", "USER")
		.antMatchers("/").permitAll().and().formLogin()
		.loginPage("/login").defaultSuccessUrl("/secured/home", true).permitAll().and().logout();

	
	}

	@Bean
	public PasswordEncoder encoder() {

		return new BCryptPasswordEncoder();
	}

}
