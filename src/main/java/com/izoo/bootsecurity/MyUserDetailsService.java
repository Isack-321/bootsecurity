package com.izoo.bootsecurity;

import com.izoo.bootsecurity.Model.MyUserDetails;
import com.izoo.bootsecurity.Model.UserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;


    @Override
    public MyUserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional <UserDetail> user = userRepository.findByUserName( userName);
        user.orElseThrow(()->new UsernameNotFoundException("not found"+ userName));
        return user.map(MyUserDetails::new).get();
    }
}
