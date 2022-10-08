package Lista01;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        String nome = "x";
        double salarioAtual, salarioNovo;

        Scanner leitor = new Scanner(System.in);

        while (!nome.equalsIgnoreCase ("fim")){

            System.out.print("Digite seu nome: ");
            nome = leitor.nextLine();

            System.out.print("Digite o seu salário: ");
            salarioAtual = Double.parseDouble(leitor.nextLine());

            if (salarioAtual < 500){
                salarioNovo = salarioAtual * 1.2;
                System.out.println(nome + " seu salário agora é R$ " + salarioNovo);
            }
            else{
                System.out.println(nome + " você não tem direito ao aumento salarial");
            }
        }
    }
}
