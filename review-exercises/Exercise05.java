// Exercício 5 
// Crie  um  programa    que    permita    fazer    a    conversão    cambial    entre    Reais    e  Dólares.  
// Pesquise a  taxa  de  câmbio  na internet.  Leia  um  valor  em Reais pelo teclado e mostre o 
// correspondente em Dólares.

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {

        float dolar = 5.13f;
        float valorDolares = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o valor em reais: ");
        valorDolares = scanner.nextFloat() / dolar;

        System.out.printf("Valor convertido em dolares = %.2f %n", valorDolares); 
        
        scanner.close();
    }
}
