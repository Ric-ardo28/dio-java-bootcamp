public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV esta ligada ? " + smartTv.ligado);

        System.out.println("Volume Atual ? "+smartTv.volume);

        smartTv.mudarCanal(18);
        System.out.println("Canal Atual ? "+smartTv.canal);
        smartTv.ligar();
        System.out.println("Novo Status -> Tv ligada ? " + smartTv.ligado);

        smartTv.desligar();
        System.out.println("Novo Status -> Tv ligada ? " + smartTv.ligado);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();



    }
}
