package Herança;

public class TesteAluno {
    public static void main(String[] args) {
        AlunoDeGraduacao alunoGrad = new AlunoDeGraduacao();
        alunoGrad.setNome("Fernando");
        alunoGrad.setIdade(20);
        System.out.println("Nome: " + alunoGrad.getNome() + "\nIdade: " + alunoGrad.getIdade() + "\nNota 1: " + alunoGrad.getNota1() + "\nNota 2: " + alunoGrad.getNota2());

        AlunoDePosGraduacao alunoPos = new AlunoDePosGraduacao();
        alunoPos.setNome("João");
        alunoPos.setIdade(22);
        alunoPos.setConceito('A');
        System.out.println("\nNome: " + alunoPos.getNome() + "\nIdade: " + alunoPos.getIdade() + "\nConceito: " + alunoPos.getConceito());
    }
}