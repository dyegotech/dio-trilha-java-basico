import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        String nome = null;
        int idade = 0;
        double altura = 0.0;

        try {
            System.out.println("Nome: ");
            nome = s.nextLine();
            System.out.println("Idade: ");
            idade = Integer.parseInt(s.nextLine());
            System.out.println("Altura: ");
            altura = Double.parseDouble(s.nextLine());            

        } catch (NumberFormatException nfe) {
            String causa = nfe.getLocalizedMessage().split(":")[1];
            System.err.println("Erro: " + "O valor" + causa + " está fora dos padrões.");
            System.err.println("Mais detalhes do erro: \n");
            nfe.printStackTrace();
        }finally{
            s.close();
        }

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);

    }
}
