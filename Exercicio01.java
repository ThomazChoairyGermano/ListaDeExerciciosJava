package Lista01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        float salario;
        float percentual;
        float aumento;
        float novoSlario;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o seu salário R$ ");
        salario = leitor.nextFloat();

        System.out.println("Informe o percentual de aumento %");
        percentual = leitor.nextFloat();

        percentual = percentual/100;
        aumento = salario * percentual;
        novoSlario = salario + aumento;

        System.out.println("O percentual de aumento " + percentual);
        System.out.println("O aumento é de R$ " + aumento);
        System.out.println("O novo salário é R$ " + novoSlario);
    }
}
