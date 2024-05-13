import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();

        // Crie um loop 'for' para iterar sobre os saques:
        while (true) {
            // Solicite ao usuário o valor do saque:
            System.out.print("Digite o valor do saque (0 para encerrar): ");
            double valorSaque = scanner.nextDouble();

            // Verifique se o valor do saque é zero, encerrando as transações:
            if (valorSaque == 0) {
                System.out.println("Encerrando transações.");
                break;
            }

            // Verifique se o valor do saque não ultrapassa o limite diário:
            if (valorSaque <= limiteDiario) {
                limiteDiario -= valorSaque;
                // Informe que o saque foi realizado e mostre o limite restante:
                System.out.println("Saque de " + valorSaque + " realizado com sucesso. Limite restante: " + limiteDiario);
            } else {
                System.out.println("Limite diário excedido. Saque não realizado.");
            }
        }

        // Fechamos o Scanner para evitar vazamento de recursos:
        scanner.close();
    }
}

