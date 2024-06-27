package SingleFilePrograms;/*Uma empresa decide presentear seus funcionários com um bônus de Natal. O valor é definido como segue:
• 20% do salário para os funcionários homens com mais de quinze anos de casa;
• 25% do salário para as funcionárias mulheres com mais de dez anos de casa;
• R$ 200,00 para os demais que não se encaixaram nas categorias anteriores.
Elabore um programa que recebe o sexo, 
o tempo de casa e o salário de um funcionário e exibe o valor total que o funcionário receberá no Natal (salário + bônus). */

import java.util.Scanner;
import java.text.DecimalFormat;
public class ChristmasBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.print("Digite o seu sexo: ");
        String gender = scanner.next();
        System.out.print("Digite o seu tempo de casa em anos: ");
        int time = scanner.nextInt();
        System.out.print("Digite o seu salário em reais: ");
        double payment = scanner.nextDouble();

        double bonus = 0.0;
        
        if (gender == "masculino") {
            if (time > 15) {
                bonus = 20 / 100 * payment;
            } else {
                bonus = 200;
            }
            String total = df.format(payment+bonus);
            System.out.println("O total do seu bônus será de R$ "+total);
        }
        else if (gender == "feminino") {
            if (time > 10) {
                bonus = 25 / 100 * payment;
            } else {
                bonus = 200;
            }
            String total = df.format(payment+bonus);
            System.out.println("O total do seu bônus será de R$ "+total);
        } else {
            System.out.print("Você digitou errado o sexo!");
            System.out.print(gender);
            System.out.print(gender == "masculino");
        }

        scanner.close();
    }
}
