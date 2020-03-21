package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Steps.TestRule;

public class PageCalculoDePreçosEPrazosDeEntrega {

	  public static WebElement element;

	    public static int tempoCurtoEspera = 2000;
	    public static int tempoMedioEspera = 5000;
	    
	     public PageCalculoDePreçosEPrazosDeEntrega() {		
	        PageFactory.initElements(TestRule.getDriver(),this);
	     }
	     public static void AcessaUrl(String url) throws InterruptedException {
	         //  Actions actions = new Actions(TestRule.getDriver());
	           TestRule.getDriver().get(url);

	           WebDriverWait wait = new WebDriverWait(TestRule.getDriver(), 100);
	           Thread.sleep(tempoMedioEspera);
	       }
}
