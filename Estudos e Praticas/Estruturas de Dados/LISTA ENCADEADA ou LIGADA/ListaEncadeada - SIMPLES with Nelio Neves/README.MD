# LISTA ENCADEADA


<img src="loianeexemplo.jpg" alt="loianeexemplo.jpg" width="500"/>


* É UMA ESTRUTURA DE DADOS QUE ARMAZENA OS VALORES EM UMA SEQUENCIA DE "NÓS".

* CADA "NÓ" CONHECE SEU SUCESSOR (OU ANTECESSOR SE FOR UMA LISTA DUPLAMENTE ENCADEADA).

  * O NÓ É UMA UNIDADE QUE PODEMOS GUARDAR O VALOR (OU UMA REFERENCIA PARA OUTROS NÓS, DEPENDE DO TIPO DE ESTRUTURA.)
  
* TEM-SE A NOÇÃO DE POSIÇÃO NAS LISTAS(IGUAL O VETOR). (DIFERENTE DE DICIONÁRIOS E CONJUNTOS).

## CONCEITOS IMPORTANTES

* CABEÇA: PRIMEIRO ELEMENTOS DA LISTA.
* CAUDA: LISTA SEM O PRIMEIRO ELEMENTO.


## COMPLEXIDADE

* BUSCA: O(N) -> O DE (N) ELEMENTOS.
* INSERÇÃO: DEPENDE DA IMPLEMENTAÇÃO.
* REMOÇÃO: DEPENDE DA IMPLEMENTAÇÃO.


------------------------------------------------------------

Exemplo: 


Lista encadeada guarda o valor e uma referencia para o proximo:

<img src="exemplo1.jpg" alt="exemplo1.jpg" width="500"/>


## Vantagem:

Sendo assim caso precisar colocar um novo item "no meio", basta apontarmos o nó anterior para o novo e o nó do novo para o próximo. Sem precisar mexer em toda estrutura. Diferente do array que teria que mudar todos os elementos seguintes.

<img src="exemplo2.jpg" alt="exemplo2.jpg" width="500"/>
