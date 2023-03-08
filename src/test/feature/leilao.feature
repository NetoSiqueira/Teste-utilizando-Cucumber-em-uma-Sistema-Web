#language: pt
  Funcionalidade: Teste da funcionalidade de leilao, onde vai testar 3 sendo elas:
    1- Adicionar um leilao
    2- Editar o Leilao
    3- Dar um lance

    Contexto: Verificar se estou na pagina inicial
      Dado que esteja na pagina inicial

  Cenario: Funcionalidade de criar um novo leilao
    Dado que seleciono a opcao novo leilao
    E insiro nome valor e data de abertura
    Quando Salvar
    Entao verifico se o primeiro nome da lista corresponde ao adicionado