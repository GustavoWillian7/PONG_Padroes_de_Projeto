public class Main {
   public static void main(String[] args) {
      
      //Criação dos jogadores e dos gols

      Jogador jogador1 = new Jogador();
      Jogador jogador2 = new Jogador();
      
      Gol golJogador1 = new Gol();
      Gol golJogador2 = new Gol();

      //Início do jogo
      Jogo jogo = new Jogo();
      jogo.IniciarJogo();
      
      //Factory
      FactoryClassico tipoClassico = FactoryClassico.getClassico("Classico 2"); //Altere a variavel para alterar o classico.
      Controle controle = new Controle();
      controle.definirClassico(tipoClassico);

      //Observer  
      Gol.houveGol(golJogador1, golJogador2, jogador1, jogador2);
   }
}
