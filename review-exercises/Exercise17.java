// Exercício 17
// Elaborar um programa que escreva em tela todos os números pares existentes entre 20 e 1,
// utilizando o comando while( ).


public class Exercise17 {
    public static void main(String[] args) {

        int num = 20;

        while (num >= 1) {
            if(num % 2 == 0)
                System.out.println(num);
            num--;
        }
    }
}
