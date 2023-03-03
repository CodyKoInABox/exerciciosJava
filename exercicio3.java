import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        System.out.println("Qual o valor?");
        Scanner scanner = new Scanner(System.in);
        double valor = scanner.nextDouble();

        System.out.println("Digite o tipo de pagamento:");
        System.out.println("1. Pix");
        System.out.println("2. Crédito");
        System.out.println("3. Boleto");

        int opcao = scanner.nextInt();
        String tipoPagamento;

        switch (opcao) {
            case 1:
                tipoPagamento = "Pix";
                break;
            case 2:
                tipoPagamento = "Crédito";
                break;
            case 3:
                tipoPagamento = "Boleto";
                break;
            default:
                tipoPagamento = "Opção inválida";
                break;
        }

        System.out.println("Opção selecionada: " + tipoPagamento);
        System.out.println("Valor: R$" + valor);
        scanner.close();
    }
}

