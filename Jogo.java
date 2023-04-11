import java.util.Random;
public class Jogo {
    public static void main(String[] args) throws InterruptedException {
        Personagem personagem = new Personagem();
        Random random = new Random();
        personagem.nome = "Fernando";

        while (true) {
            switch (random.nextInt(3)) {
                case 0:
                    personagem.cacar();
                    break;
                case 1:
                    personagem.comer();
                    break;
                case 2:
                    personagem.dormir();
                    break;
            }
            System.out.println(personagem.informacoes());
            Thread.sleep(4000);
        }
    }
}