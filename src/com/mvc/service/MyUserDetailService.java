package com.mvc.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mvc.dao.UserRoleDAO;
import com.mvc.dao.UsersDAO;
import com.mvc.model.UserRole;

@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class MyUserDetailService implements UserDetailsService {

	@Autowired
	UserRoleDAO userRoleDao;

	@Autowired
	UsersDAO userDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		com.mvc.model.User user = userDao.findById(username).orElseThrow(EntityNotFoundException::new);
		List<GrantedAuthority> authorities = buildUserAuthority(user.getUserRole());
		return buildUserForAuthentication(user, authorities);
		
	}

	private User buildUserForAuthentication(com.mvc.model.User user,	List<GrantedAuthority> authorities) {
			return new User(user.getUsername(), user.getPassword(),	user.isEnabled(), true, true, true, authorities);
		}

	private List<GrantedAuthority> buildUserAuthority(Set<UserRole> userRoles) {

		Set<GrantedAuthority> setAuths = new HashSet<>();

		// Build user's authorities
		for (UserRole userRole : userRoles) {
			setAuths.add(new SimpleGrantedAuthority(userRole.getRole()));
		}

		List<GrantedAuthority> result = new ArrayList<>(setAuths);

		return result;
	}

}
