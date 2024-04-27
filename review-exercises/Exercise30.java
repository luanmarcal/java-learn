// Exercício 30
// Conte o número de vogais em uma String, utilizando um comando de iteração.


public class Exercise30 {
    public static void main(String[] args) {
        String palavra = "batata";
        int count = 0;

        for (int i = 0; i < palavra.length(); i++) {
            char c = Character.toLowerCase(palavra.charAt(i));

            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                count++;
        }

        System.out.println("\nO numero de vogais na palavra \"" + palavra + "\" eh de = " + count);

    }
}
