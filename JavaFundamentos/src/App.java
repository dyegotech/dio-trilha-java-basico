public class App {
    public static void main(String[] args) throws Exception {
        for (Estado e : Estado.values()){
            System.out.println(e.getSigla() + " - " + e.getNome());
        }

        Estado acre = Estado.ACRE;

        System.out.println(acre.getNome());
    }
}
