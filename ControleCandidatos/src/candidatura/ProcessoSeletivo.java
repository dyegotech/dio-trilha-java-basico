package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo Seletivo");
        
        imprimirListaCandidatos();
    }


    static void imprimirListaCandidatos(){

        String[] can = {"Dyego", "Maria", "Júlia", "Esther"};

        for (String c : can){
            System.out.println(c);
        }
    }

    static void selacaoCandidatos(){
        String candidatos[] = {"JOSÉ", "MARIA", "JOÃO", "FERNANDA", "AYA", "FELIPE", "FRANCISCO", "JOANA"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000;
        
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];

            if(salarioPretendido() <= salarioBase){
                candidatosSelecionados++;
                System.out.println(candidato + " - " + salarioPretendido());
            }

            candidatoAtual++;
        }
    }

    static double salarioPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if (salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA-PROPOSTA  ");
        }else{
            System.out.println("AGUARDANDO RESULTADO DE OUTROS CANDIDATOS");
        }
    }
}
