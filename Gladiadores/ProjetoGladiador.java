package Gladiadores;
public class ProjetoGladiador {
    public static void main(String[] args) throws InterruptedException {
        Gladiador glad1 = new Gladiador("Hercules", false);
        Gladiador glad2 = new Gladiador("Davi", false);

        Arma arma1 = new Arma('E');
        Arma arma2 = new Arma('L');

        Arena arena = new Arena(200);

        glad1.imprime();
        arma1.imprimeArma();
        Thread.sleep(2000);
        glad2.imprime();
        arma2.imprimeArma();
        Thread.sleep(2000);

        arena.realizaCombate(glad1, arma1, glad2, arma2);
        Thread.sleep(4000);

        System.out.println("\nCombate finalizado.");
        Thread.sleep(2000);

        glad1.imprime();
        Thread.sleep(2000);
        glad2.imprime();
        Thread.sleep(2000);

        arena.imprime();
        Thread.sleep(2000);
    }
}
