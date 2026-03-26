import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        // declaração de variáveis

        Scanner sc = new Scanner(System.in);
        int numero;
        int dezena;

        // entrada de dados

        System.out.print("Digite os três dígitos ---> ");
        numero = sc.nextInt();

        // processamento de dados

        dezena = (numero / 10) % 10;

        // saída de dados

        System.out.println("O valor da dezena é ---> " + dezena);


    }
}
