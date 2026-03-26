package br.com.forum_hub.controller;

import br.com.forum_hub.domain.autenticacao.DadosLogin;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticacaoController {

    private final AuthenticationManager authenticationManager;

    public AutenticacaoController(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    public ResponseEntity<Authentication> efetuarLogin(@Valid DadosLogin dados){
        var autenticationToken = new UsernamePasswordAuthenticationToken(dados.email(), dados.senha()); //Pega os dados, encapsula e faz com que o spring entenda o que é;
        var authentication = authenticationManager.authenticate(autenticationToken); //Pega os dados recebidos e autentica junto ao autenticationmanager;
        return ResponseEntity.ok(authentication); //Devolvemos o objeto validado
    }
}
