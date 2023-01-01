public class Controle {
    SkinJogador1 skinJogador1;
    SkinJogador2 skinJogador2;

    public Controle() {
        System.out.println("Classico ainda não definido.\n");
    }

    public void definirClassico(FactoryClassico tipoClassico) {
        System.out.println("Classico definido.\n");
        this.skinJogador1 = tipoClassico.criarSkinJogador1();
        this.skinJogador2 = tipoClassico.criarSkinJogador2();
    }

    public SkinJogador1 getSkinJogador1() {
        return this.skinJogador1;
    }

    public SkinJogador2 getSkinJogador2() {
        return this.skinJogador2;
    }
}
