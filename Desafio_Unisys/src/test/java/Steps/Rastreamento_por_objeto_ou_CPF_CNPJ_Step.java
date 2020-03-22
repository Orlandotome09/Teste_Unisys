package Steps;

import org.hamcrest.core.StringContains;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Pages.PageCorreiosRastreamento;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;


public class Rastreamento_por_objeto_ou_CPF_CNPJ_Step {

	@Dado("^que eu acesso o site dos Correios na tela de Restreamento \"([^\"]*)\"$")
	public void que_eu_acesso_o_site_dos_Correios_na_tela_de_Restreamento(String url) throws Throwable {
	PageCorreiosRastreamento.AcessaUrl(url);
	}

	@Dado("^que informo um objeto valido \"([^\"]*)\"$")
	public void que_informo_um_objeto_valido(String objeto) throws Throwable {
	   PageCorreiosRastreamento.Objeto(objeto);
	}

	@Quando("^eu Clicar no botao buscar$")
	public void eu_Clicar_no_botao_buscar(){
	    PageCorreiosRastreamento.BotaoBuscar();
	}

	@Entao("^o site retorna mensagem \"([^\"]*)\"$")
	public void o_site_retorna_mensagem(String Aguardando) throws Throwable {
		String VerificaStatu = PageCorreiosRastreamento.VerificaStatusInvalido();
	  Assert.assertThat(VerificaStatu, StringContains.containsString(Aguardando));
	}


	@Dado("^que informo um objeto invalido \"([^\"]*)\"$")
	public void que_informo_um_objeto_invalido(String objeto) throws Throwable {
	   PageCorreiosRastreamento.Objeto(objeto);
	}
	
	@Entao("^o status deve ser \"([^\"]*)\" na data \"([^\"]*)\"$")
	public void o_status_deve_ser_na_data(String Status, String DataEsperada) throws Throwable {
		String Data = PageCorreiosRastreamento.VerificaData();
		Assert.assertThat(Status, StringContains.containsString(Status));
		  Assert.assertThat(Data, StringContains.containsString(DataEsperada));
	}
	
}
