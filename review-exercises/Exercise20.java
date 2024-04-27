// Exercício 20
// Elaborar um programa que escreva em tela todos os números impares existentes entre 1 e
// 20, utilizando o comando for( ).


public class Exercise20 {
    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            if(i % 2 != 0)
                System.out.println(i);
        }
        
    }
}
