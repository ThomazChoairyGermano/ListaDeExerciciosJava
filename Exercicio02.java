package Lista01;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        int numero = 0;
        int par = 0;
        int inpar = 0;

        Scanner inteiro = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            System.out.println("Escreva um número: ");
            numero = inteiro.nextInt();

            if (numero % 2 == 0) {
                System.out.println("O número " + numero + " é par");
            }
            else {
                System.out.println("O número " + numero + " é inpar");
            }
        }
    }
}
