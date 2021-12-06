package casestudy.furama4.service;



import casestudy.furama4.config.UserDetail;
import casestudy.furama4.models.Role;
import casestudy.furama4.models.User;
import casestudy.furama4.repository.RoleRepository;
import casestudy.furama4.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
       //Tìm đối tượng đang đăng nhập trong DB
        User user = this.userRepository.findByUsername(userName);

        if (user == null) {
            throw new UsernameNotFoundException("User " + userName + " was not found in the database");
        }
        return new UserDetail(user);
    }

}