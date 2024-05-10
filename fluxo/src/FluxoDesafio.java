import java.util.Scanner;
public class FluxoDesafio {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int numero1 = sc.nextInt();
        System.out.println("Digite o segundo numero que seja maior que o primeiro numero");
        int numero2 = sc.nextInt();

        try {
            contador(numero1, numero2);
        }catch (Exception e)  {
            System.out.println("O segundo numero tem que ser maior que o primeiro numero!!!");
        }
    }

    static void contador(int numero1, int numero2) throws Exception {
        if (numero1 >= numero2) {
            throw new Exception("O segundo numero tem que ser maior que o primeiro numero");
        }
            int contar = numero2 - numero1;

            for (int i = numero1; i <= numero2; i++) {
                System.out.println(i);
            }
        System.out.println("A diferença de " + numero1 + " para o numero " + numero2 + " é " + contar);
        } 
    }
