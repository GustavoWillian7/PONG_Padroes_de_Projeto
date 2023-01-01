import java.util.Scanner;

public class Gol {
    
    public void marcarGol1(Jogador jogador) {
        Jogador.update1();
    }
    
    public void marcarGol2(Jogador jogador) {
        Jogador.update2();
    }

    public static void houveGol(Gol golJogador1, Gol golJogador2, Jogador jogador1, Jogador jogador2) {
        Scanner houveGol = new Scanner(System.in);
        boolean loop = true;
        while (loop == true) {  
            System.out.println("Houve gol? Responda com 'Sim' e 'Nao'");
            String houveGol1 = houveGol.nextLine();
            if (houveGol1.equals("Sim")) {
                Scanner golDeQualJogador = new Scanner(System.in);
                System.out.println("De qual jogador? Responda com 'Jogador 1' ou 'Jogador 2'");
                String golDeQualJogador1 = golDeQualJogador.nextLine();
                if (golDeQualJogador1.equals("Jogador 1")) {
                    golJogador1.marcarGol1(jogador1);
                    continue;
                } else if (golDeQualJogador1.equals("Jogador 2")) {
                    golJogador2.marcarGol2(jogador2);
                    continue;
                }
            } else if (houveGol1.equals("Nao")) {
                System.out.println("FIM DE JOGO!");
                loop = false;
            }
        }
    }
}
