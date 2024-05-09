import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        /*analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);*/
        //selecaoCandidatos();
        //imprimirSelecionados();
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA","PAULO","AUGUSTO"};
        for(String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato realizado com sucesso");


        }while(continuarTentando && tentativasRealizadas<3);
        if(atendeu)
            System.out.println("conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativas" );
        else
            System.out.println("nao coseguimos Contado com " + candidato + " numero maximo tentativas " + tentativasRealizadas + " tentativas");
    }




    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA","PAULO","AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o indice de elementos ");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("Candidato de numero " + (i+1) + ": " + candidatos[i]);
        }
        System.out.println("for each");
        for(String candidato : candidatos){
            System.out.println("candidato selecionado foi " + candidato);
        }
    }
    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA","PAULO","AUGUSTO","MONICA","FABRICIO", "MIRELA", "DANIELA", "JORGE"};

            int candidatoSelecionado = 0;
            int candidatoAtual = 0;
            double salarioBase = 2000.0;
            while (candidatoSelecionado < 5 && candidatoAtual < candidatos.length){
                String candidato = candidatos[candidatoAtual];
                double salarioPreendido = valorPretendido();

                System.out.println("O candidato " + candidato + " Solicitou este valor de salario " + salarioPreendido);
                if(salarioBase >= salarioPreendido){
                    System.out.println("O candidato " + candidato + " Foi selecionado para vaga");
                    candidatoSelecionado++;
                }
                candidatoAtual++;
            }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA CANDIDATO ! ");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA ! ");
        }else{
            System.out.println("AGUARDAR O RESULTADO DOS DEMAIS CANDIDATOS ! ");
        }
    }
}