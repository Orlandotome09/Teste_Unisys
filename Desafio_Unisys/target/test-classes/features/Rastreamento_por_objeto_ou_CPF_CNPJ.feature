#language: pt

Funcionalidade: Rastreamento por objeto ou CPF/CNPJ
Como usuário do sistema, eu quero consultar as informações sobre uma entrega do correio
Para que eu possa acompanhar o andamento da entrega

Contexto: 
  Dado que eu acesso o site dos Correios na tela de Restreamento
  
  Cenario: Rastreamento por objeto postado
    Dado que informo um objeto valido "JY183171564BR"
    Quando eu Clicar no botao buscar 
    Entao o status da entrega deve ser entregue "20/02/2020" 
    

  Cenario: Rastreamento por objeto invalido
    Dado que informo um objeto invalido "AA123456789BR"
    Quando eu Clicar no botao buscar 
    Entao o status da entrega deve ser "Aguardando postagem pelo remetente" 
