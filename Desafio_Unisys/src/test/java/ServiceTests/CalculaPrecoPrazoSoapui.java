package ServiceTests;

import org.junit.Test;
import com.eviware.soapui.tools.soapuiTestCaseRunner;




public class CalculaPrecoPrazoSoapui {
	

   private String path = "src/test/resources/SoapuiProject/CalculaPrecoPrazoSoapuiProject.xml";

     
       @Test
     
    //   @Severity(SeverityLevel.NORMAL)
   public void calculaPrecoPrazo() {
       soapuiTestCaseRunner runner = soapuiTestCaseRunner();
    	   try {
                       executarSoapUi("Desafio1_Unisys"), path, "CálculoDePrecosEPrazosDeEntrega");
                   } catch (Exception e) {
                                   System.err.println(e.getStackTrace());
                   }
   }

}