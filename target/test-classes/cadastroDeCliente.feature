	# language: pt
Funcionalidade: Cadastro de cliente
	
	COMO um cliente
	EU quero me cadastrar no site
	PARA que eu possa ter meus dados salvos no banco de dados do site
	PARA reutiliza-los quando eu voltar ao site em outros momentos

Cenário:  Cadastrar cliente com sucesso

	Dado que estou na pagina inicial
	Quando eu clicar no botao USER
	E clicar no link CREATE NEW ACCOUNT
	E digitar um nome de usuaario válido no campo Username
	E digitar um email válido no campo Email
	E digitar uma senha válida no campo Password
	E	digitar novamente a mesma senha no campo de Confirm password
	E digitar meu primeiro nome no campo First Name
	E digitar meu sobrenome no campo Last Name
	E digitar meu número de telefone no campo Phone Number
	E selecionar o país onde moro no campo Country
	E	digitar a cidade onde moro no campo City
	E digitar meu endereço no campo Address
	E digitar o estado, província ou região no campo State / Province / Region
	E digitar meu CEP no campo Postal Code
	E selecionar a check box: I agree to the www.AdvantageOnlineShopping.com Conditions of Use and Privacy Notice
	Então 

