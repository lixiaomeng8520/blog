package cc.pecid.blog.auth;

import java.io.IOException;
import java.util.Collections;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class AuthFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        System.out.println("AuthFilter");
        // User user = new User("lixiaomeng", "", Collections.emptyList());
        // Authentication authentication = new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());

        // System.out.println(authentication.isAuthenticated());
        // SecurityContextHolder.getContext().setAuthentication(authentication);
        
        filterChain.doFilter(request, response);
        
    }
    
}
