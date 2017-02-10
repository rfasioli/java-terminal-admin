package br.inf.orion.eSafe.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

import br.inf.orion.eSafe.service.CustomUserDetailsService;

@Configuration
@EnableWebSecurity 
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

//    @Autowired
//    @Qualifier("customUserDetailsService")
    UserDetailsService userDetailsService;
     
    @Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
    	userDetailsService = new CustomUserDetailsService();
        auth.userDetailsService(userDetailsService);
    }
     
    @Override
    protected void configure(HttpSecurity http) throws Exception {
  
      http.authorizeRequests()
        .antMatchers("/", "/home").permitAll() 
        .antMatchers("/service/**").permitAll() //.authenticated()
        .antMatchers("/management/**").access("hasRole('ADMIN')")
        .antMatchers("/system/**").access("hasRole('ADMIN')")
        .antMatchers("/monitoring/**").access("hasRole('ADMIN') or hasRole('USER')")
        .antMatchers("/query/**").access("hasRole('ADMIN') or hasRole('USER')")
        .antMatchers("/report/**").access("hasRole('ADMIN') or hasRole('USER')")
        .and().formLogin().loginPage("/login")
        .usernameParameter("ssoId").passwordParameter("password")
        .and().csrf()        
        .and().exceptionHandling().accessDeniedPage("/Access_Denied");
    }
  
}
