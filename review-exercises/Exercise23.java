// Exercício 23
// Elaborar um programa que escreva em tela todos os números pares existentes entre 1 e 20,
// utilizando o comando do-while( ).


public class Exercise23 {
    public static void main(String[] args) {
        int i = 1;

        do {
            if(i % 2 == 0)
                System.out.println(i);

            i++;

        } while(i <= 20);
    }
}
