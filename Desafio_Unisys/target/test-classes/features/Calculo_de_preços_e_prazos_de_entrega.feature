#language: pt

Funcionalidade: Calculo de preços e prazos de entrega
	Como usuário do sistema, eu quero consultar as informações sobre prazo e custo de uma entrega
Para que eu possa decidir qual a melhor forma de envio de um produto


Contexto: 
  Dado que eu acesso o site dos correios e navego para a pagina de Precos e Prazos
  
  Cenario: Calculo de preco e prazo de entrega com dados validos
    Dado que eu envio uma caixa via "Sedex" ou "Sedex a vista", pesando "2kg", da origem "34006-056", para o destino "04711-130" com as seguintes dimensoes em cm: "L (18) x C (27) x A (9)" a ser entregue em maos "Mao propria". 
    Quando eu Clicar no botao Calcular
    Entao verifico "Prazo de entrega" e "Valor Total"
    

  Cenario: Calculo de preço e prazo de entrega com Cep de origem invalido
    Dado Dado que eu envio uma caixa via "Sedex" ou "Sedex a vista", pesando "2kg", da origem "10101010", para o destino "04711-130" com as seguintes dimensoes em cm: "L (18) x C (27) x A (9)" a ser entregue em maos "Mao propria".
    Quando eu Clicar no botao Calcular
    Entao verifica mensagem  "CEP de origem nao encontrado na base de dados dos Correios (-1)"
