package Gladiadores;

public class Arena {
    private int torcedores;
    private boolean estaoFelizes;

    public Arena(int torcedores) {
        this.torcedores = torcedores;
        this.estaoFelizes = true;
    }

    public void realizaCombate(Gladiador glad1, Arma arma1, Gladiador glad2, Arma arma2) {
        int vida1 = glad1.getVidas();
        int vida2 = glad2.getVidas();
        int dano1 = arma1.getDano();
        int dano2 = arma2.getDano();

        int resultado1 = vida1 - dano2;
        int resultado2 = vida2 - dano1;

        if (resultado1 == 0 || resultado2 == 0) {
            this.estaoFelizes = true;
            this.torcedores = this.torcedores + (10 / 100 * this.torcedores);
        }
        else {
            this.estaoFelizes = false;
            this.torcedores = this.torcedores - (25 / 100 * this.torcedores);
        }
    }

    public void imprime() {
        if (this.estaoFelizes == true) {
            System.out.println("Os torcedores ficaram felizes pois um ou mais dos gladiadores morreram.\nQuantidade de torcedores agora: " + this.torcedores);
        }
        else {
            System.out.println("Os torcedores ficaram tristes pois os dois continuam vivos.\nQuantidade de torcedores agora: " + this.torcedores);

        }
        
    }
}
