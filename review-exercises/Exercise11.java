// Exercício 11
// Crie um programa que receba como entrada o número de eixos de um veículo, e calcule o
// valor de pedágio a ser pago em uma estrada.

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor do pedagio: ");
        float pedagio = scanner.nextFloat();

        System.out.print("Insira a quantidade de eixos do veiculo: ");
        float eixos = scanner.nextFloat();

        float calcPedagio = pedagio * eixos;
        System.out.println("\nO valor a ser pago no pedagio eh de: R$ " + calcPedagio);

        scanner.close();
    }
}
