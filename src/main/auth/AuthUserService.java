package auth;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class AuthUserService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AuthUser authUser = new AuthUser("lixiaomeng", "$2a$10$Ltu8aAtD8KWj9dpVepB4XeY8/ZdglfwVAYw.gXsrjjY10jrdhDhFS");
        return authUser;
    }
    
}
