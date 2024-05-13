import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) {

            System.out.println("1. Depositar");
            System.out.println("2. Saque");
            System.out.println("3. Consultar Saldo");
            System.out.println("0. Encerrar");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a ser depositado: ");
                    saldo += scanner.nextDouble();
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor do saque : ");
                    double saque = scanner.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente. ");
                    } else {
                        saldo -= saque;
                    }
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    return;


                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
