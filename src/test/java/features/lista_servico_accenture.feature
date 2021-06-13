# language: pt
# encoding: utf-8

Funcionalidade: Acessar o site da accenture a mostrar a lista de serviços


Cenário: listar serviços da Accenture

Dado que eu estou no site da accenture
E clico no menu serviços
Então devo ver os serviços abaixo

|servico											|
| Accenture Strategy 					|
| Application Services 				|
| Artificial Intelligence 		|
| Automation 									|
| Business Process Services	 	|
| Change Management 					|
| Cloud 											|
| Customer Experience 				|
| Data & Analytics 						|
| Ecosystem Partners 					|
| Finance Consulting 					|
| Industry X 									|
| Infrastructure 							|
| Marketing 									|
| Mergers & Acquisitions (M&A)|
| Operating Models 						|
| Security 										|
| Supply Chain Management 		|
| Sustainability 							|
| Technology Consulting 			|
| Technology Innovation 			|
| Zero Based Budgeting (ZBB) 	|


Cenário: Clicar no serviço cloud
Dado que eu estou no site da accenture
E clico no menu serviços
E clico no item do menu cloud
Então devo encontrar o título "Serviços de Cloud"

