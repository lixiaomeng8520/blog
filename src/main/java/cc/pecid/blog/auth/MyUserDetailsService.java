package cc.pecid.blog.auth;

import java.util.Collections;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MyUserDetailsService implements UserDetailsService
{

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("MyUserDetailsService");
        User user = new User("lixiaomeng", "$2a$10$Ltu8aAtD8KWj9dpVepB4XeY8/ZdglfwVAYw.gXsrjjY10jrdhDhFS", Collections.emptyList());
        
        return user;
    }
    
    
}
