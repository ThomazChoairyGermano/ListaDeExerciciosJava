package Lista01;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        double salario;
        double prestacao;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o seu salário R$ ");
        salario = leitor.nextDouble();

        System.out.println("Informe o valor das prestações a serem pagas R$ ");
        prestacao = leitor.nextDouble();

        if (prestacao <= salario * 0.30){
            System.out.println("O senhor atendeu aos requisitos da linha de crédito, parabéns!");
        }
        else {
            System.out.println("Infelismente o senhor não atendeu aos requisistos para linha de crédito");
        }
    }
}
