package br.inf.orion.eSafe.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity 
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("user").password("user123").roles("USER");
        auth.inMemoryAuthentication().withUser("admin").password("admin123").roles("ADMIN");
    }
     
    @Override
    protected void configure(HttpSecurity http) throws Exception {
  
      http.authorizeRequests()
        .antMatchers("/", "/home").permitAll() 
        .antMatchers("/service/**").permitAll()
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
