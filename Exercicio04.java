package Lista01;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        double valorGasolina = 2.50;
        double valorRefrigerante = 3.00;
        double valorPago = 0;
        double total = 0;
        double litros = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Olá, você comprou 2 refrigerantes no valor de R$ 3.00 cada, e a gasolina custa R$ 2.50 o litro!");

        System.out.print("Quanto você quer abastecer R$? ");
        valorPago = leitor.nextDouble();

        total = valorPago + valorRefrigerante * 2;
        System.out.println("Sua conta é R$ " + total);

        litros = valorPago / valorGasolina;
        System.out.println("Você abasteceu " + litros + " litros de gassolina");
    }
}
