public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv  smartTv = new SmartTv();
        System.out.println("Tv Ligada: ? "  +smartTv.ligada);
        System.out.println("Canal Atual: ? " +smartTv.canal);
        System.out.println("Volume Atual: ? " +smartTv.volume);

        smartTv.ligar();
        System.out.println(" Status: Tv Ligada ? "  +smartTv.ligada);

        smartTv.desligar();
        System.out.println(" Status: Tv Ligada ? "  +smartTv.ligada);

        smartTv. diminuirVolume();
        smartTv. diminuirVolume();
        smartTv. diminuirVolume();
        smartTv. diminuirVolume();
        smartTv. aumentarVolume();
        System.out.println("Volume Atual: ? " +smartTv.volume);

;
System.out.println("Canal Atual: ? " +smartTv.canal);
        smartTv.definirCanal(10);
        System.out.println("Canal Atual: ? " +smartTv.canal);
    }

}
