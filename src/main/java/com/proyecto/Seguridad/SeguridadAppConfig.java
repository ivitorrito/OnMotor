
package com.proyecto.Seguridad;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
@Configuration
@EnableWebSecurity
public class SeguridadAppConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        
        UserBuilder usuarios = User.withDefaultPasswordEncoder();
       auth.inMemoryAuthentication().withUser(usuarios.username("admin").password("1234").roles("Administrador"));
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        
       http.authorizeRequests()
         .antMatchers("/login")
             .permitAll()
         .antMatchers("/**")
             .hasAnyRole("Administrador")
        .and()
              .formLogin()
              .loginPage("/login")
              .defaultSuccessUrl("/")
              .failureUrl("/login?error=true")
              .permitAll()
          .and()
              .logout()
              .logoutSuccessUrl("/login?logout=true")
              .invalidateHttpSession(true)
              .permitAll()
              .and()
              .csrf()
              .disable();
    }
    
}
