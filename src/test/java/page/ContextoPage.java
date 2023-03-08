package page;

import base.BasePage;
import org.junit.Test;
import org.openqa.selenium.By;

public class ContextoPage extends BasePage {
    private EntradaPage page = new EntradaPage();

    public String verificarPaginaInicial(){

        return obterValorPorTexto(page.telaInicial);
    }
}
