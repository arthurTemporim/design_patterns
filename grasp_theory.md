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

	Como evitar acoplamento direto entre 2 ou mais objetos?

	* Solução

	Definir a responsabilidade para um objeto intermediário, com esse objeto
mediador não existe mais acoplamento direto entreo os objetos.

	* Exemplo

	DAO	

### 7. Polymorphism

	* Problema

	Como lidar com as várias alternativas dos objetos?

	* Solução

	Quando a variação é o comportamento ou tipo é possível usar polimorfismo.
	**Sobrecarga** e **Sobreescrita**.

	* Exemplo

	pawn(car), pawn(doll)

### 8. Protected Variations

	* Problema

	Como evitar comportamentos indesejados em variações dos elementos?

	* Solução

	Identificar pontos de instabilidade e designar responsabilidades em que a
criação seja estável. **Interface**.

	* Exemplo

	<<Interface>> Pawn

### 9. Pure Fabrication

	* Problema
	
	O que fazer quando não é desejado violar a coesão e acoplamento mas a 
solução criada não é apropriada? (**especialista**)

	* Solução

	Designar alta coesão para uma classe que convenientemente não representa
problema para o domínio.

	* Exemplo

	**Deal**


## Referências

[GRASP Patterns](https://www.google.com.br/url?sa=t&rct=j&q=&esrc=s&source=web&cd=4&ved=0ahUKEwi55oHxrZHTAhUBNJAKHYcBApgQFgg5MAM&url=https%3A%2F%2Fwww.cs.colorado.edu%2F~kena%2Fclasses%2F5448%2Ff12%2Fpresentation-materials%2Fduncan.pdf&usg=AFQjCNGvjZdE_Aw_4nopKvFf3enXCRb31g&sig2=M8Y1-qwOpWSeYTHgSRYm0w)

Slide fornecido pela professora.
