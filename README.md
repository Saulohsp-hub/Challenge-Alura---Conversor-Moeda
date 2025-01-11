Conversor de Moeda

Este projeto é um Conversor de Moeda em Java, que utiliza a API ExchangeRate-API para obter as taxas de câmbio em tempo real. O programa permite a conversão entre várias moedas e fornece uma interface de menu para o usuário escolher as opções desejadas.

Funcionalidades

Conversão entre Dólar (USD), Peso Argentino (ARS), Real Brasileiro (BRL) e Peso Colombiano (COP).

Recuperação de taxas de câmbio em tempo real usando requisições HTTP.

Interface interativa de menu com entradas de teclado.

Pré-requisitos

Java Development Kit (JDK) 11 ou superior.

Biblioteca Gson para manipulação de JSON.

Acesso à internet para realizar as requisições à API.

Dependências

Gson: Biblioteca para processar JSON.

HttpClient: API de cliente HTTP nativa do Java 11.

Como Executar

Certifique-se de que você tenha o JDK instalado e configurado.

Clone ou baixe o código deste repositório.

No terminal, compile os arquivos:

javac Main.java TestaOpcao.java ExchangeRate.java

Execute o programa:

java Main

Estrutura do Código

Main.java

O ponto de entrada do programa, onde o menu interativo é exibido.

TestaOpcao.java

Contém o método testa(int opcaoSelecionada) que processa a escolha do usuário e chama o método de conversão.

ExchangeRate.java

Faz uma requisição HTTP para a API e retorna a taxa de conversão.

Exemplo de Uso

Ao executar o programa, você verá o menu:

***************************************************************
Seja bem vindo ao Conversor de Moeda (Por Saulo Palácio)

1- Dólar  >>>>>>>>>> Peso Argentino
2- Peso Argentino >> Dólar
3- Dólar >>>>>>>>>>> Real Brasileiro
4- Real Brasileiro > Dólar
5- Dólar >>>>>>>>>>> Peso Colombiano
6- Peso Colombiano > Dolar
7- Sair

Escolha uma das opções acima.
***************************************************************

Digite a opção desejada e o valor para conversão. O programa exibirá o valor convertido com base na taxa de câmbio obtida.

API Utilizada

URL Base: https://v6.exchangerate-api.com/v6/YOUR-API-KEY/pair/CURRENCY1/CURRENCY2

Substitua YOUR-API-KEY com sua chave de API válida.

Nota: Esta versão do código utiliza uma chave de exemplo e precisa ser substituída por uma chave válida ao integrar a API.

Observações

Uso Responsável da API: Certifique-se de estar ciente dos limites de requisição e termos de uso da ExchangeRate-API.

Tratamento de Exceções: Melhorias podem ser feitas para capturar erros de rede e manipulação de entrada inválida.

Licença

Este projeto é distribuído sob a licença MIT. Consulte o arquivo LICENSE para mais detalhes.

