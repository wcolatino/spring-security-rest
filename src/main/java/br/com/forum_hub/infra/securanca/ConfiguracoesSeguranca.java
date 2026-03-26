package br.com.forum_hub.infra.securanca;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration //Mostra pro spring que estamos trabalhando com segurança
@EnableWebSecurity
public class ConfiguracoesSeguranca {

    @Bean
    public PasswordEncoder encriptador(){
        return new BCryptPasswordEncoder();
    }
}
