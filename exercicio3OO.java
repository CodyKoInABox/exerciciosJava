import java.util.Scanner;

public class exercicio3OO {
    public static void main(String[] args) {
        InputReader inputReader = new InputReader();
        double valor = inputReader.readDouble("Qual o valor?");
        PaymentTypeSelector paymentTypeSelector = new PaymentTypeSelector();
        PaymentType paymentType = paymentTypeSelector.selectPaymentType();
        if (paymentType.isValid()) {
            System.out.println("Opção selecionada: " + paymentType.getName());
            System.out.println("Valor: R$" + valor);
        } else {
            System.out.println("Opção inválida selecionada");
        }
    }
}

class InputReader {
    private Scanner scanner;

    public InputReader() {
         scanner = new Scanner(System.in);
    }

    public double readDouble(String prompt) {
        System.out.println(prompt);
        return scanner.nextDouble();
    }
}

interface PaymentType {
    String getName();

    boolean isValid();
}

class PixPayment implements PaymentType {
    @Override
    public String getName() {
        return "Pix";
    }

    @Override
    public boolean isValid() {
        return true;
    }
}

class CreditPayment implements PaymentType {
    @Override
    public String getName() {
        return "Crédito";
    }

    @Override
    public boolean isValid() {
        return true;
    }
}

class BoletoPayment implements PaymentType {
    @Override
    public String getName() {
        return "Boleto";
    }

    @Override
    public boolean isValid() {
        return true;
    }
}

class InvalidPayment implements PaymentType {
    @Override
    public String getName() {
        return "";
    }

    @Override
    public boolean isValid() {
        return false;
    }
}

class PaymentTypeSelector {
    private Scanner scanner;

    public PaymentTypeSelector() {
        scanner = new Scanner(System.in);
    }

    public PaymentType selectPaymentType() {
        System.out.println("Digite o tipo de pagamento:");
        System.out.println("1. Pix");
        System.out.println("2. Crédito");
        System.out.println("3. Boleto");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                return new PixPayment();
            case 2:
                return new CreditPayment();
            case 3:
                return new BoletoPayment();
            default:
                return new InvalidPayment();
        }
    }
}
