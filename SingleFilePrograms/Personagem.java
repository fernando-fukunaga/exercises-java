package SingleFilePrograms;

public class Personagem {
    String nome;
    int energia = 10;
    int fome = 0;
    int sono = 0;

    void cacar() {
        if (energia >= 2) {
            System.out.println(nome + " cacando");
            energia -= 2;
        }
        else {
            System.out.println(nome + " esta sem energia para cacar");
        }
        fome = Math.min(fome + 1, 10);
        sono = Math.min(sono + 1, 10);
    }

    void comer() {
        if (fome >= 1) {
            System.out.println(nome + " esta comendo.");
            energia = Math.min (energia + 1, 10);
            fome -= 1;
        }
        else {
            System.out.println(nome + " esta sem fome.");
        }
    }

    void dormir() {
        if (sono >= 1) {
            System.out.println(nome + " esta dormindo... zzz");
            sono -= 1;
            energia = energia + 1 > 10 ? 10 : energia + 1;
        }
        else {
            System.out.println(nome + " esta sem sono");
        }
    }

    String informacoes() {
        String s = "Como "+ nome +" esta agora:"+
        "\nenergia: "+ energia +
        "\nfome: "+ fome +
        "\nsono: "+ sono;
        return s;
    }
}
