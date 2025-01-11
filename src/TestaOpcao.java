import java.util.Scanner;

public class TestaOpcao {
    public void testa(int opcaoSelecionada){
        String parConversao;
        Scanner valor = new Scanner(System.in);
        double numero = 0;

        switch (opcaoSelecionada) {
            case 1:
                //GET https://v6.exchangerate-api.com/v6/YOUR-API-KEY/pair/USD/ARS
                parConversao = "USD/ARS";
                System.out.println("Digite o valor a ser convertido");
                numero = valor.nextDouble();
                ConversorMoedas conv = new ConversorMoedas();


                break;
            case 2:
                //GET https://v6.exchangerate-api.com/v6/YOUR-API-KEY/pair/ARS/USD
                parConversao = "ARS/USD";
                break;
            case 3:
                //GET https://v6.exchangerate-api.com/v6/YOUR-API-KEY/pair/USD/BRL
                parConversao = "USD/BRL";
                break;
            case 4:
                // GET https://v6.exchangerate-api.com/v6/YOUR-API-KEY/pair/BRL/USD
                parConversao = "BRL/USD";
                break;
            case 5:
                // GET https://v6.exchangerate-api.com/v6/YOUR-API-KEY/pair/USD/COP
                parConversao = "USD/COP";
                break;
            case 6:
                // GET https://v6.exchangerate-api.com/v6/YOUR-API-KEY/pair/COP/USD
                parConversao = "COP/USD";
                break;
            case 7:
                break;
            // Opcional: valor padrão
            default:
                System.out.println("Digite um número que corresponda a uma das opções acima");
                break;
        }
    }
}
