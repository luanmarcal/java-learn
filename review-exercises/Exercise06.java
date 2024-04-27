// Exercício 6 
// Calcule    quantos     azulejos   são    necessários   para    azulejar    uma    parede.    É  necessário  
// conhecer  a  altura  da  parede  (AP),  a  sua  largura  (LP),  e  a  altura  do azulejo (AA) e sua 
// largura (LA). Leia os dados através do teclado. 

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInsira em metros as seguintes informações...");
        System.out.print("altura da parede: ");
        float alturaParede = scanner.nextFloat();
        
        System.out.print("largura da parede: ");
        float larguraParede = scanner.nextFloat();

        System.out.print("altura do azulejo: ");
        float alturaAzulejo = scanner.nextFloat();

        System.out.print("largura do azulejo: ");
        float larguraAzulejo = scanner.nextFloat();

        float areaParede = alturaParede * larguraParede;
        float areaAzulejo = alturaAzulejo * larguraAzulejo;

        int quantidadeAzulejos = (int) Math.ceil(areaParede / areaAzulejo);

        System.out.printf("\nSerão necessários %d azulejos para preencher a parede.\n", quantidadeAzulejos);

        scanner.close();
    }
}
