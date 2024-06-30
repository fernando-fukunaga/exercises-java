package Livraria;

public class Main {
    public static void main(String[] args) {
        Livro harryPotter = new Livro("Harry Potter", 44.9);
        Revista rollingStone = new Revista("Rolling Stone", 26.9);

        System.out.println("O preço final do livro "+harryPotter.nome+", será de R$ "+harryPotter.calcularPrecoFinal());
        System.out.println("O preço final da revista "+rollingStone.nome+", será de R$ "+rollingStone.calcularPrecoFinal());
    }
}
