SPRING SECURITY

1)	Você vai aprender:
- Utilizar o Spring Security em API’s REST
- Explorar as diferenças na segurança das aplicações web e API’s
- Utilizar a biblioteca JWT para gerar tokens de acesso;
- Conhecer os refresh tokens;
- Configurar diferentes estilos de relacionamentos de perfis com usuários – diferentes perfis, perfis com hierarquia, etc;
- Tratar corretamente erros HTTP de segurança;



Passos:

1) Definir usuários: Criar uma classe usuário, implementando o UserDetails, migration no banco inserindo usuários;
 	- Criar o Usuario e seus atributos implementando UserDetails(mostra pro spring que haverá usuário);
 	- UserService – Cria a camada de serviço implementando o UserDetailsService – sobrepondo o método loadByUserName;
 	- Define o UsuarioRepository – criar o método findByEmailIgnoreCase – para que possamos encontrar o usuário pelo email;

2) DEFINIR COMO O USUÁRIO LOGARÁ – servirá para autenticar e gerar token;
 	- Primeiro: Criar uma rota de login através de um controller;


Continuar da uala 2. Diferenciando a seguranã de APIs – aula 04

