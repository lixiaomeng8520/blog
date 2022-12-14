package cc.pecid.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController
{
    
    @Autowired
    AuthenticationManager authenticationManager;

    @PostMapping("/login")
    public void login() {
        System.out.println("/login");

        // System.out.println(new BCryptPasswordEncoder().encode("111111"));

        // UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken("lixiaomeng", "111111");
        // Authentication authentication = authenticationManager.authenticate(authenticationToken);
        // SecurityContextHolder.getContext().setAuthentication(authentication);

        // System.out.println("认证成功");
        // System.out.println(SecurityContextHolder.getContext().getAuthentication().isAuthenticated());
        // Object user = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        // System.out.println("xxx");
    }

}
