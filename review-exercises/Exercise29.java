// Exercício 29 
// Calcule a soma dos números em um array, utilizando um comando de iteração. 


public class Exercise29 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3};
        int soma = 0;

        System.out.println("A soma do vetor com os seguintes numeros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
            soma += numeros[i]; 
        }

        System.out.println("\neh de = " + soma);
    }
}
