package Lista01;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        float mediaAluno = 0;
        float mediaSala = 0;
        float nota1 = 0;
        float nota2 = 0;
        var alunosAprovados = 0;
        var alunosReprovados = 0;
        var alunosExame = 0;

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite a 1º nota: ");
            nota1 = leitor.nextFloat();
            System.out.print("Digite a 2º nota: ");
            nota2 = leitor.nextFloat();

            mediaAluno = (nota1 + nota2)/2;

            if (mediaAluno <= 3) {
                System.out.println("O aluno foi reprovado");
                alunosReprovados ++;
            }
            else if (mediaAluno > 7) {
                System.out.println("O aluno foi aprovado");
                alunosAprovados ++;
            }
            else{
                System.out.println("O aluno vai fazer o exame");
                alunosExame ++;
            }

            mediaSala += mediaAluno / 6;

        }

        System.out.println("O número de alunos aprovados foi: " + alunosAprovados);
        System.out.println("O número de alunos reprovados foi: " + alunosReprovados);
        System.out.println("O número de alunos que terão de fazer o ezame foi: " + alunosExame);
        System.out.printf("A média da sala foi: %.1f.%n", mediaSala);

    }
}
