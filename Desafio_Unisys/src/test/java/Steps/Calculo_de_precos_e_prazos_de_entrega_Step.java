package Steps;

import cucumber.api.java.pt.Quando;
import Pages.PageCalculoDePreçosEPrazosDeEntrega;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;


public class Calculo_de_precos_e_prazos_de_entrega_Step {

	@Dado("^que eu acesso o site dos Correios na tela de Restreamento$")
	public void que_eu_acesso_o_site_dos_Correios_na_tela_de_Restreamento() throws Throwable {
	  
	}

	@Dado("^que eu envio uma caixa via \"([^\"]*)\" ou \"([^\"]*)\", pesando \"([^\"]*)\", da origem \"([^\"]*)\", para o destino \"([^\"]*)\" com as seguintes dimensoes em cm: \"([^\"]*)\" a ser entregue em maos \"([^\"]*)\"\\.$")
	public void que_eu_envio_uma_caixa_via_ou_pesando_da_origem_para_o_destino_com_as_seguintes_dimensoes_em_cm_a_ser_entregue_em_maos(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws Throwable {
	    
	}

	@Quando("^eu Clicar no botao Calcular$")
	public void eu_Clicar_no_botao_Calcular() throws Throwable {
	   
	}

	@Entao("^verifico \"([^\"]*)\" e \"([^\"]*)\"$")
	public void verifico_e(String arg1, String arg2) throws Throwable {
	 
	}

	@Dado("^Dado que eu envio uma caixa via \"([^\"]*)\" ou \"([^\"]*)\", pesando \"([^\"]*)\", da origem \"([^\"]*)\", para o destino \"([^\"]*)\" com as seguintes dimensoes em cm: \"([^\"]*)\" a ser entregue em maos \"([^\"]*)\"\\.$")
	public void dado_que_eu_envio_uma_caixa_via_ou_pesando_da_origem_para_o_destino_com_as_seguintes_dimensoes_em_cm_a_ser_entregue_em_maos(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws Throwable {
	  ;
	}

	@Entao("^verifica mensagem  \"([^\"]*)\"$")
	public void verifica_mensagem(String arg1) throws Throwable {
	 
	}



}
