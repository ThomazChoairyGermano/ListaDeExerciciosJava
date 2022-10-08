package Lista01;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner leitor1 = new Scanner(System.in);
        Scanner leitor2 = new Scanner(System.in);

        var valorDaDiaria = 40;
        var dias = 0;
        float valorConta = 0;
        var nome = "";
        float total = 0;
        var i = 0;

        while (i < 3){
            System.out.println("Informe seu nome ");
            nome = leitor1.nextLine();
            System.out.println("Informe quantos dias vai ficar ");
            dias = leitor2.nextInt();

            if(dias < 10){
                valorConta = valorDaDiaria * dias + dias * 15;
            }
            else{
                valorConta = valorDaDiaria * dias + dias * 8;
            }

            total += valorConta;

            System.out.printf("O cliente %s terá de pagar R$ %.2f.%n", nome, valorConta);
            i++;

        }
        System.out.printf("A pousada arrecadou no total R$ %.2f.%n", total);
    }
}
