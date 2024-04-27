// Exercício 25
// Elaborar um programa que calcule a média das notas dos alunos de uma sala de aula
// qualquer, sendo que em primeiro lugar deverá ser solicitada a digitação da quantidade de
// alunos existentes nessa sala e, posteriormente, a digitação de todas as notas dos alunos da
// mesma.
// Média = ( N1 + N2 + N3 + N4 + N5 + ... + Nm ) / m
// Exemplo:
// Digite a quantidade de alunos da sala (m): 5 <Enter>
// Digite N1: 5.5 <Enter>
// Digite N2: 4.5 <Enter>
// Digite N3: 3.0 <Enter>
// Digite N4: 5.0 <Enter>
// Digite N5: 7.0 <Enter>
// Média da sala: 5.0

import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a quantidade de alunos: ");
        int qtdAlunos = scanner.nextInt();
        float somaNota = 0;

        for (int i = 0; i < qtdAlunos; i++) {
            System.out.printf("Insira a nota (0 - 10) do %dº aluno: ", i+1);
            somaNota += scanner.nextFloat();   
        }

        float media = somaNota / qtdAlunos;

        System.out.println("\nA media da sala foi de: " + media);

        scanner.close();
    }
}
