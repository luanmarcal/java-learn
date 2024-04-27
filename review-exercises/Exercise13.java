// idade, genero, utilizacao, garagem

import java.util.Scanner;

public class Exercise13 {   
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Insira os seguintes dados para validacao do seguro:");

            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            System.out.print("Genero (M = masculino | F = feminino): ");
            String genero = scanner.next();

            System.out.println("Insira a numeracao conforme o uso...");
            System.out.println("1 - Passeio");
            System.out.println("2 - Trabalho");
            System.out.println("3 - Ambos");
            System.out.print("Utilizacao: ");
            int utilizacao = scanner.nextInt();

            System.out.println("Insira a numeracao conforme a garagem...");
            System.out.println("1 - Sem garagem");
            System.out.println("2 - Diurna");
            System.out.println("3 - Noturna");
            System.out.println("4 - Ambas");
            System.out.print("Garagem: ");
            int garagem = scanner.nextInt();

            int pontuacao = 0;

            if(idade > 0){
                if(idade <= 18){
                    System.out.println("Sem cobertura");
                    return;
                }
                else if(idade <= 23)
                    pontuacao += 4;
                else if(idade <= 29)
                    pontuacao += 3;
                else if(idade <= 45)
                    pontuacao +=2;
                else
                    pontuacao += 1;
            }

            if(genero.equalsIgnoreCase("M"))
                pontuacao += 3;
            else if(genero.equalsIgnoreCase("F"))
                pontuacao += 2;
            else {
                System.out.println("Genero invalido");
                return;
            }

            if(utilizacao == 1)
                pontuacao += 1;
            else if(utilizacao == 2)
                pontuacao += 2;
            else if(utilizacao == 3)
                pontuacao += 3;
            else {
                System.out.println("Utilizacao invalida");
                return;
            }

            if(garagem == 1)
                pontuacao += 6;
            else if(garagem == 2)
                pontuacao += 4;
            else if(garagem == 3)
                pontuacao += 2;
            else if(garagem == 4)
                pontuacao +=1;
            else {
                System.out.println("Garagem invalida");
                return;
            }

            if(pontuacao > 0){
                if(pontuacao <= 7)
                    System.out.println("\nClassificacao: Baixo Risco, desconto de 10%");
                else if(pontuacao <= 10)
                    System.out.println("\nClassificacao: Medio Risco, valor padrao");
                else if(pontuacao <= 14)
                    System.out.println("\nClassificacao: Alto Risco, acrescimo de 10%");
                else
                    System.out.println("\nClassificacao: Altissimo Risco, acrescimo de 40%");
            }

        }
    }
}
