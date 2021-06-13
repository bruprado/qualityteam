# language: pt
# encoding: utf-8

Funcionalidade: Acessar a lista de carreiras da accenture

Cenário: Acessar o item de vagas de tecnologia
Dado que eu estou no site da accenture
E clico no menu carreiras
E clico no item do menu vagas em tecnologia
Então devo ver o destaque em "Carreiras em Tecnologia"
 
Cenário: Procurando uma vaga
Dado que eu estou no site da accenture
E digito no campo de busca "desenvolvedor"
E clico no botão procurar
Então devo encontrar vagas para programadores
