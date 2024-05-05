public class CaixaEletronico  {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 32.0;

        if(valorSolicitado < saldo) {
            saldo += -valorSolicitado;
            System.out.println("novo saldo: " + saldo);
        }else
            System.out.println("Saldo insuficiente");
        System.out.println(saldo);

        String salto1 = valorSolicitado < saldo ? "novo saldo " + (saldo += -valorSolicitado) : "saldo insuficiente";
    }
}