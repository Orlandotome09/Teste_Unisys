package Steps;

import cucumber.api.java.pt.Quando;

import org.openqa.selenium.support.ui.ExpectedConditions;

import Pages.PageCorreiosRastreamento;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;


public class Rastreamento_por_objeto_ou_CPF_CNPJ_Step {

	@Dado("^que eu acesso o site dos correios e navego para a pagina de Precos e Prazos$")
	public void que_eu_acesso_o_site_dos_correios_e_navego_para_a_pagina_de_Precos_e_Prazos(String url) throws Throwable {
	PageCorreiosRastreamento.AcessaUrl(url);
	}

	@Dado("^que informo um objeto valido \"([^\"]*)\"$")
	public void que_informo_um_objeto_valido(String objeto) throws Throwable {
	   PageCorreiosRastreamento.Objeto("JY183171564BR");
	}

	@Quando("^eu Clicar no botao buscar$")
	public void eu_Clicar_no_botao_buscar() throws Throwable {
	    PageCorreiosRastreamento.BotaoBuscar();
	}

	@Entao("^o status da entrega deve ser \"([^\"]*)\"$")
	public void o_status_da_entrega_deve_ser(String arg1) throws Throwable {
	  
	}

	@Dado("^que informo um objeto invalido \"([^\"]*)\"$")
	public void que_informo_um_objeto_invalido(String objeto) throws Throwable {
	   PageCorreiosRastreamento.Objeto("AA123456789BR");
	}
}
