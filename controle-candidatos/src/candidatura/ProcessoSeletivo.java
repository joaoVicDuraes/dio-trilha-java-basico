package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE", "MARICIA", "PAULO", "AUGUSTO", "MONICA"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }
    
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas  = 1;
        boolean continuarTentatndo = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentatndo  = !atendeu;
            if (continuarTentatndo) {
                tentativasRealizadas++;
            }else{
            System.out.println("Contato realizado com sucesso");
            }

        }while(continuarTentatndo && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("Conseguimos o contato com o candidato " + candidato);
        }else {
            System.out.println("Nao foi possivel entrar em contato com o candidato: " + candidato);
        }
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE", "MARICIA", "PAULO", "AUGUSTO", "MONICA"};

        System.out.println("Lista de candidatos: ");
        for(int i=0; i<candidatos.length; i++){
            System.out.println("O candidato de n " + (i+1) + " tem o nome de: "+ candidatos[i]);
        }

    }   

    static void selecaoCandidatos(){

        String [] candidatos = {"FELIPE", "MARICIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JONAS", "JOAO"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase=2000.0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salrio " + salarioPretendido );
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + "Foi selecionado");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }   
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA");
        }else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
