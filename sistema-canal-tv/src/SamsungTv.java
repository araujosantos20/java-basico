public class SamsungTv {
    boolean ligado = false;
    int numeroCanal = 1;
    int volume = 25;

    public void ligarTv() {
        ligado = true;
    }

    public void desligarTv() {
        ligado = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void trocarCanal(int novoCanal) {
        numeroCanal = novoCanal;
    }
}