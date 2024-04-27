// Exercício 12
// Um pediatra elaborou uma lista com pesos prováveis para meninos e meninas entre 1 e 3
// anos e, frequentemente, precisa consultar a lista. Escreva um programa que, dado o peso
// e o sexo de uma criança, mostre na tela a idade e os pesos prováveis para meninos e
// meninas da mesma idade, seguindo a tabela a seguir:
// 1 ano –Meninos: 8.5 kg a 12.5kg Meninas: 7.5kg a 11.5kg
// 2 anos –Meninos: 10.1 kg a 15.2kg Meninas: 9.8kg a 14.5kg
// 3 anos –Meninos: 11.7 kg a 18 kg Meninas: 11.4kg a 17.950kg

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o sexo da crianca (M = masculino || F - feminino): ");
        String sexo = scanner.next();

        System.out.print("Insira a idade da crianca: ");
        int idade = scanner.nextInt();

        if (sexo.equalsIgnoreCase("M")) {
            switch (idade) {
                case 1:
                    System.out.println("Peso provavel = 8.5 kg a 12.5kg");
                    break;
                case 2:
                    System.out.println("Peso provavel = 10.1 kg a 15.2kg");
                    break;
                case 3:
                    System.out.println("Peso provavel = 11.7 kg a 18 kg");
                    break;
                default:
                    System.out.println("Idade invalida!");
                    break;
            }
        } else if (sexo.equalsIgnoreCase("F")) {
            switch (idade) {
                case 1:
                    System.out.println("Peso provavel = 7.5 kg a 11.5kg");
                    break;
                case 2:
                    System.out.println("Peso provavel = 9.8 kg a 14.5kg");
                    break;
                case 3:
                    System.out.println("Peso provavel = 11.4 kg a 17.950kg");
                    break;
                default:
                    System.out.println("Idade invalida!");
                    break;
            }
        } else {
            System.out.println("Sexo invalido!");
        }

        scanner.close();
    }
}
