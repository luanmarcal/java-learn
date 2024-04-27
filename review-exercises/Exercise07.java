import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInsira as informacoes do individuo...");

        System.out.print("Peso: ");
        float peso = scanner.nextFloat();

        System.out.print("Altura: ");
        float altura = scanner.nextFloat();

        float imc = peso / (altura * altura);
        String condicao = "";

        if (imc > 0) {
            if (imc <= 18.5)
                condicao = "abaixo do peso";
            else if (imc <= 25)
                condicao = "peso normal";
            else if (imc <= 30)
                condicao = "acima do peso";
            else
                condicao = "obeso";
        } else {
            condicao = "IMC inválido";
        }

        System.out.printf("\nO IMC do individuo eh de: %.2f\n", imc);
        System.out.println("O individuo esta na condicao: " + condicao);

        scanner.close();
    }
}
