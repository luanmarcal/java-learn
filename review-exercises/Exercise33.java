// Exercício 33
// Verifique se um array contém um determinado elemento.


public class Exercise33 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6};
        int elementoBuscado = 7;
        boolean encontrado = false;

        System.out.println("\nDado o seguinte array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
            if(numeros[i] == elementoBuscado)
                encontrado = true;
        }

        if(encontrado)
            System.out.println("\nO elemento\"" + elementoBuscado + "\" foi encontrado no array");
        else
            System.out.println("\nO elemento \"" + elementoBuscado + "\" nao foi encontrado no array"); 
    }
}
