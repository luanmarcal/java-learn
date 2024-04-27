// Exercício 26
// Escreva um programa para mostrar na tela os resultados de uma tabuada de um número
// qualquer fornecido via teclado.
// Exemplo:
// Digite o número para a tabuada: 5 <Enter>
// Tabuada do 5:
// 5x0=0
// 5x1=5
// 5 x 2 = 10
// 5 x 3 = 15
// 5 x 4 = 20
// 5 x 5 = 25
// 5 x 6 = 30
// 5 x 7 = 35
// 5 x 8 = 40
// 5 x 9 = 45
// 5 x 10 = 50

import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o numero para a tabuada: ");
        int numTabuada = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(numTabuada + " x " + i + " = " + numTabuada * i);           
        }

        scanner.close();
    }
}
