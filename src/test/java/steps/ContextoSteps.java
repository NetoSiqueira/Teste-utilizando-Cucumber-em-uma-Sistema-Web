package steps;

import io.cucumber.java.pt.Dado;
import org.junit.Assert;
import page.ContextoPage;

public class ContextoSteps {
    private ContextoPage page = new ContextoPage();

    @Dado("que esteja na pagina inicial")
    public void queEstejaNaPaginaInicial() {
        Assert.assertEquals(page.verificarPaginaInicial(), "Leilões cadastrados");
    }
}
