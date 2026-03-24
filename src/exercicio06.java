import java.util.Scanner;

public class exercicio06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horasTrabalhadas;
        double valorAula, porcentagemInss;
        double salarioBruto, salarioLiquido;
        double  valorDesconto;

        //Entrada de dados

        System.out.print("Valor da aula --> R$ ");
         valorAula = sc.nextDouble();
        System.out.print("Total de horas trabalhadas --> R$ ");
         horasTrabalhadas = sc.nextInt();
        System.out.print("Porcentagem de desconto do INSS --> ");
         porcentagemInss = sc.nextDouble();

         //processamento de dados
         salarioBruto = horasTrabalhadas * valorAula;

        valorDesconto = salarioBruto * porcentagemInss / 100;

        salarioLiquido = salarioBruto - valorDesconto;

        //saída de dados

        System.out.println("Salario Liquido: R$ " + String.format("%.2f", salarioLiquido));


    }
}