import java.util.InputMismatchException; //importa exception que pode ocorrer no codigo, ao entrar com dados em formato incorreto
import java.util.Scanner; //importa o scanner para receber entradas

public class estacionamento { //inicia classe
    public static void main(String[] args) { //inicia o metodo main
        try { // inicia o try para tentar pegar e tratar alguma possivel exepction
            System.out.println("Digite sua condicao (apenas o numero)"); //explica o que deve ser feito
            System.out.println("Escolha entre: idoso (1), pcd (2) , gestante (3) ou s/condicao (4)"); //apresenta opcoes

            Scanner sc = new Scanner(System.in); //inicia o scanner
            System.out.print("Digite: "); //texto para entrada
            int condicao = sc.nextInt(); //salva entrada na variavel condicao

            if (condicao == 1 || condicao == 2 || condicao == 3) System.out.println("estacionamento liberado"); //teste logico para verificar a entrada, caso seja 1 ou 2 ou 3 retorna a resposta
            else if (condicao == 4) System.out.println("procure outra vaga"); //caso a resposta seja 4, retorna esta resposta
            else { //else caso seja digitado numero fora doas opcoes
                System.out.println("Opcao invalida. Tente novamente."); //retorna esta reposta
                System.out.println("\n"); //pula linha
                estacionamento.main(args); //executa novamente o metodo main ao solicitar "tente novamente"
            }
        } catch (InputMismatchException ex) { //trata esta excesao, caso nao seja digitado uma int
            System.out.println("\n"); //pula linha
            System.err.println("Opcao invalida. Tente novamente."); //retorna texto em formato de erro
            System.err.println("Erro: InputMismatchException"); //retorna o texto em formaro de erro
            System.out.println("\n"); //pula linha
            estacionamento.main(args); //executa o metodo main novamente, impedindo a finalizacao e permitimdo nova resposta
        }
    }
}