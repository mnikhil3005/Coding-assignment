package com.assignment.task.config.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.client.RestTemplate;

/**
 * <p>
 * <code>ApplicationSecurity</code> is an application web security
 * configuration.
 */
@Configuration
public class ApplicationSecurity extends WebSecurityConfigurerAdapter {

    @Value("${spring.security.username}")
    private String username;

    @Value("${spring.security.password}")
    private String password;
    
    @Value("${spring.security.enable.path.patterns}")
    private String[] enablePathPatterns;

    @Value("${spring.security.disable.path.patterns}")
    private String[] disablePathPatterns;

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests().antMatchers(disablePathPatterns).permitAll().and().httpBasic();
//        http.csrf().disable();
//        //Disabling session creation for this configuration
//        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//    }
//
////    @Bean
////    @Override
////    public UserDetailsService userDetailsService() {
////        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
////        String encodedPassword = passwordEncoder().encode(password);
////        manager.createUser(User.withUsername(username).password(encodedPassword).roles("USER").build());
////        return manager;
////    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests().antMatchers("/").permitAll();
        http.csrf().disable();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
    @Bean
    public RestTemplate restTemplate() {
        SimpleClientHttpRequestFactory clientHttpRequestFactory = new SimpleClientHttpRequestFactory();
        return new RestTemplate(clientHttpRequestFactory);
    }
}