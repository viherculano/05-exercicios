import java.text.DecimalFormat;
import java.util.Scanner;

public class INSS {
    public static void main(String[] args) {

        // declaração de variáveis

        Scanner sc = new Scanner(System.in);

        double valorhora;
        double horastrabalhadas;
        double descontoINSS;
        double salariobruto;
        double salarioliquido;
        double valordesconto;

        // entrada de dados

        System.out.print("Digite o valor da hora-aula ---> ");
        valorhora = sc.nextDouble();
        System.out.print("Digite o número de horas trabalhadas no mês ---> ");
        horastrabalhadas = sc.nextDouble();
        System.out.print("Digite a porcentagem de desconto do INSS ---> ");
        descontoINSS = sc.nextDouble();

        // processamento de dados

        salariobruto = valorhora * horastrabalhadas;
        valordesconto = salariobruto * descontoINSS / 100;
        salarioliquido = salariobruto - valordesconto;

        // saída de dados

        System.out.println("O valor do salário liquído mensal é ---> " + String.format("%.2f", salarioliquido));







    }
}
