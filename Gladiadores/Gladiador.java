package Gladiadores;
public class Gladiador {
    
    private String nome;
    private int vidas;
    private boolean armadura;

    public Gladiador (String nome, Boolean armadura) {
        this.nome = nome;
        this.armadura = armadura;
        this.vidas = 5;
    }

    public String getNome() {
        return nome;
    }

    public int getVidas() {
        return vidas;
    }
    
    public boolean isArmadura() {
        return armadura;
    }    

    public void recebeGolpe (Arma arma) {
        if (isArmadura() == true) {
            vidas = vidas - (arma.getDano() - 2);
        }
        else {
            vidas = vidas - arma.getDano();
        }
    }

    public void imprime() {
        String estaDeArmadura = "";
        String vivoOuMorto = "";

        if (isArmadura() == true) {
            estaDeArmadura = "Sim";
        }
        else {
            estaDeArmadura = "Não";
        }

        if (vidas > 0) {
            vivoOuMorto = "Vivo";
        }
        else {
            vivoOuMorto = "Morto";
        }

        System.out.println("\nNome do gladiador: " + nome + "\nQtd de vidas: " + vidas + "\nEstá de armadura?: " + estaDeArmadura + "\nVivo ou morto?: " + vivoOuMorto);
    }

}
