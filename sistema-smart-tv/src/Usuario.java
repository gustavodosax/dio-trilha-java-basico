public class Usuario {
    public static void main(String[] args) {
        smartTV tv = new smartTV();

        System.out.println("Tv ligada: " + tv.ligada);
        System.out.println("Volume: " + tv.volume);
        System.out.println("Canal: " + tv.canal);

        tv.ligar();
        System.out.println("Tv ligada: " + tv.ligada);
    }
}
