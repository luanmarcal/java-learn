import java.util.Scanner;

public class Exercise27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean showMenu = true;
        int opcao;

        while(showMenu){
            System.out.println("\nDigite a opcao desejada:");
            System.out.println("\t1 - Cadastro de Produtos");
            System.out.println("\t2 - Cadastro de Clientes");
            System.out.println("\t3 - Contas a Pagar");
            System.out.println("\t4 - Contas a Receber");
            System.out.println("\t5 - Relatorios");
            System.out.println("\t0 - Sair");
            opcao = scanner.nextInt();

            if(opcao == 0){
                showMenu = false;
                System.out.println("\nAte logo...");
            }
            else
                System.out.println("Voce escolheu a opcao: " + opcao);
        }

        scanner.close();
    }
}
