#language: pt
Funcionalidade: Filtrar produto pela página principal
	
	COMO um cliente
	EU quero navegar pela página principal
	PARA que eu possa encontrar um produto usando os filtros disponíveis

Esquema do Cenário:  Filtrar produto existente
	Dado que estou na página inicial ""
	Quando eu clicar em uma "<categoriaDeProduto>"
	E clicar em "<produto_existente>"
	Então será exibida uma página de descrição do "<produto_existente>"
	
	Exemplos:
	|produto_existente				 	 |categoriaDeProduto|
	|HP Roar Wireless Speaker	 	 |SPEAKERS					|
	

Esquema do Cenário: Mouse não encontrado utilizando os filtros
	Dado que estou na pagina inicial ""
	Quando eu clicar em uma "<categoriaDeProduto>"
	E clicar no filtro por Scroller
	E clicar na opção TouchScroll
	E clicar no filtro por Cor
	E clicar na Cor Azul
	Então será apresentada uma mensagem na tela informando que o produto buscado não existe
	
	Exemplos:
	|categoriaDeProduto			|
	|MICE										|
	
	

