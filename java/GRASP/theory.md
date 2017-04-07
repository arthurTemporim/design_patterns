# GRASP

General responsibility assignment software patterns (or principles), 
abbreviated GRASP.

## O que é Padrão de Projeto?

"São princípios e soluções usadas durante a criação do software, codificados
em um formato estruturado, descrevendo o problema e a respectiva solução
adotada."

GRASP são mais voltados para atribuição de responsabilidades de objetos (OO).

## Existem 9 padrões GRASP:

> Jogo imobiliário.

### 1. Creator

	* Problema

	Quem deve ser o responsável pela criação de um objeto?

	* Solução

	Se B **contém** A;
	B registra A;
	B usa A de maneira muito próxima;
	B tem dados iniciais de A que serão passados em sua criação.

	* Exemplo

	Board (tabuleiro) -> Square (propriedades).
	
### 2. Information Expert

	* Problema
	
	A quem deve ser atribuido responsabilidades?

	* Solução

	Atribua a responsabilidade ao **especialista**, quem tem a informação
necessária para executar a ação.

	* Exemplo

	makeBoard() (montarTabuleiro)

### 3. High Cohesion 

	* Problema

	Como manter objetos com propósitos claros?

	* Solução

	Atribuir responsabilidades buscando a alta coesão, cada elemento com suas
responsabilidades específicas.

	* Exemplo

	Deal (transação).

### 4. Low coupling

	* Problema

	Como ter baixa dependência, baixo impacto de modificações e mais 
reutilização?

	* Solução

	Dar responsabilidades de forma a diminuir o acoplamento.

	* Exemplo

> Um objeto de uma classe **Deal** invoca métodos de um objeto de outra classe **Square**.

### 5. Controller

	* Problema

	Qual objeto recebe e coordena uma operação após passar pela UI?

	* Solução

	Usar uma classe controladora que representa todos os eventos do sistema 
dentro de uma funcionalidade(Caso de Uso, História de Usuário...).
	
	Controllers devem delegar a outros objetos o serviço a ser feito.

	* Exemplo

	MVC

### 6. Indirection
	* Problema
	* Solução
	* Exemplo
### 7. Polymorphism
	* Problema
	* Solução
	* Exemplo
### 8. Protected Variations
	* Problema
	* Solução
	* Exemplo
### 9. Pure Fabrication
	* Problema
	* Solução
	* Exemplo
