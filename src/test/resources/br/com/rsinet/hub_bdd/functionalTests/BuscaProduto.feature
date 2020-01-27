#language: pt
Funcionalidade: Busca de produto pela lupa
	
	COMO um cliente
	EU quero digitar nome de um produto na barra de pesquisa
	PARA que eu possa ver a descrição do produto

Esquema do Cenário:  Busca de produto existente
	Dado que estou na pagina inicial ""
	Quando eu clicar no botão lupa
	E preencher o campo pesquisa com o nome do "<produto_existente>" pressionando a tecla enter
	E clicar no "<produto_existente>"
	Então será exibida a página de descrição do "<produto_existente>"
	
	Exemplos:
	|produto_existente				 |
	|HP ROAR WIRELESS SPEAKER	 |
	|HP PRO TABLET 608 G1			 |
	
	

Esquema do Cenário: Busca de produto inexistente
	Dado que estou na pagina inicial ""
	Quando eu clicar no botão lupa
	E preencher o campo pesquisa com o nome do "<produto_inexistente>" pressionando a tecla enter
	Então será apresentada uma mensagem informando que o produto buscado não existe
	
	Exemplos:
	|produto_inexistente			|
	|mouse gamer							|
	|AllInOne									|
	
	
