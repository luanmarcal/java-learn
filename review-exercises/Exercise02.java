// Exercício 2 
// Faça  um  algoritmo  que  receba  o  valor  do  salário  de  uma  pessoa  e  o  valor  de  um 
// financiamento  pretendido.  Caso  o  financiamento  seja  menor  ou  igual  a  5  vezes o  salário da 
// pessoa,    algoritmo  deverá  escrever  "Financiamento  Concedido";  senão  ele  deverá  escrever 
// "Financiamento  Negado".  Independente  de  conceder  ou  não  o  financiamento,  o  algoritmo 
// escreverá depois a frase "Obrigado por nos consultar." 

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor do seu salario: ");
        float salario = scanner.nextFloat();

        System.out.println("Insira o valor do financiamento pretendido: ");
        float financiamento = scanner.nextFloat();

        float base = salario * 5;

        if(financiamento <= base){
            System.out.println("Financiamento concedido");
        } else {
            System.out.println("Financiamento negado");
        }

        System.out.println("Obrigado por nos consultar");

        scanner.close();

    }
}
