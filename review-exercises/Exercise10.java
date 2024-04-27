import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Insira o salario do funcionario: ");
        double salario = scanner.nextDouble();
        double aliquota = 0;

        if(salario > 0){
            if(salario <= 1434.59)
                aliquota = 0;
            else if(salario <= 2150)
                aliquota = 0.075;
            else if(salario <= 2866.7)
                aliquota = 0.15;
            else if(salario <=3582)
                aliquota = 0.225;
            else
                aliquota = 0.275;
        }

        double imposto = salario * aliquota;
        System.out.println("O imposto que deverá ser pago é de: " + imposto);

        scanner.close();
    }
}
