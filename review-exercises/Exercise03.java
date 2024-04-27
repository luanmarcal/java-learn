// Exercício 3 
// Fazer    um    algoritmo    que    escreva    o    conceito    de    um    aluno,    dada    a    sua    nota.    Supor 
// notas inteiras somente. O critério para conceitos é o seguinte: 
 
// Nota Conceito 
// nota inferiores a 3 conceito E 
// nota de 3 a 5 conceito D 
// notas 6 e 7 conceito C 
// notas 8 e 9 conceito B 
// nota 10 conceito A

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a nota do aluno: ");
        int nota = scanner.nextInt();
        String conceito = null;

        if(nota < 3)
            conceito = "E";
        else if(nota >= 3 && nota <= 5)
            conceito = "D";
        else if(nota >= 6 && nota <= 7)
            conceito = "C";
        else if(nota >= 8 && nota <= 9)
            conceito = "B";
        else if (nota == 10)
            conceito = "A";
        else
            conceito = "invalido";

        System.out.println("Conceito do Aluno: " + conceito);

        scanner.close();
    }
}
