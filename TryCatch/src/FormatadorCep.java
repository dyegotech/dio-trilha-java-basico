public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String s = formatarCep("69901139a");
            System.out.println(s);
        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            
            System.out.println(e.toString() + "\nMais detalhes: \n");
            e.printStackTrace();
        }
    }

    public static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() != 8){
            throw new CepInvalidoException(cep);
        }

        return "12.456-78";

    } 
}
