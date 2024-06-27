package SingleFilePrograms;

public class TesteLacos {
    //exibir o comportamento dos laços
    public static void main(String[] args) {
        int i = 1;
        while (i > 2) { //1 > 2?
            i = i+1;
        }
        System.out.println(i);

        do {
            i = i + 1;
        } while (i > 2); //2 > 2?
        System.out.println(i);
    }
}
