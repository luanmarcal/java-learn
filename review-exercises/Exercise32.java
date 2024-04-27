// Exercício 32
// Encontre o menor elemento em um array.


public class Exercise32 {
    public static void main(String[] args) {
        int[] numeros = {6, 82, 2, 3, 1, 6, 7, 8, 9};
        int menor = 0;

        System.out.println("\nDado o seguinte array de numeros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");

            if(i == 0)
                menor = numeros[i];

            if(numeros[i] < menor)
            menor = numeros[i];
        }

        System.out.println("\nO menor numero eh: " + menor);
    }
}
