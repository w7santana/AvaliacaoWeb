	# language: pt
Funcionalidade: Cadastro de cliente
	
	COMO um cliente
	EU quero me cadastrar no site
	PARA que eu possa ter meus dados salvos no banco de dados do site
	PARA reutiliza-los quando eu voltar ao site em outros momentos

Cenário:  Cadastrar cliente com sucesso

	Dado que estou na pagina inicial
	Quando eu clicar no botao USER
	Quando eu clicar no link CREATE NEW ACCOUNT
	Então deve ser aberto um formulario em branco para que eu possa preencher com meus dados pessoais

