package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import page.LoginPage;

public class LoginSteps {
    private LoginPage page = new LoginPage();

    @Dado("que seleciono a opcao entrar")
    public void queSelecionoAOpcaoEntrar() {
        page.clicarEntrar();
    }
    @Dado("quando digito login corretamente")
    public void quandoDigitoLoginCorretamente() {
        page.escreverUsuario("fulano");
        page.escreverSenha("pass");
    }
    @Quando("clico em login")
    public void clicoEmLogin() {
        page.clicarLogin();
    }
    @Entao("verifico nome de perfil")
    public void VerificoNomeDePerfil() {
        Assert.assertTrue(page.retornarValor("fulano"));
        page.clicarSair();
    }
}
