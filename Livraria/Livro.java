package Livraria;

public class Livro implements Calculavel {
    public String nome;
    public double preco;

    public Livro(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double calcularPrecoFinal() {
        double imposto = 2.0;
        return preco + imposto;
    }
}
