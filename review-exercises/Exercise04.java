// Exercício 4 
// L  A  empresa  XYZ  decidiu  conceder  um  aumento  de  salários  a  seus  funcionários  de  acordo 
// com a tabela abaixo: 
 
// SALÁRIO ATUAL ÍNDICE DE AUMENTO 
// 0 – 400 15% 
// 401 – 700 12% 
// 701 – 1000 10% 
// 1001 – 1800 7% 
// 1801 – 2500 4% 
// ACIMA DE 2500 SEM AUMENTO 
 
// Escrever    um    algoritmo    que    lê,    para    cada    funcionário,    o    seu    nome    e    o    seu    salário  
// atual.    Após  receber  estes  dados,  o  algoritmo  calcula  o  novo  salário  e  escreve  na  tela  as 
// seguintes informações: 
// <nome do funcionário> <% de aumento> <salário atual>   <novo salário>

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o nome do funcionario: ");
        String nome = scanner.next();

        System.out.print("Insira o salario atual: ");
        float salario = scanner.nextFloat();
        int aumento = 0;
        float novoSalario = 0;

        if(salario > 0){
            if(salario <= 400){
                aumento = 15;
                novoSalario = (salario + (salario * 0.15f));
            } else if(salario <= 700){
                aumento = 12;
                novoSalario = (salario + (salario * 0.12f));
            } else if(salario <= 1000) {
                aumento = 10;
                novoSalario = (salario + (salario * 0.10f));
            } else if(salario <= 1800){
                aumento = 7;
                novoSalario = (salario + (salario * 0.07f));
            } else if(salario <= 2500){
                aumento = 4;
                novoSalario = (salario + (salario * 0.04f));
            } else{
                aumento = 0;
                novoSalario = salario;
            }
        }

        System.out.printf("%n%s - %d%% | %.2f = %.2f | %n", nome, aumento, salario, novoSalario);

        scanner.close();
    }
}
