// Exercício 8 
// Elaborar    um    programa  para  receber  valores,    via    teclado,    nas    variáveis    "a"  e  "b".  Após 
// isto,  o  programa,  utilizando-se  de  uma  3a.  variável  "c",  deverá  trocar  o  conteúdo  das 
// variáveis "a" e "b". 

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Insira o valor de A: ");
    String a = scanner.next();

    System.out.print("Insira o valor de B: ");
    String b = scanner.next();

    String c = a;

    a = b;
    b = c;

    System.out.println("\nInvertendo os valores...");
    System.out.println("Valor de A: " + a);
    System.out.println("Valor de B: " + b);

    scanner.close();
    }
}
