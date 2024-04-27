// Exercício 34
// Copie os elementos de um array para outro array.


public class Exercise34 {
    public static void main(String[] args) {
        String[] frutas = {"Abacate", "Banana", "Jaca", "Laranja"};
        String[] copia = new String[frutas.length];

        // poderia ser feito assim:
        // System.arraycopy(frutas, 0, copia, 0, frutas.length);

        System.out.println("\nOs seguintes elementos serao copiados:");
        for (int i = 0; i < frutas.length; i++) {
            System.out.print(frutas[i] + " ");
            copia[i] = frutas[i];
        }

        System.out.println("\n\nOs elementos copiados sao:");
        for (int i = 0; i < copia.length; i++) {
            System.out.print(copia[i] + " ");
        }

        System.out.println("\n");
    }   
}
