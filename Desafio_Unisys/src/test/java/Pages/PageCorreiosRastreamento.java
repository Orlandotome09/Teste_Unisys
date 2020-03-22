package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Steps.TestRule;

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
    
    public static String VerificaData() throws InterruptedException {
    	//WebDriverWait wait= new WebDriverWait(ExpectedConditions.invisibilityOfElementLocated(By.id("DataEntrega")));
    	Thread.sleep(tempoMedioEspera);
    	String data = TestRule.getDriver().findElement(By.id("DataEntrega")).getText().trim();
        return data;
}
    
    public static String VerificaStatusInvalido() throws InterruptedException {
    	Thread.sleep(tempoMedioEspera);
    	String status = TestRule.getDriver().findElement(By.id("infoMensagem")).getText().trim();
        return status;
}
}


