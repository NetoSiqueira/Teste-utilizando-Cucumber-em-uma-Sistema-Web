package page;

import org.openqa.selenium.By;

public class EntradaPage  {

    public final By entrar = By.linkText("Entrar");
    public final By usuario = By.xpath("//input[@name='username']");
    public final By senha = By.xpath("//input[@name='password']");
    public final By botaoLogin = By.xpath("//button[@class='btn btn-primary']");

    public final By telaInicial =  By.xpath("//h1[@class='display-7 text-center']");

    public final By sair = By.linkText("Sair");

    public final By adicionarLeilao = By.linkText("Novo Leilão");

    public final By adicionarNome = By.id("nome");

    public final By adicionarValor = By.id("valorInicial");

    public final By adicionarData = By.id("dataAbertura");

    public final By salvar = By.id("button-submit");

    public final By alertaLeilao = By.xpath("//div[@class ='alert alert-primary']");




}
