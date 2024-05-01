import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor digite seu nome !");
        String nome = sc.nextLine();

        System.out.println("Por favor digite o numero da sua Agencia !");
        String agencia = sc.nextLine();

        System.out.println("Por favor digite o numero da sua Conta !");
        int conta = sc.nextInt();

        System.out.println("Por favor digite o valor do seu saldo !");
        double saldo = sc.nextDouble();

        System.out.println("Ola " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + conta + " e seu saldo é " + saldo);

    }
}