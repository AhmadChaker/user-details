package au.com.uniquewebsitehostname.userdetails.service;

import au.com.uniquewebsitehostname.userdetails.dataaccess.dao.IUserAuthRepository;
import au.com.uniquewebsitehostname.userdetails.dataaccess.entity.UserAuthEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAuthService implements org.springframework.security.core.userdetails.UserDetailsService {

    @Autowired
    private IUserAuthRepository userAuthRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserAuthEntity userAuthEntity = userAuthRepository.findByUsername(username);
        if(userAuthEntity ==null ) {
            // Todo throw exception user not found
        }

        SimpleGrantedAuthority authority  = new SimpleGrantedAuthority(userAuthEntity.getAuthorities());
        org.springframework.security.core.userdetails.User userDetail =
                new org.springframework.security.core.userdetails.User(userAuthEntity.getUsername(),
                        userAuthEntity.getPassword(), List.of(authority));
        return userDetail;
    }
}