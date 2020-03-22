package Steps;

import cucumber.api.java.pt.Quando;

import org.hamcrest.core.StringContains;
import org.junit.Assert;

import Pages.PageCalculoDePreçosEPrazosDeEntrega;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;



public class Calculo_de_precos_e_prazos_de_entrega_Step {

	@Dado("^que eu acesso a pagina de Precos e Prazos do correio \"([^\"]*)\"$")
	public void que_eu_acesso_a_pagina_de_Precos_e_Prazos_do_correio(String url) throws Throwable {
	   PageCalculoDePreçosEPrazosDeEntrega.AcessaUrl(url);
	}


@Dado("^que eu envio uma caixa via \"([^\"]*)\", da origem \"([^\"]*)\", para o destino \"([^\"]*)\", com a embalagem \"([^\"]*)\"$")
public void que_eu_envio_uma_caixa_via_da_origem_para_o_destino_com_a_embalagem(String Tipo, String cepOrigem, String cepDest, String embalagem) throws Throwable {

		PageCalculoDePreçosEPrazosDeEntrega.CepOrigem(cepOrigem);
	    PageCalculoDePreçosEPrazosDeEntrega.CepDestino(cepDest);
	    PageCalculoDePreçosEPrazosDeEntrega.SelecionaSedex(Tipo);
	    PageCalculoDePreçosEPrazosDeEntrega.ClicaFormatoCaixa();
	    PageCalculoDePreçosEPrazosDeEntrega.SelecionaEmbalagem(embalagem);
	   
	}

	@Quando("^eu Clicar no botao Calcular$")
	public void eu_Clicar_no_botao_Calcular() throws Throwable {
	   PageCalculoDePreçosEPrazosDeEntrega.ClicaNoCalcular();
	}

	@Entao("^verifico \"([^\"]*)\"$")
	public void verifico(String Prazo) throws Throwable {
	  Assert.assertThat(PageCalculoDePreçosEPrazosDeEntrega.ValidaPrazoDeEntrega(), StringContains.containsString(Prazo));
	    
	}


	@Entao("^verifica mensagem  \"([^\"]*)\"$")
	public void verifica_mensagem(String mensagem) throws Throwable {
	 PageCalculoDePreçosEPrazosDeEntrega.VerificaMensagem();
	}
	
	@Dado("^com as seguintes dimensoes em cm: Largura \"([^\"]*)\", Comprimento \"([^\"]*)\", Altura \"([^\"]*)\", e pesando \"([^\"]*)\"kg a ser entregue em maos \"([^\"]*)\"\\.$")
	public void com_as_seguintes_dimensoes_em_cm_Largura_Comprimento_Altura_e_pesando_kg_a_ser_entregue_em_maos(String largura, String Comprimento, String Altura, String Peso, String EmMaos) throws Throwable {
		 PageCalculoDePreçosEPrazosDeEntrega.PreencheAltura(Altura); 
		 PageCalculoDePreçosEPrazosDeEntrega.PreencheLargura(largura); 
		 PageCalculoDePreçosEPrazosDeEntrega.PreencheComprimento(Comprimento);
		 PageCalculoDePreçosEPrazosDeEntrega.SelecionaOPesoDaEmbala(Peso);
		 PageCalculoDePreçosEPrazosDeEntrega.SelecionaEmMaosProprias(EmMaos);
		
	}

	@Entao("^exibicao do \"([^\"]*)\" ou \"([^\"]*)\"$")
	public void exibicao_do_ou(String Valor, String ValorTotal) throws Throwable {
		
		Assert.assertThat(PageCalculoDePreçosEPrazosDeEntrega.ValidaValorTotal(), StringContains.containsString(Valor)); 
			Assert.assertThat(PageCalculoDePreçosEPrazosDeEntrega.ValidaValorTotal(), StringContains.containsString(ValorTotal));
		
		
	}

}
