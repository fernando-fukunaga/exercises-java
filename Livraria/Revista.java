package Livraria;

public class Revista implements Calculavel {
    public String nome;
    public double preco;

    public Revista(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double calcularPrecoFinal() {
        double imposto = 1.5;
        return preco + imposto;
    }
}
