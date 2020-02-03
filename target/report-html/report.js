$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("br/com/rsinet/hub_bdd/functionalTests/BuscaProduto.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 2,
  "name": "Busca de produto pela lupa",
  "description": "\nCOMO um cliente\nEU quero digitar nome de um produto na barra de pesquisa\nPARA que eu possa ver a descrição do produto",
  "id": "busca-de-produto-pela-lupa",
  "keyword": "Funcionalidade"
});
formatter.scenarioOutline({
  "line": 9,
  "name": "Busca de produto existente",
  "description": "",
  "id": "busca-de-produto-pela-lupa;busca-de-produto-existente",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 8,
      "name": "@BuscaPositiva"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "que estou na pagina inicial \"\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "eu clicar no botão lupa",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "preencher o campo pesquisa com o nome do \"\u003cproduto_existente\u003e\" pressionando a tecla enter",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "clicar no \"\u003cproduto_existente\u003e\"",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "será exibida a página de descrição do \"\u003cproduto_existente\u003e\"",
  "keyword": "Então "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "busca-de-produto-pela-lupa;busca-de-produto-existente;",
  "rows": [
    {
      "cells": [
        "produto_existente"
      ],
      "line": 17,
      "id": "busca-de-produto-pela-lupa;busca-de-produto-existente;;1"
    },
    {
      "cells": [
        "HP ROAR WIRELESS SPEAKER"
      ],
      "line": 18,
      "id": "busca-de-produto-pela-lupa;busca-de-produto-existente;;2"
    },
    {
      "cells": [
        "HP PRO TABLET 608 G1"
      ],
      "line": 19,
      "id": "busca-de-produto-pela-lupa;busca-de-produto-existente;;3"
    }
  ],
  "keyword": "Exemplos"
});
formatter.before({
  "duration": 12408291100,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Busca de produto existente",
  "description": "",
  "id": "busca-de-produto-pela-lupa;busca-de-produto-existente;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 8,
      "name": "@BuscaPositiva"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "que estou na pagina inicial \"\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "eu clicar no botão lupa",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "preencher o campo pesquisa com o nome do \"HP ROAR WIRELESS SPEAKER\" pressionando a tecla enter",
  "matchedColumns": [
    0
  ],
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "clicar no \"HP ROAR WIRELESS SPEAKER\"",
  "matchedColumns": [
    0
  ],
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "será exibida a página de descrição do \"HP ROAR WIRELESS SPEAKER\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Então "
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 29
    }
  ],
  "location": "PesquisaProdutoTestSteps.que_estou_na_pagina_inicial(String)"
});
formatter.result({
  "duration": 961100600,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaProdutoTestSteps.eu_clicar_no_botão_lupa()"
});
formatter.result({
  "duration": 2568006300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HP ROAR WIRELESS SPEAKER",
      "offset": 42
    }
  ],
  "location": "PesquisaProdutoTestSteps.preencher_o_campo_pesquisa_com_o_nome_do_pressionando_a_tecla_enter(String)"
});
formatter.result({
  "duration": 2945081400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HP ROAR WIRELESS SPEAKER",
      "offset": 11
    }
  ],
  "location": "PesquisaProdutoTestSteps.clicar_no(String)"
});
formatter.result({
  "duration": 2086276500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HP ROAR WIRELESS SPEAKER",
      "offset": 39
    }
  ],
  "location": "PesquisaProdutoTestSteps.será_exibida_a_página_de_descrição_do(String)"
});
formatter.result({
  "duration": 310306700,
  "status": "passed"
});
formatter.after({
  "duration": 1125959300,
  "status": "passed"
});
formatter.before({
  "duration": 9327974800,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Busca de produto existente",
  "description": "",
  "id": "busca-de-produto-pela-lupa;busca-de-produto-existente;;3",
  "type": "scenario",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 8,
      "name": "@BuscaPositiva"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "que estou na pagina inicial \"\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "eu clicar no botão lupa",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "preencher o campo pesquisa com o nome do \"HP PRO TABLET 608 G1\" pressionando a tecla enter",
  "matchedColumns": [
    0
  ],
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "clicar no \"HP PRO TABLET 608 G1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "será exibida a página de descrição do \"HP PRO TABLET 608 G1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Então "
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 29
    }
  ],
  "location": "PesquisaProdutoTestSteps.que_estou_na_pagina_inicial(String)"
});
formatter.result({
  "duration": 832337200,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaProdutoTestSteps.eu_clicar_no_botão_lupa()"
});
formatter.result({
  "duration": 2667491900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HP PRO TABLET 608 G1",
      "offset": 42
    }
  ],
  "location": "PesquisaProdutoTestSteps.preencher_o_campo_pesquisa_com_o_nome_do_pressionando_a_tecla_enter(String)"
});
formatter.result({
  "duration": 2726364000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HP PRO TABLET 608 G1",
      "offset": 11
    }
  ],
  "location": "PesquisaProdutoTestSteps.clicar_no(String)"
});
formatter.result({
  "duration": 2140986600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HP PRO TABLET 608 G1",
      "offset": 39
    }
  ],
  "location": "PesquisaProdutoTestSteps.será_exibida_a_página_de_descrição_do(String)"
});
formatter.result({
  "duration": 244127500,
  "status": "passed"
});
formatter.after({
  "duration": 1137782500,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 23,
  "name": "Busca de produto inexistente",
  "description": "",
  "id": "busca-de-produto-pela-lupa;busca-de-produto-inexistente",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 22,
      "name": "@BuscaNegativa"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "que estou na pagina inicial \"\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 25,
  "name": "eu clicar no botão lupa",
  "keyword": "Quando "
});
formatter.step({
  "line": 26,
  "name": "preencher o campo pesquisa com o nome do \"\u003cproduto_inexistente\u003e\" pressionando a tecla enter",
  "keyword": "E "
});
formatter.step({
  "line": 27,
  "name": "será apresentada uma mensagem informando que o produto buscado não existe",
  "keyword": "Então "
});
formatter.examples({
  "line": 29,
  "name": "",
  "description": "",
  "id": "busca-de-produto-pela-lupa;busca-de-produto-inexistente;",
  "rows": [
    {
      "cells": [
        "produto_inexistente"
      ],
      "line": 30,
      "id": "busca-de-produto-pela-lupa;busca-de-produto-inexistente;;1"
    },
    {
      "cells": [
        "mouse gamer"
      ],
      "line": 31,
      "id": "busca-de-produto-pela-lupa;busca-de-produto-inexistente;;2"
    },
    {
      "cells": [
        "AllInOne"
      ],
      "line": 32,
      "id": "busca-de-produto-pela-lupa;busca-de-produto-inexistente;;3"
    }
  ],
  "keyword": "Exemplos"
});
formatter.before({
  "duration": 9319850300,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Busca de produto inexistente",
  "description": "",
  "id": "busca-de-produto-pela-lupa;busca-de-produto-inexistente;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 22,
      "name": "@BuscaNegativa"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "que estou na pagina inicial \"\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 25,
  "name": "eu clicar no botão lupa",
  "keyword": "Quando "
});
formatter.step({
  "line": 26,
  "name": "preencher o campo pesquisa com o nome do \"mouse gamer\" pressionando a tecla enter",
  "matchedColumns": [
    0
  ],
  "keyword": "E "
});
formatter.step({
  "line": 27,
  "name": "será apresentada uma mensagem informando que o produto buscado não existe",
  "keyword": "Então "
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 29
    }
  ],
  "location": "PesquisaProdutoTestSteps.que_estou_na_pagina_inicial(String)"
});
formatter.result({
  "duration": 842729000,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaProdutoTestSteps.eu_clicar_no_botão_lupa()"
});
formatter.result({
  "duration": 3022759900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mouse gamer",
      "offset": 42
    }
  ],
  "location": "PesquisaProdutoTestSteps.preencher_o_campo_pesquisa_com_o_nome_do_pressionando_a_tecla_enter(String)"
});
formatter.result({
  "duration": 2425925700,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaProdutoTestSteps.será_apresentada_uma_mensagem_informando_que_o_produto_buscado_não_existe()"
});
formatter.result({
  "duration": 62943000,
  "status": "passed"
});
formatter.after({
  "duration": 1055412600,
  "status": "passed"
});
formatter.before({
  "duration": 9305618900,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Busca de produto inexistente",
  "description": "",
  "id": "busca-de-produto-pela-lupa;busca-de-produto-inexistente;;3",
  "type": "scenario",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 22,
      "name": "@BuscaNegativa"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "que estou na pagina inicial \"\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 25,
  "name": "eu clicar no botão lupa",
  "keyword": "Quando "
});
formatter.step({
  "line": 26,
  "name": "preencher o campo pesquisa com o nome do \"AllInOne\" pressionando a tecla enter",
  "matchedColumns": [
    0
  ],
  "keyword": "E "
});
formatter.step({
  "line": 27,
  "name": "será apresentada uma mensagem informando que o produto buscado não existe",
  "keyword": "Então "
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 29
    }
  ],
  "location": "PesquisaProdutoTestSteps.que_estou_na_pagina_inicial(String)"
});
formatter.result({
  "duration": 804794400,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaProdutoTestSteps.eu_clicar_no_botão_lupa()"
});
formatter.result({
  "duration": 2568309300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AllInOne",
      "offset": 42
    }
  ],
  "location": "PesquisaProdutoTestSteps.preencher_o_campo_pesquisa_com_o_nome_do_pressionando_a_tecla_enter(String)"
});
formatter.result({
  "duration": 2401509600,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaProdutoTestSteps.será_apresentada_uma_mensagem_informando_que_o_produto_buscado_não_existe()"
});
formatter.result({
  "duration": 52781200,
  "status": "passed"
});
formatter.after({
  "duration": 1065455900,
  "status": "passed"
});
formatter.uri("br/com/rsinet/hub_bdd/functionalTests/CadastroDeUsuario.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 2,
  "name": "Cadastro de usuário",
  "description": "\nCOMO um usuário\nEU quero me cadastrar no site usando minhas informações pessoais\nPARA que eu possa usar esse cadastro toda vez que eu me logar no site",
  "id": "cadastro-de-usuário",
  "keyword": "Funcionalidade"
});
formatter.scenarioOutline({
  "line": 9,
  "name": "Cadastro de usuário com sucesso",
  "description": "",
  "id": "cadastro-de-usuário;cadastro-de-usuário-com-sucesso",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 8,
      "name": "@CadastroPositivo"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "que estou navegando na página inicial \"\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "eu clicar no botão USER",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "clicar no link CREATE NEW ACCOUNT",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "digitar \"\u003cusuario\u003e\" no campo Username",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "digitar \"\u003cemail\u003e\" no campo Email",
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "digitar \"\u003cpassword\u003e\" no campo Password",
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "digitar \"\u003cconfPassword\u003e\" no campo Confirm password",
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "digitar \"\u003cprimeiroNome\u003e\" no campo First Name",
  "keyword": "E "
});
formatter.step({
  "line": 18,
  "name": "digitar \"\u003csobreNome\u003e\" no campo Last Name",
  "keyword": "E "
});
formatter.step({
  "line": 19,
  "name": "digitar \"\u003cphone\u003e\" no campo Last Phone Number",
  "keyword": "E "
});
formatter.step({
  "line": 20,
  "name": "selecionar \"\u003cpais\u003e\" no combo Country",
  "keyword": "E "
});
formatter.step({
  "line": 21,
  "name": "digitar \"\u003ccidade\u003e\" no campo City",
  "keyword": "E "
});
formatter.step({
  "line": 22,
  "name": "digitar \"\u003cendereco\u003e\" no campo Address",
  "keyword": "E "
});
formatter.step({
  "line": 23,
  "name": "digitar \"\u003cestado\u003e\" no campo State / Province / Region",
  "keyword": "E "
});
formatter.step({
  "line": 24,
  "name": "digitar \"\u003ccep\u003e\" no campo Postal Code",
  "keyword": "E "
});
formatter.step({
  "line": 25,
  "name": "clicar no botão para aceitar os termos de uso",
  "keyword": "E "
});
formatter.step({
  "line": 26,
  "name": "clicar no botão REGISTER",
  "keyword": "E "
});
formatter.step({
  "line": 27,
  "name": "serei redirecionado para a página inicial e o nome de meu usuário aparecerá próximo ao botão USER",
  "keyword": "Então "
});
formatter.examples({
  "line": 29,
  "name": "",
  "description": "",
  "id": "cadastro-de-usuário;cadastro-de-usuário-com-sucesso;",
  "rows": [
    {
      "cells": [
        "usuario",
        "email",
        "password",
        "confPassword",
        "primeiroNome",
        "sobreNome",
        "phone",
        "pais",
        "cidade",
        "endereco",
        "estado",
        "cep"
      ],
      "line": 30,
      "id": "cadastro-de-usuário;cadastro-de-usuário-com-sucesso;;1"
    },
    {
      "cells": [
        "joao1244",
        "joaosilva@email.com",
        "!Joao123",
        "!Joao123",
        "João",
        "Silva",
        "1198888-8888",
        "Brazil",
        "São Paulo",
        "Av. Paulista, 200",
        "São Paulo",
        "01311-922"
      ],
      "line": 31,
      "id": "cadastro-de-usuário;cadastro-de-usuário-com-sucesso;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.before({
  "duration": 9323691000,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Cadastro de usuário com sucesso",
  "description": "",
  "id": "cadastro-de-usuário;cadastro-de-usuário-com-sucesso;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 8,
      "name": "@CadastroPositivo"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "que estou navegando na página inicial \"\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "eu clicar no botão USER",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "clicar no link CREATE NEW ACCOUNT",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "digitar \"joao1244\" no campo Username",
  "matchedColumns": [
    0
  ],
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "digitar \"joaosilva@email.com\" no campo Email",
  "matchedColumns": [
    1
  ],
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "digitar \"!Joao123\" no campo Password",
  "matchedColumns": [
    2
  ],
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "digitar \"!Joao123\" no campo Confirm password",
  "matchedColumns": [
    3
  ],
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "digitar \"João\" no campo First Name",
  "matchedColumns": [
    4
  ],
  "keyword": "E "
});
formatter.step({
  "line": 18,
  "name": "digitar \"Silva\" no campo Last Name",
  "matchedColumns": [
    5
  ],
  "keyword": "E "
});
formatter.step({
  "line": 19,
  "name": "digitar \"1198888-8888\" no campo Last Phone Number",
  "matchedColumns": [
    6
  ],
  "keyword": "E "
});
formatter.step({
  "line": 20,
  "name": "selecionar \"Brazil\" no combo Country",
  "matchedColumns": [
    7
  ],
  "keyword": "E "
});
formatter.step({
  "line": 21,
  "name": "digitar \"São Paulo\" no campo City",
  "matchedColumns": [
    8
  ],
  "keyword": "E "
});
formatter.step({
  "line": 22,
  "name": "digitar \"Av. Paulista, 200\" no campo Address",
  "matchedColumns": [
    9
  ],
  "keyword": "E "
});
formatter.step({
  "line": 23,
  "name": "digitar \"São Paulo\" no campo State / Province / Region",
  "matchedColumns": [
    10
  ],
  "keyword": "E "
});
formatter.step({
  "line": 24,
  "name": "digitar \"01311-922\" no campo Postal Code",
  "matchedColumns": [
    11
  ],
  "keyword": "E "
});
formatter.step({
  "line": 25,
  "name": "clicar no botão para aceitar os termos de uso",
  "keyword": "E "
});
formatter.step({
  "line": 26,
  "name": "clicar no botão REGISTER",
  "keyword": "E "
});
formatter.step({
  "line": 27,
  "name": "serei redirecionado para a página inicial e o nome de meu usuário aparecerá próximo ao botão USER",
  "keyword": "Então "
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 39
    }
  ],
  "location": "CadastroDeUsuarioTestSteps.que_estou_navegando_na_página_inicial(String)"
});
formatter.result({
  "duration": 855480500,
  "status": "passed"
});
formatter.match({
  "location": "CadastroDeUsuarioTestSteps.eu_clicar_no_botão_USER()"
});
formatter.result({
  "duration": 2580773200,
  "status": "passed"
});
formatter.match({
  "location": "CadastroDeUsuarioTestSteps.clicar_no_link_CREATE_NEW_ACCOUNT()"
});
formatter.result({
  "duration": 578901300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "joao1244",
      "offset": 9
    }
  ],
  "location": "CadastroDeUsuarioTestSteps.digitar_no_campo_Username(String)"
});
formatter.result({
  "duration": 570908200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "joaosilva@email.com",
      "offset": 9
    }
  ],
  "location": "CadastroDeUsuarioTestSteps.digitar_no_campo_Email(String)"
});
formatter.result({
  "duration": 424687700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "!Joao123",
      "offset": 9
    }
  ],
  "location": "CadastroDeUsuarioTestSteps.digitar_no_campo_Password(String)"
});
formatter.result({
  "duration": 314688200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "!Joao123",
      "offset": 9
    }
  ],
  "location": "CadastroDeUsuarioTestSteps.digitar_no_campo_Confirm_password(String)"
});
formatter.result({
  "duration": 297856900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "João",
      "offset": 9
    }
  ],
  "location": "CadastroDeUsuarioTestSteps.digitar_no_campo_First_Name(String)"
});
formatter.result({
  "duration": 250973300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Silva",
      "offset": 9
    }
  ],
  "location": "CadastroDeUsuarioTestSteps.digitar_no_campo_Last_Name(String)"
});
formatter.result({
  "duration": 223746500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1198888-8888",
      "offset": 9
    }
  ],
  "location": "CadastroDeUsuarioTestSteps.digitar_no_campo_Last_Phone_Number(String)"
});
formatter.result({
  "duration": 314557900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Brazil",
      "offset": 12
    }
  ],
  "location": "CadastroDeUsuarioTestSteps.selecionar_no_combo_Country(String)"
});
formatter.result({
  "duration": 107300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "São Paulo",
      "offset": 9
    }
  ],
  "location": "CadastroDeUsuarioTestSteps.digitar_no_campo_City(String)"
});
formatter.result({
  "duration": 543079200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Av. Paulista, 200",
      "offset": 9
    }
  ],
  "location": "CadastroDeUsuarioTestSteps.digitar_no_campo_Address(String)"
});
formatter.result({
  "duration": 374938400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "São Paulo",
      "offset": 9
    }
  ],
  "location": "CadastroDeUsuarioTestSteps.digitar_no_campo_State_Province_Region(String)"
});
formatter.result({
  "duration": 238000300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "01311-922",
      "offset": 9
    }
  ],
  "location": "CadastroDeUsuarioTestSteps.digitar_no_campo_Postal_Code(String)"
});
formatter.result({
  "duration": 328113300,
  "status": "passed"
});
formatter.match({
  "location": "CadastroDeUsuarioTestSteps.clicar_no_botão_para_aceitar_os_termos_de_uso()"
});
formatter.result({
  "duration": 160732100,
  "status": "passed"
});
formatter.match({
  "location": "CadastroDeUsuarioTestSteps.clicar_no_botão_REGISTER()"
});
formatter.result({
  "duration": 116301300,
  "status": "passed"
});
formatter.match({
  "location": "CadastroDeUsuarioTestSteps.serei_redirecionado_para_a_página_inicial_e_o_nome_de_meu_usuário_aparecerá_próximo_ao_botão_USER()"
});
formatter.result({
  "duration": 6197398300,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of [[ChromeDriver: chrome on XP (234b58f4c22fd6b92771fd3cc6944862)] -\u003e xpath: //*[@id\u003d\"menuUserLink\"]/span] (tried for 6 second(s) with 1000 milliseconds interval)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027RSI1562\u0027, ip: \u002710.1.0.98\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:304)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\r\n\tat br.com.rsinet.hub_bdd.PageObjects.BasePage.fluentWait(BasePage.java:72)\r\n\tat br.com.rsinet.hub_bdd.PageObjects.HomePage.getUsuarioLogado(HomePage.java:152)\r\n\tat br.com.rsinet.hub_bdd.stepDefinitions.CadastroDeUsuarioTestSteps.serei_redirecionado_para_a_página_inicial_e_o_nome_de_meu_usuário_aparecerá_próximo_ao_botão_USER(CadastroDeUsuarioTestSteps.java:143)\r\n\tat ✽.Então serei redirecionado para a página inicial e o nome de meu usuário aparecerá próximo ao botão USER(br/com/rsinet/hub_bdd/functionalTests/CadastroDeUsuario.feature:27)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1060515700,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 34,
  "name": "Cadastro negado por usuário já existente",
  "description": "",
  "id": "cadastro-de-usuário;cadastro-negado-por-usuário-já-existente",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 33,
      "name": "@CadastroNegativo"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "que estou navegando na página inicial \"\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 36,
  "name": "eu clicar no botão USER",
  "keyword": "Quando "
});
formatter.step({
  "line": 37,
  "name": "clicar no link CREATE NEW ACCOUNT",
  "keyword": "E "
});
formatter.step({
  "line": 38,
  "name": "digitar \"\u003cusuario\u003e\" no campo Username",
  "keyword": "E "
});
formatter.step({
  "line": 39,
  "name": "digitar \"\u003cemail\u003e\" no campo Email",
  "keyword": "E "
});
formatter.step({
  "line": 40,
  "name": "digitar \"\u003cpassword\u003e\" no campo Password",
  "keyword": "E "
});
formatter.step({
  "line": 41,
  "name": "digitar \"\u003cconfPassword\u003e\" no campo Confirm password",
  "keyword": "E "
});
formatter.step({
  "line": 42,
  "name": "digitar \"\u003cprimeiroNome\u003e\" no campo First Name",
  "keyword": "E "
});
formatter.step({
  "line": 43,
  "name": "digitar \"\u003csobreNome\u003e\" no campo Last Name",
  "keyword": "E "
});
formatter.step({
  "line": 44,
  "name": "digitar \"\u003cphone\u003e\" no campo Last Phone Number",
  "keyword": "E "
});
formatter.step({
  "line": 45,
  "name": "selecionar \"\u003cpais\u003e\" no combo Country",
  "keyword": "E "
});
formatter.step({
  "line": 46,
  "name": "digitar \"\u003ccidade\u003e\" no campo City",
  "keyword": "E "
});
formatter.step({
  "line": 47,
  "name": "digitar \"\u003cendereco\u003e\" no campo Address",
  "keyword": "E "
});
formatter.step({
  "line": 48,
  "name": "digitar \"\u003cestado\u003e\" no campo State / Province / Region",
  "keyword": "E "
});
formatter.step({
  "line": 49,
  "name": "digitar \"\u003ccep\u003e\" no campo Postal Code",
  "keyword": "E "
});
formatter.step({
  "line": 50,
  "name": "clicar no botão para aceitar os termos de uso",
  "keyword": "E "
});
formatter.step({
  "line": 51,
  "name": "clicar no botão REGISTER",
  "keyword": "E "
});
formatter.step({
  "line": 52,
  "name": "será apresentada uma mensagem informando que o usuário já existe",
  "keyword": "Então "
});
formatter.examples({
  "line": 54,
  "name": "",
  "description": "",
  "id": "cadastro-de-usuário;cadastro-negado-por-usuário-já-existente;",
  "rows": [
    {
      "cells": [
        "usuario",
        "email",
        "password",
        "confPassword",
        "primeiroNome",
        "sobreNome",
        "phone",
        "pais",
        "cidade",
        "endereco",
        "estado",
        "cep"
      ],
      "line": 55,
      "id": "cadastro-de-usuário;cadastro-negado-por-usuário-já-existente;;1"
    },
    {
      "cells": [
        "joao1244",
        "joaosilva@email.com",
        "!Joao123",
        "!Joao123",
        "João",
        "Silva",
        "1198888-8888",
        "Brazil",
        "São Paulo",
        "Av. Paulista, 200",
        "São Paulo",
        "01311-922"
      ],
      "line": 56,
      "id": "cadastro-de-usuário;cadastro-negado-por-usuário-já-existente;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.before({
  "duration": 9319969900,
  "status": "passed"
});
formatter.scenario({
  "line": 56,
  "name": "Cadastro negado por usuário já existente",
  "description": "",
  "id": "cadastro-de-usuário;cadastro-negado-por-usuário-já-existente;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 33,
      "name": "@CadastroNegativo"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "que estou navegando na página inicial \"\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 36,
  "name": "eu clicar no botão USER",
  "keyword": "Quando "
});
formatter.step({
  "line": 37,
  "name": "clicar no link CREATE NEW ACCOUNT",
  "keyword": "E "
});
formatter.step({
  "line": 38,
  "name": "digitar \"joao1244\" no campo Username",
  "matchedColumns": [
    0
  ],
  "keyword": "E "
});
formatter.step({
  "line": 39,
  "name": "digitar \"joaosilva@email.com\" no campo Email",
  "matchedColumns": [
    1
  ],
  "keyword": "E "
});
formatter.step({
  "line": 40,
  "name": "digitar \"!Joao123\" no campo Password",
  "matchedColumns": [
    2
  ],
  "keyword": "E "
});
formatter.step({
  "line": 41,
  "name": "digitar \"!Joao123\" no campo Confirm password",
  "matchedColumns": [
    3
  ],
  "keyword": "E "
});
formatter.step({
  "line": 42,
  "name": "digitar \"João\" no campo First Name",
  "matchedColumns": [
    4
  ],
  "keyword": "E "
});
formatter.step({
  "line": 43,
  "name": "digitar \"Silva\" no campo Last Name",
  "matchedColumns": [
    5
  ],
  "keyword": "E "
});
formatter.step({
  "line": 44,
  "name": "digitar \"1198888-8888\" no campo Last Phone Number",
  "matchedColumns": [
    6
  ],
  "keyword": "E "
});
formatter.step({
  "line": 45,
  "name": "selecionar \"Brazil\" no combo Country",
  "matchedColumns": [
    7
  ],
  "keyword": "E "
});
formatter.step({
  "line": 46,
  "name": "digitar \"São Paulo\" no campo City",
  "matchedColumns": [
    8
  ],
  "keyword": "E "
});
formatter.step({
  "line": 47,
  "name": "digitar \"Av. Paulista, 200\" no campo Address",
  "matchedColumns": [
    9
  ],
  "keyword": "E "
});
formatter.step({
  "line": 48,
  "name": "digitar \"São Paulo\" no campo State / Province / Region",
  "matchedColumns": [
    10
  ],
  "keyword": "E "
});
formatter.step({
  "line": 49,
  "name": "digitar \"01311-922\" no campo Postal Code",
  "matchedColumns": [
    11
  ],
  "keyword": "E "
});
formatter.step({
  "line": 50,
  "name": "clicar no botão para aceitar os termos de uso",
  "keyword": "E "
});
formatter.step({
  "line": 51,
  "name": "clicar no botão REGISTER",
  "keyword": "E "
});
formatter.step({
  "line": 52,
  "name": "será apresentada uma mensagem informando que o usuário já existe",
  "keyword": "Então "
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 39
    }
  ],
  "location": "CadastroDeUsuarioTestSteps.que_estou_navegando_na_página_inicial(String)"
});
formatter.result({
  "duration": 803127600,
  "status": "passed"
});
formatter.match({
  "location": "CadastroDeUsuarioTestSteps.eu_clicar_no_botão_USER()"
});
formatter.result({
  "duration": 2588221700,
  "status": "passed"
});
formatter.match({
  "location": "CadastroDeUsuarioTestSteps.clicar_no_link_CREATE_NEW_ACCOUNT()"
});
formatter.result({
  "duration": 527739700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "joao1244",
      "offset": 9
    }
  ],
  "location": "CadastroDeUsuarioTestSteps.digitar_no_campo_Username(String)"
});
formatter.result({
  "duration": 554697600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "joaosilva@email.com",
      "offset": 9
    }
  ],
  "location": "CadastroDeUsuarioTestSteps.digitar_no_campo_Email(String)"
});
formatter.result({
  "duration": 454043200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "!Joao123",
      "offset": 9
    }
  ],
  "location": "CadastroDeUsuarioTestSteps.digitar_no_campo_Password(String)"
});
formatter.result({
  "duration": 321304500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "!Joao123",
      "offset": 9
    }
  ],
  "location": "CadastroDeUsuarioTestSteps.digitar_no_campo_Confirm_password(String)"
});
formatter.result({
  "duration": 274151100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "João",
      "offset": 9
    }
  ],
  "location": "CadastroDeUsuarioTestSteps.digitar_no_campo_First_Name(String)"
});
formatter.result({
  "duration": 215728500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Silva",
      "offset": 9
    }
  ],
  "location": "CadastroDeUsuarioTestSteps.digitar_no_campo_Last_Name(String)"
});
formatter.result({
  "duration": 211915300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1198888-8888",
      "offset": 9
    }
  ],
  "location": "CadastroDeUsuarioTestSteps.digitar_no_campo_Last_Phone_Number(String)"
});
formatter.result({
  "duration": 315718700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Brazil",
      "offset": 12
    }
  ],
  "location": "CadastroDeUsuarioTestSteps.selecionar_no_combo_Country(String)"
});
formatter.result({
  "duration": 80100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "São Paulo",
      "offset": 9
    }
  ],
  "location": "CadastroDeUsuarioTestSteps.digitar_no_campo_City(String)"
});
formatter.result({
  "duration": 571290400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Av. Paulista, 200",
      "offset": 9
    }
  ],
  "location": "CadastroDeUsuarioTestSteps.digitar_no_campo_Address(String)"
});
formatter.result({
  "duration": 352855400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "São Paulo",
      "offset": 9
    }
  ],
  "location": "CadastroDeUsuarioTestSteps.digitar_no_campo_State_Province_Region(String)"
});
formatter.result({
  "duration": 234429300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "01311-922",
      "offset": 9
    }
  ],
  "location": "CadastroDeUsuarioTestSteps.digitar_no_campo_Postal_Code(String)"
});
formatter.result({
  "duration": 282557900,
  "status": "passed"
});
formatter.match({
  "location": "CadastroDeUsuarioTestSteps.clicar_no_botão_para_aceitar_os_termos_de_uso()"
});
formatter.result({
  "duration": 166948000,
  "status": "passed"
});
formatter.match({
  "location": "CadastroDeUsuarioTestSteps.clicar_no_botão_REGISTER()"
});
formatter.result({
  "duration": 142895400,
  "status": "passed"
});
formatter.match({
  "location": "CadastroDeUsuarioTestSteps.seráApresentadaUmaMensagemInformandoQueOUsuárioJáExiste()"
});
formatter.result({
  "duration": 2138136100,
  "status": "passed"
});
formatter.after({
  "duration": 1080457000,
  "status": "passed"
});
formatter.uri("br/com/rsinet/hub_bdd/functionalTests/EncontraProduto.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 2,
  "name": "Filtrar produto pela página principal",
  "description": "\nCOMO um cliente\nEU quero navegar pela página principal\nPARA que eu possa encontrar um produto usando os filtros disponíveis",
  "id": "filtrar-produto-pela-página-principal",
  "keyword": "Funcionalidade"
});
formatter.scenarioOutline({
  "line": 9,
  "name": "Filtrar produto existente",
  "description": "",
  "id": "filtrar-produto-pela-página-principal;filtrar-produto-existente",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 8,
      "name": "@FiltroPositivo"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "que estou na página inicial \"\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "eu clicar em uma \"\u003ccategoriaDeProduto\u003e\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "clicar em \"\u003cproduto_existente\u003e\"",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "será exibida uma página de descrição do \"\u003cproduto_existente\u003e\"",
  "keyword": "Então "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "filtrar-produto-pela-página-principal;filtrar-produto-existente;",
  "rows": [
    {
      "cells": [
        "produto_existente",
        "categoriaDeProduto"
      ],
      "line": 16,
      "id": "filtrar-produto-pela-página-principal;filtrar-produto-existente;;1"
    },
    {
      "cells": [
        "HP Roar Wireless Speaker",
        "SPEAKERS"
      ],
      "line": 17,
      "id": "filtrar-produto-pela-página-principal;filtrar-produto-existente;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.before({
  "duration": 9299024600,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Filtrar produto existente",
  "description": "",
  "id": "filtrar-produto-pela-página-principal;filtrar-produto-existente;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 8,
      "name": "@FiltroPositivo"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "que estou na página inicial \"\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "eu clicar em uma \"SPEAKERS\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "clicar em \"HP Roar Wireless Speaker\"",
  "matchedColumns": [
    0
  ],
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "será exibida uma página de descrição do \"HP Roar Wireless Speaker\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Então "
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 29
    }
  ],
  "location": "EncontraProdutoTestSteps.que_estou_na_página_inicial(String)"
});
formatter.result({
  "duration": 970672000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SPEAKERS",
      "offset": 18
    }
  ],
  "location": "EncontraProdutoTestSteps.eu_clicar_em_uma(String)"
});
formatter.result({
  "duration": 5046667900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HP Roar Wireless Speaker",
      "offset": 11
    }
  ],
  "location": "EncontraProdutoTestSteps.clicar_em(String)"
});
formatter.result({
  "duration": 1124114100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HP Roar Wireless Speaker",
      "offset": 41
    }
  ],
  "location": "EncontraProdutoTestSteps.será_exibida_uma_página_de_descrição_do(String)"
});
formatter.result({
  "duration": 1101444800,
  "status": "passed"
});
formatter.after({
  "duration": 1067500600,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 20,
  "name": "Mouse não encontrado utilizando os filtros",
  "description": "",
  "id": "filtrar-produto-pela-página-principal;mouse-não-encontrado-utilizando-os-filtros",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 19,
      "name": "@FiltroNegativo"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "que estou na página inicial \"\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 22,
  "name": "eu clicar em uma \"\u003ccategoriaDeProduto\u003e\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 23,
  "name": "clicar no filtro por Scroller",
  "keyword": "E "
});
formatter.step({
  "line": 24,
  "name": "clicar na opção TouchScroll",
  "keyword": "E "
});
formatter.step({
  "line": 25,
  "name": "clicar no filtro por Cor",
  "keyword": "E "
});
formatter.step({
  "line": 26,
  "name": "clicar na Cor Azul",
  "keyword": "E "
});
formatter.step({
  "line": 27,
  "name": "será apresentada uma mensagem na tela informando que o produto buscado não existe",
  "keyword": "Então "
});
formatter.examples({
  "line": 29,
  "name": "",
  "description": "",
  "id": "filtrar-produto-pela-página-principal;mouse-não-encontrado-utilizando-os-filtros;",
  "rows": [
    {
      "cells": [
        "categoriaDeProduto"
      ],
      "line": 30,
      "id": "filtrar-produto-pela-página-principal;mouse-não-encontrado-utilizando-os-filtros;;1"
    },
    {
      "cells": [
        "MICE"
      ],
      "line": 31,
      "id": "filtrar-produto-pela-página-principal;mouse-não-encontrado-utilizando-os-filtros;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.before({
  "duration": 9302721800,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Mouse não encontrado utilizando os filtros",
  "description": "",
  "id": "filtrar-produto-pela-página-principal;mouse-não-encontrado-utilizando-os-filtros;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 19,
      "name": "@FiltroNegativo"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "que estou na página inicial \"\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 22,
  "name": "eu clicar em uma \"MICE\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 23,
  "name": "clicar no filtro por Scroller",
  "keyword": "E "
});
formatter.step({
  "line": 24,
  "name": "clicar na opção TouchScroll",
  "keyword": "E "
});
formatter.step({
  "line": 25,
  "name": "clicar no filtro por Cor",
  "keyword": "E "
});
formatter.step({
  "line": 26,
  "name": "clicar na Cor Azul",
  "keyword": "E "
});
formatter.step({
  "line": 27,
  "name": "será apresentada uma mensagem na tela informando que o produto buscado não existe",
  "keyword": "Então "
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 29
    }
  ],
  "location": "EncontraProdutoTestSteps.que_estou_na_página_inicial(String)"
});
formatter.result({
  "duration": 841600000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MICE",
      "offset": 18
    }
  ],
  "location": "EncontraProdutoTestSteps.eu_clicar_em_uma(String)"
});
formatter.result({
  "duration": 4967795000,
  "status": "passed"
});
formatter.match({
  "location": "EncontraProdutoTestSteps.clicar_no_filtro_por_Scroller()"
});
formatter.result({
  "duration": 1168965100,
  "status": "passed"
});
formatter.match({
  "location": "EncontraProdutoTestSteps.clicar_na_opção_TouchScroll()"
});
formatter.result({
  "duration": 316118700,
  "status": "passed"
});
formatter.match({
  "location": "EncontraProdutoTestSteps.clicar_no_filtro_por_Cor()"
});
formatter.result({
  "duration": 112613600,
  "status": "passed"
});
formatter.match({
  "location": "EncontraProdutoTestSteps.clicar_na_Cor_Azul()"
});
formatter.result({
  "duration": 121975500,
  "status": "passed"
});
formatter.match({
  "location": "EncontraProdutoTestSteps.será_apresentada_uma_mensagem_na_tela_informando_que_o_produto_buscado_não_existe()"
});
formatter.result({
  "duration": 62227000,
  "status": "passed"
});
formatter.after({
  "duration": 1088932400,
  "status": "passed"
});
});