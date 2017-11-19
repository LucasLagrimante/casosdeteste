# corsariosBaja


1 - Calcule as métricas de Chidamber & Kemerer e Lorenz & Kidd para as classes do sistema,
identificando as mais complexas. Justifique sua resposta.

2 - Calcule a métrica de Complexidade Ciclomática de McCabe para todos os métodos das classes do
sistema, identificando os de maior complexidade (deve ter pelo menos um método com
complexidade ciclomática maior que 10).

3 - Baseado nessas métricas identifique classes e métodos que devem ser mais testados.

4 - Construa, manualmente, o grafo da complexidade ciclomática dos métodos a serem testados, e
depois compare com o resultado de uma ferramenta que calcule essa métrica, como o plugin
Metrics for Eclipse (mostre um screen shot da ferramenta).

5 - Para esses métodos, construa uma tabela com os valores a serem utilizados nos testes,
considerando a técnica de Análise do Valor Limite.

6 - Programe os casos de teste utilizando a ferramenta JUnit. Mostre o código fonte dos casos de
teste, e um screen shot do resultado dos testes passando com sucesso.

7 - Utilize uma ferramenta de teste de cobertura e mostre que, para os métodos testados, existe uma
cobertura de 100% com os casos de teste construídos (mostre um screen shot da ferramenta de
teste de cobertura).

8 - Considerando as regiões de maior complexidade e que não foram construídos testes unitários,
construa testes funcionais para uma das funcionalidades da aplicação, utilizando a ferramenta
Selenium. Mostre o código fonte dos casos de teste, e um screen shot da ferramenta mostrando os
testes passando. Deve ser uma funcionalidade que gere, no mínimo, 5 casos de teste.

9 - Identifique uma classe qualquer do sistema que possa ser modificada para a utilização de um
objeto mock. Mostre as mudanças feitas no código fonte, o código dos casos de teste com objeto
mock, e um screen shot do JUnit mostrando os testes passando. Deve-se ter, pelo menos, 2 casos
de teste.

10 - Todos esses resultados devem estar num único relatório em formato pdf, iniciando com uma 
apresentação do sistema que será utilizado nos testes.