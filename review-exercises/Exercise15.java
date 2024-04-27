// Exercício 15
// Elaborar um programa para ler somente a parte numérica da placa de um carro e apresentar
// o dia do rodízio para o mesmo (digitar apenas um número com 4 dígitos).

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira somente a parte numerica da placa (4 digitos): ");
        int numeroPlaca = scanner.nextInt();

        int ultimoDigito = numeroPlaca % 10;

        if(ultimoDigito == 1 || ultimoDigito == 2)
            System.out.println("Dia de rodizio eh: segunda-feira");
        else if(ultimoDigito == 3 || ultimoDigito == 4)
            System.out.println("Dia de rodizio eh: terca-feira");
        else if(ultimoDigito == 5 || ultimoDigito == 6)
            System.out.println("Dia de rodizio eh: quarta-feira");
        else if(ultimoDigito == 7 || ultimoDigito == 8)
            System.out.println("Dia de rodizio eh: quinta-feira");
        else if(ultimoDigito == 9 || ultimoDigito == 0)
            System.out.println("Dia de rodizio eh: sexta-feira");
        else
            System.out.println("Numero invalido!");

        scanner.close();
    }
}
