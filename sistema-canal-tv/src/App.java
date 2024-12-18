public class App {
    public static void main(String[] args) throws Exception {
        SamsungTv samsungTv = new SamsungTv();

        samsungTv.ligarTv();

        System.out.println("A TV está ligada? " + samsungTv.ligado);
        System.out.println("Está em qual canal? " + samsungTv.numeroCanal);
        System.out.println("O volume da TV está em: " + samsungTv.volume);

        samsungTv.desligarTv();

        System.out.println("E agora a TV está ligada? " + samsungTv.ligado);

        samsungTv.trocarCanal(13);
        samsungTv.diminuirVolume();

        System.out.println(samsungTv.numeroCanal);
        System.out.println(samsungTv.volume);
    }
}
