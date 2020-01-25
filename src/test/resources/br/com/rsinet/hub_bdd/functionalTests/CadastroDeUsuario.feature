#language: pt
Funcionalidade: Cadastro de usuário
	
	COMO um usuário
	EU quero me cadastrar no site usando minhas informações pessoais
	PARA que eu possa usar esse cadastro toda vez que eu me logar no site

Esquema do Cenário:  Cadastro de usuário com sucesso
	Dado que estou navegando na página inicial ""
	Quando eu clicar no botão USER
	E clicar no link CREATE NEW ACCOUNT
	E digitar "<usuario>" no campo Username
	E digitar "<email>" no campo Email
	E digitar "<password>" no campo Password
	E digitar "<confPassword>" no campo Confirm password
	E digitar "<primeiroNome>" no campo First Name
	E digitar "<sobreNome>" no campo Last Name
	E digitar "<phone>" no campo Last Phone Number
	E selecionar "<pais>" no combo Country
	E digitar "<cidade>" no campo City
	E digitar "<endereco>" no campo Address
	E digitar "<estado>" no campo State / Province / Region
	E digitar "<cep>" no campo Postal Code
	E clicar no botão para aceitar os termos de uso
	E clicar no botão REGISTER
	Então serei redirecionado para a página inicial e o nome de meu usuário aparecerá próximo ao botão USER
	
	Exemplos:
	|usuario|email|password|confPassword|primeiroNome|sobreNome|phone|pais|cidade|endereco|estado|cep|
	|joao12322|joaosilva@email.com|!Joao123|!Joao123|João|Silva|1198888-8888|Brazil|São Paulo|Av. Paulista, 200|São Paulo|01311-922|
		
Esquema do Cenário: Cadastro negado por usuário já existente
	Dado que estou navegando na página inicial ""
	Quando eu clicar no botão USER
	E clicar no link CREATE NEW ACCOUNT
	E digitar "<usuario>" no campo Username
	E digitar "<email>" no campo Email
	E digitar "<password>" no campo Password
	E digitar "<confPassword>" no campo Confirm password
	E digitar "<primeiroNome>" no campo First Name
	E digitar "<sobreNome>" no campo Last Name
	E digitar "<phone>" no campo Last Phone Number
	E selecionar "<pais>" no combo Country
	E digitar "<cidade>" no campo City
	E digitar "<endereco>" no campo Address
	E digitar "<estado>" no campo State / Province / Region
	E digitar "<cep>" no campo Postal Code
	E clicar no botão para aceitar os termos de uso
	E clicar no botão REGISTER
	Então será apresentada uma mensagem informando que o usuário já existe
	
	Exemplos:
	|usuario|email|password|confPassword|primeiroNome|sobreNome|phone|pais|cidade|endereco|estado|cep|
	|joao12322|joaosilva@email.com|!Joao123|!Joao123|João|Silva|1198888-8888|Brazil|São Paulo|Av. Paulista, 200|São Paulo|01311-922|
