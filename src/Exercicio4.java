import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        // declaração de variáveis

        Scanner sc = new Scanner(System.in);
        double salariominimo;
        int kwconsumido;
        double valorkw;
        double valortotal;

        //entrada de dados

        System.out.print("Digite o valor do salário mínimo ---> ");
        salariominimo = sc.nextDouble();
        System.out.print("Digite a quantidade de Kw consumidos ---> ");
        kwconsumido = sc.nextInt();

        // processamento de dados

        valorkw = salariominimo / 7 / 100;
        valortotal = valorkw * kwconsumido;

        // saída de dados

        System.out.println("Valor da conta " + valortotal);
        System.out.println("Valor do Kw R$ " + valorkw);
        System.out.println("Valor da conta com 10% de desconto R$ " + valortotal * 0.9);




        



    }
}
