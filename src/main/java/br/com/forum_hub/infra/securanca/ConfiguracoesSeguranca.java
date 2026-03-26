package br.com.forum_hub.infra.securanca;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration //Mostra pro spring que estamos trabalhando com segurança
@EnableWebSecurity
public class ConfiguracoesSeguranca {

    @Bean //Define que a seurança terá filtros, ou seja será STATELESS, não guardará sessão;
    public SecurityFilterChain filtrosSeguranca(HttpSecurity http) throws Exception {
        return http
                .sessionManagement(sm-> sm.sessionCreationPolicy(SessionCreationPolicy.STATELESS)) //Definel como Stateless, sem sessão;
                .csrf(csrf-> csrf.disable()) //Desabilita a proteção csrf;
                .build();
    }

    @Bean
    public PasswordEncoder encriptador(){
        return new BCryptPasswordEncoder();
    }
}
