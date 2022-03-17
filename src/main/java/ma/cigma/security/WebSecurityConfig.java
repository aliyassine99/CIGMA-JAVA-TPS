package ma.cigma.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    PasswordEncoder passwordEncoder;


    @Override
    protected void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        authenticationManagerBuilder
                .inMemoryAuthentication()
                .passwordEncoder(passwordEncoder)
                .withUser("user").password(passwordEncoder.encode("123456")).roles("USER")
                .and()
                .withUser("admin").password(passwordEncoder.encode("123456")).roles("ADMIN");

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        /*
        * ADMIN : PEUT
        ★ AFFICHER LA LISTE DES CLIENTS
        ★ SUPPRIMER DES CLIENTS
           USER : PEUT
        ★ AFFICHER LA LISTE DES CLIENTS
        ★ AJOUTER DES CLIENTS
        ★ MODIFIER DES CLIENTS
        ★ AFFICHER UN CLIENT
        *
        * */
        http
                .authorizeRequests()
                .antMatchers(
                        "/add-client","/show-client/**"
                )
                .hasRole("USER")
                .antMatchers(
                        "/delete-client/**"
                )
                .hasRole("ADMIN")
                .antMatchers(
                        "/clients","/"
                )
                .permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .formLogin()
                .defaultSuccessUrl("/clients");

    }
}
