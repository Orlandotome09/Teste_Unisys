package Pages;

import java.awt.Checkbox;
import java.util.List;
import java.util.Set;
import java.util.Iterator;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Steps.TestRule;

public class PageCalculoDePreçosEPrazosDeEntrega {

	  public static WebElement element;

	    public static int tempoCurtoEspera = 2000;
	    public static int tempoMedioEspera = 5000;
	    public static int tempoLongoEspera = 10000;
	    
	     public PageCalculoDePreçosEPrazosDeEntrega() {		
	        PageFactory.initElements(TestRule.getDriver(),this);
	     }
	     public static void AcessaUrl(String url) throws InterruptedException {
	         //  Actions actions = new Actions(TestRule.getDriver());
	           TestRule.getDriver().get(url);

	           WebDriverWait wait = new WebDriverWait(TestRule.getDriver(), 100);
	           Thread.sleep(tempoMedioEspera);
	       }
	     
	     public static void CepOrigem(String cepOrigem) throws InterruptedException {
	    	 Thread.sleep(tempoCurtoEspera);
	    	 TestRule.getDriver().findElement(By.xpath("//input[@name='cepOrigem']")).sendKeys(cepOrigem);
	}
	     public static void CepDestino(String cepDest) throws InterruptedException {
	    	 Thread.sleep(tempoCurtoEspera);
	    	 TestRule.getDriver().findElement(By.xpath("//input[@name='cepDestino']")).sendKeys(cepDest);
	}
	     
	     public static void SelecionaSedex(String tipo) throws InterruptedException {    
	    	 Thread.sleep(tempoMedioEspera);
	         WebElement TipoServico = TestRule.getDriver().findElement(By.name("servico"));
	         Select combo = new Select(TipoServico);
	         combo.selectByVisibleText(tipo);
	         
	}
	     
	   public static void ClicaFormatoCaixa() throws InterruptedException {
	    	 Thread.sleep(tempoCurtoEspera);
	    	 TestRule.getDriver().findElement(By.cssSelector(".caixa")).click();
	}

	   public static void SelecionaEmbalagem(String embalagem) throws InterruptedException {    
	    	 Thread.sleep(tempoMedioEspera);
	         WebElement TipoEmbalagem = TestRule.getDriver().findElement(By.name("embalagem1"));
	         Select combo = new Select(TipoEmbalagem);
	         combo.selectByVisibleText(embalagem);
	         
	}
	   
	   public static void PreencheLargura(String largura) throws InterruptedException {
	    	 Thread.sleep(tempoCurtoEspera);
	    	 TestRule.getDriver().findElement(By.cssSelector("#spanLargura .f2col")).sendKeys(largura);
	}

	   public static void PreencheAltura(String Altura) throws InterruptedException {
	    	 Thread.sleep(tempoCurtoEspera);
	    	 TestRule.getDriver().findElement(By.cssSelector("#spanAltura .f2col")).sendKeys(Altura);
	}
	   public static void PreencheComprimento(String Comprimento) throws InterruptedException {
	    	 Thread.sleep(tempoCurtoEspera);
	    	 TestRule.getDriver().findElement(By.cssSelector("#spanComprimento2 .f2col")).sendKeys(Comprimento);
	}
	   
	   public static void SelecionaOPesoDaEmbala(String Peso) throws InterruptedException {    
	    	 Thread.sleep(tempoMedioEspera);
	         WebElement PesoEmbalagem = TestRule.getDriver().findElement(By.name("peso"));
	         Select combo = new Select(PesoEmbalagem);
	         combo.selectByVisibleText(Peso);
	         
	}
	   
	   public static void SelecionaEmMaosProprias(String EmMaos) throws InterruptedException {    
	    	 Thread.sleep(tempoMedioEspera);
	    	TestRule.getDriver().findElement(By.id("spanMaoPropria")).click();
	    	Assert.assertTrue(TestRule.getDriver().findElement(By.name("MaoPropria")).isSelected());
	         
	}
	   
	   public static void ClicaNoCalcular() throws InterruptedException {
	    	 Thread.sleep(tempoCurtoEspera);
	    	 TestRule.getDriver().findElement(By.name("Calcular")).click();
	}
	   public static String ValidaPrazoDeEntrega() throws InterruptedException {
		   
		   WebElement tabela = TestRule.getDriver().findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/div[2]/div[2]/div[2]/table"));
		   WebElement linhas = tabela.findElement(By.tagName("tr"));
		   WebElement celulas = linhas.findElement(By.tagName("td"));
		   
		 //  String prazo =  TestRule.getDriver().findElement(By.xpath("//th")).getText();
	    	return (celulas.getLocation(1)).getText();
	}
	   public static String ValidaValorTotal() throws InterruptedException {
	    	 Thread.sleep(tempoCurtoEspera);
	    	String valor =  TestRule.getDriver().findElement(By.xpath("//th[contains(.,'Valor total:')]")).getText();
	    	return valor;
	} 

	   public static String VerificaMensagem() throws InterruptedException {
	    	Thread.sleep(tempoLongoEspera);
	    	
	        String MainWindow=TestRule.getDriver().getWindowHandle();		
    		
	        // Para lidar com todas as novas janelas abertas..				
	            Set<String> s1=TestRule.getDriver().getWindowHandles();		
	        Iterator<String> i1=s1.iterator();		
	        String alert = "";
	        int i = 0;
	        while(i == 1)			
	        {		
	            String ChildWindow=i1.next();		
	            		
	            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
	            {    		
	                 
	                    //  Alternando para a janela 
	            	TestRule.getDriver().switchTo().window(ChildWindow);	                                                                                                           
	            	 alert = TestRule.getDriver().switchTo().alert().getText();
	            
	            }

	            i++;
	        }
	        
	   return alert;
	   }
}



