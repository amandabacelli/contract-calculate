# Calculadora de contratos de locação.

## Descrição da aplicação

Aplicação realizada durante o curso de [Java Nelio Alves](https://www.udemy.com/share/1013hwBUAZcFhWQ3o=/).

**Dado:** Que eu precise saber os valores das parcelas de um contrato de acordo com uma taxa x;

**Quando:** Insiro o número do contrato(id), data de início do contrato, valor do contrato e a quantidade de parcelas desejadas;

**Então:** A aplicação retorna as datas de vencimento das parcelas e os respectivos valores.

## Tecnologia

* Java 11

## Instalação do programa

* É necessário ter o Java instalado e configurado no pc.
* Após fazer o download do programa basta rodar o arquivo Program.java na própria IDE.

## Exemplo de saída

![Exemplo saída terminal](https://github.com/amandabacelli/contract-calculate/blob/main/example.png)

## Definições aprendidas

**Inversão de controle:** Ao utilizar interfaces e deixar uma classe externa (Program) gerenciar o controle de qual instancia deve ser utilizadas. 
**Injeção de dependencas:** Quando definimos qual a instancia que deve ser utiliziada ao instanciar uma classe eu faço uma injeção de dependencia.
**Princípio SOLID OCP Princípio Aberto-Fechado:** Quando utilizamos a composição de objetos utilizando a interface, quando mudarmos uma regra de negócio não é necessário entrar na classe de serviço para modificá-la.
**Acoplamento:** Utilizando interfaces e services consigo manter a aplicação desacoplada, justamente porque posso reutilizar a classe service(ContractService) para outras taxas.


