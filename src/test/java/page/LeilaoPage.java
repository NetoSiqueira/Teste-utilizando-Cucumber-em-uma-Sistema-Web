package page;

import base.BasePage;
import utils.DataUtils;

import java.util.Date;

import static utils.DataUtils.obterDataFormatada;

public class LeilaoPage extends BasePage {
    private EntradaPage page = new EntradaPage();

    public void botaoAdicionarLeilao(){
        clicar(page.adicionarLeilao);
    }

    public void adicionarLeilao(String nome, String valor){
        escreve(page.adicionarNome, nome);
        escreve(page.adicionarValor, valor);
        escreve(page.adicionarData,obterDataFormatada(new Date()));
    }

    public void salvarLeilao(){
        clicar(page.salvar);
    }

    public String verificarLeilaoSalvo(){
        return obterValorPorTexto(page.alertaLeilao);
    }

}
