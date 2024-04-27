// Exercício 28
// Elaborar um programa que seja uma “Calculadora”, onde o usuário deverá digitar uma das
// seguintes teclas:
// ‘+’, ‘-‘, ‘*’, ‘/’ ou ‘S’.
// - Caso escolha ‘S’, para sair, o programa deverá ser encerrado;
// - Caso escolha ‘+’, ‘-‘, ‘*’ ou ‘/’, como operações aritméticas, o programa deverá solicitar a
// digitação de dois números quaisquer (número a e número b), um por vez, realizar a
// respectiva operação aritmética (soma, subtração, multiplicação ou divisão) entre os
// respectivos números (a e b, nessa ordem) e então apresentar o seu resultado.
// - Após isto, deverá voltar à etapa inicial de digitação das teclas ‘+’, ‘-‘, ‘*’, ‘/’ ou ‘S’ e repetir
// este item até a digitação da tecla ‘S’.

import java.util.Scanner;

public class Exercise28 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        boolean showMenu = true, isValid = true;
        String opcao;
        float num1, num2, result = 0;

        while (showMenu) {
            isValid = true;

            // limpa o terminal
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("========= CALCULADORA =========");
            System.out.println("Adicao: (+)");
            System.out.println("Subtracao: (-)");
            System.out.println("Multiplicacao: (*)");
            System.out.println("Divisao: (/)");
            System.out.println("Sair: (S)");

            System.out.print("\nInsira o simbolo da operacao desejada: ");
            opcao = scanner.next().toLowerCase();

            if (opcao.equals("s")) {
                showMenu = false;
                break;
            }

            System.out.print("\nInsira o primeiro numero: ");
            num1 = scanner.nextFloat();

            System.out.print("Insira o segundo numero: ");
            num2 = scanner.nextFloat();

            scanner.nextLine(); 

            switch (opcao) {
                case "+":
                    result = num1 + num2;
                    break;
                
                case "-":
                    result = num1 - num2;
                    break;

                case "*":
                    result = num1 * num2;
                    break;

                case "/":
                    result = num1 / num2;
                    break;
            
                default:
                    System.out.println("\nOpcao invalida!");
                    isValid = false;
                    break;
            }

            if(isValid)
                System.out.println("\n" + num1 + " " + opcao + " " + num2 + " = " + result);

            System.out.println("\nPressione qualquer tecla para continuar...");
            scanner.nextLine();
        }

        scanner.close();
    }
}
