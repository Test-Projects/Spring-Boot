package nao.cycledev.springboot.config;

/*
import nao.cycledev.springboot.service.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration. EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration. WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@ComponentScan(basePackages = "nao.cycledev.springboot.service")
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private ReaderService readerService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
        .authorizeRequests()
          .antMatchers("/").permitAll()  //access("hasRole('READER')")
          .antMatchers("*/
/**").permitAll();

        */
/*.and()

           .formLogin()
             .loginPage("/login")
             .failureUrl("/login?error=true");*//*

    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //auth.userDetailsService(readerService);
    }
}*/
