import java.util.Random;
import java.util.Scanner;

public class JogoTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random gerador = new Random();

        int numero = gerador.nextInt(100);

        //int chute = scan.nextInt();
        int tentativas = 10;
        while (tentativas > 0) {
            System.out.println("Tente adivinhar o numero secreto, digite um numero de 0 a 100 ");
            System.out.println("quantidade de tentativas: " + tentativas);
            int chute = scan.nextInt();
            tentativas--;

           String resultado = chute < numero ? "O numero secreto é maior ! " : chute > numero ? "numero secreto menor  ! " : "acertou o numero secreto é " + numero + " restavam " + tentativas +  " tentativas " ;

            System.out.println(resultado);

            if(chute == numero || tentativas == 0) {
                break;
            }


          /*  if (chute < numero) {
                System.out.println("O numero secreto é maior ! ");
            } else if (chute > numero) {
                System.out.println("numero secreto menor  ! ");
            } else {
                System.out.println("acertou o numero secreto é " + numero + " restavam " + tentativas +  " tentativas ");
                break;
            }*/
        }
    }


}
