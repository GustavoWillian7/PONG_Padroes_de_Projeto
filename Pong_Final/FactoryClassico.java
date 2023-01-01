public abstract class FactoryClassico {
    static FactoryClassico fabricaDeClassico;
    public static FactoryClassico getClassico(String tipoDeClassico) {
        if (fabricaDeClassico == null) {
            if (tipoDeClassico.equals("Classico 1"))
                return new FactoryClassico1();
            if (tipoDeClassico.equals("Classico 2"))
                return new FactoryClassico2();
            if (tipoDeClassico.equals("Classico 3"))
                return new FactoryClassico3();
        }
        return fabricaDeClassico;
    }
    public abstract SkinJogador1 criarSkinJogador1();
    public abstract SkinJogador2 criarSkinJogador2();
}
