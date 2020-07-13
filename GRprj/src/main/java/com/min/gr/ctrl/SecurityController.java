package com.min.gr.ctrl;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.min.gr.user.dto.UserLoginDTO;
import com.min.gr.user.model.IService_User;

public class SecurityController implements UserDetailsService{

	@Autowired
	private IService_User service;
		@Override
		public UserDetails loadUserByUsername(String user_id) throws UsernameNotFoundException{
			System.out.println(user_id+">>user_id");
			UserLoginDTO dto = service.login(user_id);
			System.out.println(dto+">>dto");

			Collection<SimpleGrantedAuthority> roles= new ArrayList<SimpleGrantedAuthority>();
			roles.add(new SimpleGrantedAuthority(dto.getUser_auth()));
			System.out.println(roles.toString().trim()+">>roles");
			
//			System.out.println(roles.toString());
			
			UserDetails user = new User(user_id, dto.getUser_password(), roles);
			System.out.println(user+">>user");
			return user;
		}
}
