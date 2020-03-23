package ServiceTests;


import org.junit.Assert;
import org.junit.Test;
import com.eviware.soapui.tools.*;


public class RunTest {
	public  RunTest() {}
	@Test
	public void executaSoapui() {
	SoapUITestCaseRunner runner = new SoapUITestCaseRunner(); 
	try 
	{
			runner.setProjectFile("src/test/resources/SoapuiProject/CalculaPrecoPrazoSoapuiProject.xml");
			runner.setTestSuite("CalculoDePrecosEPrazosDeEntrega");  
			runner.setPrintReport(true);
			runner.setJUnitReport(true);
			runner.setOutputFolder("src/test/resources/SoapuiProject/Logs");
			runner.run(); 
	}
	catch (Exception e) {
		Assert.fail(e.getMessage());
	}
		  
	}
}
	
