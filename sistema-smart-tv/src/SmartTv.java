public class SmartTv {
    boolean ligado = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligado = true;
    }
    public void desligar() {
        ligado = false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("aumentando volume para " + volume);
    }
    public void diminuirVolume() {
        volume--;
        System.out.println("diminui o volume para " + volume);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarDeCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
}