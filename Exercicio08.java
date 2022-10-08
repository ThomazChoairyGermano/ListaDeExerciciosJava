import java.util.List;
import java.util.ArrayList;

public class Exercicio08 {
    String nome;

    char sexo;

    int idade;

    double peso;
    double altura;

    public Exercicio08(String _nome, char _sexo, double _peso, int _idade, double _altura){
        nome = _nome;
        sexo = _sexo;
        peso = _peso;
        idade = _idade;
        altura = _altura;
    }

    public static int media_idade_homens(List<Exercicio08> exercicio08s){
        int media = 0;
        int quantidade = 0;

        for(Exercicio08 homens : exercicio08s){
            if(homens.sexo == 'm'){
                quantidade++;
                media += homens.idade;
            }
        }
        return (media / quantidade);
    }

    public static int quantidade_mulheres_altura_peso(List<Exercicio08> exercicio08s){
        int quantidade = 0;

        for(Exercicio08 mulheres : exercicio08s){
            if(mulheres.sexo == 'f'){
                if((mulheres.altura >= 1.60 && mulheres.altura <= 1.70) && mulheres.peso > 70){
                    quantidade++;
                }
            }
        }
        return quantidade;
    }

    public static int pessoas_idade_entre_18_25(List<Exercicio08> exercicio08s){
        int quantidade = 0;

        for(Exercicio08 pessoa : exercicio08s){
            if(pessoa.idade >= 18 && pessoa.idade <= 25){
                quantidade++;
            }
        }
        return quantidade;
    }

    public static String paciente_mais_velho(List<Exercicio08> exercicio08s){
        Exercicio08 anciao = new Exercicio08("", 'm', 0, 0, 0);


        for(Exercicio08 pessoa : exercicio08s){
            if(anciao.idade < pessoa.idade){
                anciao = pessoa;
            }
        }
        return anciao.nome;
    }

    public static String mulher_mais_baixa(List<Exercicio08> exercicio08s){
        Exercicio08 baixinha = new Exercicio08("", 'f', 0, 0, 2.00);

        for(Exercicio08 pessoa : exercicio08s){
            if(pessoa.sexo == 'f'){
                if(pessoa.altura < baixinha.altura){
                    baixinha = pessoa;
                }
            }
        }
        return baixinha.nome;
    }

    public static int sobrenomes_iguais(List<Exercicio08> exercicio08s, String sobrenome){
        int quantidade = 0;

        for(Exercicio08 pessoa : exercicio08s){
            String[] nomes = pessoa.nome.split(" ");
            for(String busca : nomes){
                if(sobrenome.equals(busca)){
                    quantidade++;
                }
            }
        }
        return quantidade;
    }

    public static void main(String[] args){
        List<Exercicio08> exercicio08s = new ArrayList<Exercicio08>();

        exercicio08s.add( new Exercicio08("Gustavo Guanabara", 'm', 100.8, 45, 1.90) );
        exercicio08s.add( new Exercicio08("Marcelo Mendes", 'm', 80, 30, 1.65) );
        exercicio08s.add( new Exercicio08("Amarildo Gomes", 'm', 90, 30, 1.70) );
        exercicio08s.add( new Exercicio08("Maria Vasconcelos", 'f', 50, 20, 1.67) );
        exercicio08s.add( new Exercicio08("Ana Carolina", 'f', 60, 30, 1.55) );
        exercicio08s.add( new Exercicio08("Breno Pinto", 'm', 95, 59, 1.85) );

        System.out.println("Quantidade de pacientes = " + exercicio08s.size());

        System.out.println("A media de idade dos homens = " + media_idade_homens(exercicio08s));

        System.out.println("A quantidade de mulheres com altura entre 1.60 e 1.70 e peso maior que 70Kg = " + quantidade_mulheres_altura_peso(exercicio08s));

        System.out.println("A quantidade de pessoas com idade entre 18 e 25 = " + pessoas_idade_entre_18_25(exercicio08s));

        System.out.println("O nome do paciente mais velho = " + paciente_mais_velho(exercicio08s));

        System.out.println("O nome da mulher mais baixa = " + mulher_mais_baixa(exercicio08s));

        String sobrenome = "Souza";
        System.out.println("A quantidade de pacientes com o sobrenomes igual a " + sobrenome + " é = " + sobrenomes_iguais(exercicio08s, sobrenome));
    }

}
