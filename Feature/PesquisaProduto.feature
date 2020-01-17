# language: pt
Funcionalidade: Busca de produto pela lupa
	
	COMO um cliente
	EU quero digitar nome de um produto na barra de pesquisa
	PARA que eu possa filtrar produtos pelo nome

Cenário:  Buscar produto com sucesso

	Dado que estou na pagina "inicial http://advantageonlineshopping.com/"
	Quando eu clicar no botao lupa
	Quando preencher o campo pesquisa com o nome do <produto_desejado>
	Quando pressionar a tecla enter 
	Quando clicar no produto
	Então	deve ser exibida a página de descrição do produto