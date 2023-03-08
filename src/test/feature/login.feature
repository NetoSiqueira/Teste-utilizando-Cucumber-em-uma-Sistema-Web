#language: pt

  Funcionalidade: Teste  da funcionalidade de login:
    1- Login com sucesso
    2 - Login invalido

    Contexto: Verificar se estou na pagina inicial
      Dado que esteja na pagina inicial

  Cenario: Funcionalidade logar com sucesso
    Dado que seleciono a opcao entrar
    E quando digito login corretamente
    Quando clico em login
    Entao verifico nome de perfil