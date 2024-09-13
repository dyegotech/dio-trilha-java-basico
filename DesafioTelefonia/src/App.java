import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();
        
        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();
        
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
        
        for (int i=1; i < partes.length; i++){
          if (partes[i].equals(servico)){
            System.out.println(partes[i]);
            contratado = true;
          }
        }

        System.out.println(contratado);
        
        if (contratado == true){
          System.out.println("Sim");
        }else{
          System.out.println("Nao");
        }
  
        scanner.close();
    }
}