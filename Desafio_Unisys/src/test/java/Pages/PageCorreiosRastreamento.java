package Pages;


import Steps.TestRule;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PageCorreiosRastreamento {

    public static WebElement element;

    public static int tempoCurtoEspera = 2000;
    public static int tempoMedioEspera = 5000;

    public PageCorreiosRastreamento(){
        PageFactory.initElements(TestRule.getDriver(),this);

        //Declaração de elementos na página
        element = TestRule.getDriver().findElement(By.id("btnFazerLogin"));

    }

    public static void AcessaUrl(String url) throws InterruptedException {
      //  Actions actions = new Actions(TestRule.getDriver());
        TestRule.getDriver().get(url);

        WebDriverWait wait = new WebDriverWait(TestRule.getDriver(), 100);
        Thread.sleep(tempoMedioEspera);
    }

    public static void AcessaItemMenuPrincipal(String nomeMenu) throws InterruptedException {
       //clicar na guia medico
        TestRule.getDriver().findElement(By.linkText(nomeMenu)).click();

        Thread.sleep(tempoMedioEspera);

        //confirmar se acesso a página
       // Assert.assertEquals(nomeMenu,TestRule.getDriver().findElement(By.cssSelector(".titulo-midia")).getAttribute("h1").toString());

        Thread.sleep(tempoMedioEspera);
    }

    public static void PesquisaPorTipoRecurso_Uf_Cidade(String tipoRecurso, String uf, String cidade) throws InterruptedException {
        //clica em busca detalhada
        TestRule.getDriver().findElement(By.id("busca_detalhada")).click();
        Thread.sleep(tempoMedioEspera);
        //confirma se o botão pesquisar está desabilitado.

        JavascriptExecutor jse = (JavascriptExecutor)TestRule.getDriver();
        jse.executeScript("window.scrollBy(0,250)");

        //preenche o combo uf e cidade
         TestRule.getDriver().findElement(By.id("react-select-2-input")).sendKeys(Keys.ENTER);
         TestRule.getDriver().findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);

        //confirmar se a unidade correta foi exibida
        //clica na unidade
        TestRule.getDriver().findElement(By.cssSelector(".margin-left:nth-child(2)")).click();
        Thread.sleep(tempoMedioEspera);

        //clica em pesquisar
        TestRule.getDriver().findElement(By.cssSelector(".btn-success")).click();

        //Confirma se o campo estado está preenchido,
        //caso não esteja preencher novamente
        TestRule.getDriver().findElement(By.id("react-select-4-input")).sendKeys(uf);
        TestRule.getDriver().findElement(By.id("react-select-4-input")).sendKeys(Keys.ENTER);
        Thread.sleep(tempoCurtoEspera);
        TestRule.getDriver().findElement(By.id("react-select-5-input")).sendKeys(uf);
        TestRule.getDriver().findElement(By.id("react-select-5-input")).sendKeys(Keys.ENTER);
        Thread.sleep(tempoCurtoEspera);
        TestRule.getDriver().findElement(By.cssSelector(".css-1thkkgx-indicatorContainer path")).click();
        TestRule.getDriver().findElement(By.id("react-select-10-input")).sendKeys(tipoRecurso);
        TestRule.getDriver().findElement(By.id("react-select-10-input")).sendKeys(Keys.ENTER);

        Thread.sleep(tempoMedioEspera);

        //clica em pesquisar

        TestRule.getDriver().findElement(By.id("btn_pesquisar")).click();
        Thread.sleep(tempoMedioEspera);
    }

    public static void PesquisaNomeNoResultado(String nomeMedico){
    String nomeAtual =   TestRule.getDriver().findElement(By.id("txt_nome_prestador")).getText();

        Assert.assertEquals(nomeMedico,nomeAtual);
    };

    public static void validaQuantidadeDeResultado(){
       //String qtd =   TestRule.getDriver().findElement(By.id("txt_resultado_encontrado")).getText();

    };


    public static void PesquisaEspecialidadeNoResultado(String especialidade) throws InterruptedException {
        Thread.sleep(tempoMedioEspera);
        String especialidadeAtual =   TestRule.getDriver().findElement(By.id("txt_especialidade")).getText();

        Assert.assertEquals(especialidade,especialidadeAtual);
    };

    public static void procuraCidadeResultado(String cidade,int qtdPagina) throws InterruptedException {
        Thread.sleep(tempoMedioEspera);



        for(int i=1;i<=qtdPagina;i++) {

            List<WebElement> elements =TestRule.getDriver().findElements(By.id("txt_endereco"));
            for (WebElement element : elements) {
               // Assert.assertEquals(cidade, element.getText());
            };
            TestRule.getDriver().findElement(By.cssSelector(".proximo>.icon-chevron-right")).click();;
        }
    };


}


