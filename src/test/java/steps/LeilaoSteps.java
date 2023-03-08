package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import page.LeilaoPage;
import page.LoginPage;

public class LeilaoSteps {
    private LoginPage loginPage = new LoginPage();
    private LeilaoPage page = new LeilaoPage();


    @Dado("que seleciono a opcao novo leilao")
    public void queSelecionoAOpcaoNovoLeilao() {
        loginPage.clicarEntrar();
        loginPage.escreverUsuario("fulano");
        loginPage.escreverSenha("pass");
        loginPage.clicarLogin();
        page.botaoAdicionarLeilao();

    }
    @Dado("insiro nome valor e data de abertura")
    public void insiroNomeValorEDataDeAbertura() {
        page.adicionarLeilao("Teste", "10");
    }
    @Quando("Salvar")
    public void salvar() {
       page.salvarLeilao();
    }
    @Entao("verifico se o primeiro nome da lista corresponde ao adicionado")
    public void verificoSeOPrimeiroNomeDaListaCorrespondeAoAdicionado() {
        Assert.assertEquals("Leilão salvo com sucesso", page.verificarLeilaoSalvo());
        loginPage.clicarSair();
    }
}
