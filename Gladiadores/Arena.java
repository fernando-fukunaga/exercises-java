package Gladiadores;

public class Arena {
    private int torcedores;
    private boolean estaoFelizes;

    public Arena(int torcedores) {
        this.torcedores = torcedores;
        this.estaoFelizes = true;
    }

    public void realizaCombate(Gladiador glad1, Arma arma1, Gladiador glad2, Arma arma2) {
        System.out.println("\nRealizando combate...");
        glad1.recebeGolpe(arma2);
        glad2.recebeGolpe(arma1);

        if (glad1.getVidas() <= 0 || glad2.getVidas() <= 0) {
            estaoFelizes = true;
            int aumento = 10 / 100 * torcedores;
            torcedores = torcedores + aumento;
        }
        else if (glad1.getVidas() > 0 && glad2.getVidas() > 0) {
            estaoFelizes = false;
            int decrescimo = 25 / 100 * torcedores;
            torcedores = torcedores - decrescimo;
        }
    }

    public void imprime() {
        if (estaoFelizes == true) {
            System.out.println("\nOs torcedores ficaram felizes pois um ou mais dos gladiadores morreram.\nQuantidade de torcedores agora: " + torcedores);
        }
        else {
            System.out.println("\nOs torcedores ficaram tristes pois os dois continuam vivos.\nQuantidade de torcedores agora: " + torcedores);
        }
    }
}