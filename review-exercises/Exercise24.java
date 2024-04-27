// Exercício 24
// Elaborar um programa que escreva em tela os números de 1 a 20, informando quando eles
// são pares e quando são ímpares, utilizando o comando do-while( ).


public class Exercise24 {
    public static void main(String[] args) {
        int i = 1;

        do {
            if(i % 2 == 0)
                System.out.println(i + " - Par");
            else
                System.out.println(i + " - Impar");

            i++;
        } while(i <=20);
    }
}
