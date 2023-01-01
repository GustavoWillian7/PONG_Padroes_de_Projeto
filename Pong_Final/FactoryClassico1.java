public class FactoryClassico1 extends FactoryClassico{

    @Override
    public SkinJogador1 criarSkinJogador1() {
        // TODO Auto-generated method stub
        return new Corinthians();
    }

    @Override
    public SkinJogador2 criarSkinJogador2() {
        // TODO Auto-generated method stub
        return new Palmeiras();
    }
}
