// Exercício 9
// Elaborar um programa que receba, via teclado, os valores do espaço percorrido e do
// tempo gasto por um veículo em movimento, para calcular e apresentar em tela sua
// velocidade média.

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o espaço percorrido(metros): ");
        double distancia = scanner.nextDouble();

        System.out.print("Insira o tempo gasto (minutos): ");
        double tempo = scanner.nextDouble();

        double velocidade = (distancia/1000) / (tempo/60);
        System.out.printf("\nA velocidade media do veiculo foi de: %.2f KM/h\n", velocidade);

        scanner.close();
    }
}
