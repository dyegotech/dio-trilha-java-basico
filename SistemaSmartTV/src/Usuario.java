public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv minhaTv = new SmartTv();

        System.out.println("Ligada? " + minhaTv.ligada);
        System.out.println("Canal autal: " + minhaTv.canal);
        System.out.println("Volume: " + minhaTv.volume);

        minhaTv.Ligar();

        System.out.println("\n");

        System.out.println("Ligada? " + minhaTv.ligada);

        minhaTv.AumentarVolume();
        System.out.println("Canal autal: " + minhaTv.volume);

        minhaTv.MudarCanal(13);

        System.out.println("Novo Canal: " + minhaTv.canal);

        minhaTv.DescerCanal();

        System.out.println("Novo canal: " + minhaTv.canal);
    }
}
