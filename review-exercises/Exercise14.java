// preco, massa, densidade

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Insira o preço do leite (por litro): ");
        float precoLeite = scanner.nextFloat();

        System.out.print("Insira a massa do leite (em kg): ");
        float massa = scanner.nextFloat();

        System.out.print("Insira a densidade do leite (em kg/l): ");
        float densidade = scanner.nextFloat();

        System.out.println("\nValores inseridos: Preço = " + precoLeite + ", Massa = " + massa + ", Densidade = " + densidade);

    
        if (densidade > 0) {
            if (densidade <= 1.14)
                System.out.println("\nCategoria I (abaixo de 1,14 kg/l)");
            else if (densidade <= 1.20)
                System.out.println("\nCategoria II (entre 1,14 e 1,20 kg/l)");
            else
                System.out.println("\nCategoria III (acima de 1,20 kg/l)");
            
            float volume = massa / densidade;
            float preco = volume * precoLeite;

            if (preco > 0) {
                System.out.printf("O preço a ser pago é de: %.2f\n", preco);
            } else {
                System.out.println("Erro no cálculo do preço.");
            }
        } else {
            System.out.println("\nDensidade invalida");
        }

        scanner.close();
        
    }
}
