// Exercício 31
// Encontre o maior elemento em um array.


public class Exercise31 {
    public static void main(String[] args) {
        int[] numeros = {0, 1, 2, 3, 52, 6, 7, 8, 9};
        int maior = 0;

        System.out.println("\nDado o seguinte array de numeros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
            if(numeros[i] > maior)
                maior = numeros[i];
        }

        System.out.println("\nO maior numero eh: " + maior);
    }
}
