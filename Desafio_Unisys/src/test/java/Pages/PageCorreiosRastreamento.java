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

    }

    public static void AcessaUrl(String url) throws InterruptedException {
      //  Actions actions = new Actions(TestRule.getDriver());
        TestRule.getDriver().get(url);

        WebDriverWait wait = new WebDriverWait(TestRule.getDriver(), 100);
        Thread.sleep(tempoMedioEspera);
    }

    public static void Objeto(String objeto) throws InterruptedException {
         TestRule.getDriver().findElement(By.id("objetos")).sendKeys(objeto);
}
    
    
    public static void BotaoBuscar() {
        TestRule.getDriver().findElement(By.id("btnPesq")).click();
}
    
    public static void VerificaData() {
        TestRule.getDriver().findElement(By.id("DataEntrega")).getText();
}
    
}


