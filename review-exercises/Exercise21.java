// Exercício 21
// Elaborar um programa que escreva em tela os números de 20 a 1, informando quando eles
// são pares e quando são ímpares, utilizando o comando for( ).


public class Exercise21 {
    public static void main(String[] args) {
        for(int i = 20; i >= 1; i--){
            if(i % 2 == 0)
                System.out.println(i + " - Par");
            else
                System.out.println(i + " - Impar");
        }
    }
}
