package cc.pecid.blog.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter
{

    @Autowired
    private AuthFilter authFilter;

    @Autowired
    private AuthenticationEntryPoint authError;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/login").permitAll().anyRequest().authenticated();
        // .and()
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        // .and()
        http.exceptionHandling().authenticationEntryPoint(authError);
        http.headers().frameOptions().disable();

        

        http.addFilterBefore(authFilter, UsernamePasswordAuthenticationFilter.class);
    }
    
}
