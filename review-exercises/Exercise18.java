// Exercício 18
// Elaborar um programa que escreva em tela os números de 1 a 20, informando quando eles
// são pares e quando são ímpares, utilizando o comando while( ).


public class Exercise18 {
    public static void main(String[] args) {

        int num = 1;

        while (num <= 20) {
            if(num % 2 == 0)
                System.out.println(num + " - Par");
            else
                System.out.println(num + " - Impar");
            num++;
        }
    }
}
