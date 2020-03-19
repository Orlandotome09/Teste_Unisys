package Steps;

import cucumber.api.java.pt.Quando;
import Pages.PageCorreiosRastreamento;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;


public class Rastreamento_por_objeto_ou_CPF_CNPJ_Step {

	@Dado("^que eu acesso o site dos correios$")
	public void que_eu_acesso_o_site_dos_correios() throws Throwable {
		String url = "https://www2.correios.com.br/sistemas/rastreamento/default.cfm";
		PageCorreiosRastreamento.AcessaUrl(url);
	}

	@Dado("^acesso a pagina de rastreamento de objetos$")
	public void acesso_a_pagina_de_rastreamento_de_objetos() throws Throwable {
	    
	}

	@Dado("^que informo um objeto valido \"([^\"]*)\"$")
	public void que_informo_um_objeto_valido(String arg1) throws Throwable {
	   
	}

	@Quando("^eu Clicar no botao buscar$")
	public void eu_Clicar_no_botao_buscar() throws Throwable {
	    
	}

	@Entao("^o status da entrega deve ser \"([^\"]*)\"$")
	public void o_status_da_entrega_deve_ser(String arg1) throws Throwable {
	  
	}

	@Dado("^que informo um objeto invalido \"([^\"]*)\"$")
	public void que_informo_um_objeto_invalido(String arg1) throws Throwable {
	   
	}
}
