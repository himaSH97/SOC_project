package com.mash.project_mark_2.services;

import com.mash.project_mark_2.UserPrincipal;
import com.mash.project_mark_2.models.User;
import com.mash.project_mark_2.repositories.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserPrincipleDetailService implements UserDetailsService {

    private UserRepository userRepository;

    public UserPrincipleDetailService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user= this.userRepository.findByEmail(s);
        UserPrincipal userPrinciple =new UserPrincipal(user);
        return userPrinciple;
    }
}
