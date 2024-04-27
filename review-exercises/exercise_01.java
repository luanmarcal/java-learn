// Exercício 1 
// Escreva    um    programa    que    leia    um    número    inteiro.    Se    o    número    lido    for    positivo,  
// escreva  uma mensagem  indicando  se  ele  é  par  ou  ímpar.  Se  o  número  for  negativo,  
// escreva  a  seguinte  mensagem “Este número não é positivo”.

import java.util.Scanner;

public class exercise_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um numero inteiro: ");
        int number = scanner.nextInt();

        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("O numero " + number + " eh par!");
            }
            else {
                System.out.println("O numero " + number + " eh impar!");
            }
        } else {
            System.out.println("Este numero nao eh positivo");
        }
        
        scanner.close();
    }
}