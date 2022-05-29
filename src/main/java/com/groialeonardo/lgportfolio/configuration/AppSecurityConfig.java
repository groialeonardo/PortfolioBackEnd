
package com.groialeonardo.lgportfolio.configuration;

import com.groialeonardo.lgportfolio.repository.IUserRepository;
import com.groialeonardo.lgportfolio.security.jwt.JwtTokenFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {
    
    @Autowired
    private IUserRepository userRepository;
    
    @Autowired
    private JwtTokenFilter jwtTokenFilter;
    
    @Bean
    PasswordEncoder passwordEncoder() {
	return new BCryptPasswordEncoder();
    }
    
    @Override
    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(username -> userRepository.findByEmail(username)
            .orElseThrow(() -> new UsernameNotFoundException("No user"))
        );        
    }
    
    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
    
    @Override
    public AuthenticationManager authenticationManager() throws Exception {
        return super.authenticationManager();
    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.cors();
	http.csrf().disable()
            .authorizeRequests().antMatchers(HttpMethod.GET, "/**").permitAll() 
            .antMatchers(HttpMethod.POST, "/login").permitAll()
            .anyRequest().authenticated().and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        
        http.addFilterBefore(jwtTokenFilter, UsernamePasswordAuthenticationFilter.class);
		
	}    
    
}
