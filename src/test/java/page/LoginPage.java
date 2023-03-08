package page;

import base.BasePage;

public class LoginPage extends BasePage {
    private EntradaPage page = new EntradaPage();

    public void clicarEntrar(){
        clicar(page.entrar);
    }
    public void escreverUsuario(String usuario){
        escreve(page.usuario, usuario);
    }

    public void escreverSenha(String senha){
        escreve(page.senha, senha);
    }

    public void clicarLogin(){
        clicar(page.botaoLogin);
    }

    public Boolean retornarValor(String valor){
        return obterValorExistente(valor);
    }

    public void clicarSair(){
        clicar(page.sair);
    }
}
