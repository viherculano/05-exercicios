import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        // declaração de variáveis

        Scanner sc = new Scanner(System.in);
        int numero;
        int invertido;
        int unidade;
        int dezena;
        int centena;

        // entrada de dados

        System.out.print("Digite o número de 3 dígitos ---> ");
        numero = sc.nextInt();

        // processamento de dados

        unidade = numero % 10;
        dezena = (numero / 10) % 10;
        centena = numero / 100;

        invertido = unidade * 100 + dezena * 10 + centena;

        // saída de dados

        System.out.println("O número invertido é ---> " + invertido);








    }
}
