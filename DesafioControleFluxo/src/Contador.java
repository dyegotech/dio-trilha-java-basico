
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int a;
        int b;    

        System.out.printf("Informe o primeiro número: ");
        a = s.nextInt();
        
        System.out.printf("Informe o segundo número: ");
        b = s.nextInt();

        try{
            contar(a, b);

        }catch(ParametrosInvalidosException e){
            System.out.println(e.toString());
        }
    
        s.close();
    }

    static void contar(int a, int b) throws ParametrosInvalidosException {

        if (a < b){
            throw new ParametrosInvalidosException();
        }else{
            int contagem = a - b;

            for (int i=1; i<=contagem; i++){
                System.out.println("Imprimindo o número " + i);
            }
        }
    }
}
