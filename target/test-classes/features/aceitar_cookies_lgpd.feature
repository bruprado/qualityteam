# language: pt
# encoding: utf-8

Funcionalidade: Acessar o site da accenture e aceitar os cookies do LGPD

	Cenario: Aceitar o cookie LGPD
		Dado que eu estou no site da accenture
		E aceito os termos LGPD
		Então deve fechar a caixa de informação
		
	Cenario: Configurações do cookie
		Dado que eu estou no site da accenture
		E aceito os termos LGPD
		E clico em configurações de cookie
		Então devo ver o item de sua privacidade
		E devo ver Cookies estritamente necessárias
		E devo ver Cookies Analíticos de Primeira Parte
		E devo ver Cookies de Desempenho e Cookies Funcionais
		E devo ver Cookies de Publicidade e Redes Sociais