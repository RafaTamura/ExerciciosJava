## Java 

### Objetivo
O objetivo deste repositório é armazenar alguns exercícios para praticar na linguagem Java, para se ambientar melhor com a linguagem.

### Exercícios
1. Crie uma classe `ConversorMoeda` que implementa uma interface `ConversaoFinanceira` com o método converterDolarParaReal() para converter um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro.
2. Crie uma classe `CalculadoraSalaRetangular` que implementa uma interface `CalculoGeometrico` com os métodos calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular. A classe deve receber altura e largura como parâmetros.
3. Crie uma classe `TabuadaMultiplicacao` que implementa uma interface `Tabuada` com o método mostrarTabuada() para exibir a tabuada de um número. A classe deve receber o número como parâmetro.
4. Crie uma interface `ConversorTemperatura` com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius(). Implemente uma classe `ConversorTemperaturaPadrao` que implementa essa interface com as fórmulas de conversão e exibe os resultados.
5. Crie uma interface `Calculavel` com um método double calcularPrecoFinal(). Implemente essa interface nas classes `Livro` e `ProdutoFisico`, cada uma retornando o preço final considerando descontos ou taxas adicionais.
6. Crie uma interface `Vendavel` com métodos para calcular o preço total de um produto com base na quantidade comprada e aplicar descontos. Implemente essa interface nas classes `Produto` e `Servico`, cada uma fornecendo a sua própria lógica de cálculo de preço.
7. Crie uma classe `Produto` com atributos como nome, preco, e quantidade. Em seguida, crie uma lista de objetos Produto utilizando a classe ArrayList. Adicione alguns produtos, imprima o tamanho da lista e recupere um produto pelo índice.
8. Implemente o método toString() na classe `Produto` para retornar uma representação em texto do objeto. Em seguida, imprima a lista de produtos utilizando o método System.out.println().
9. Modifique a classe `Produto` para incluir um construtor que aceite parâmetros para inicializar os atributos. Em seguida, crie objetos Produto utilizando esse novo construtor.
10. Crie uma classe `ProdutoPerecivel` que herde de `Produto`. Adicione um atributo dataValidade e um construtor que utilize o construtor da classe mãe (super) para inicializar os atributos herdados. Crie um objeto ProdutoPerecivel e imprima seus valores.