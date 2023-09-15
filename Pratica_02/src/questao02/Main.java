package questao02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor inicial do investimento: ");
        double vrInicial = scanner.nextDouble();

        System.out.println("Digite a taxa de juros:");
        double txJuros = scanner.nextDouble();

        System.out.println("Digite o número de meses para o rendimento: ");
        int numMeses = scanner.nextInt();

        Rendimento r1 = new Rendimento(vrInicial,txJuros,numMeses);
        r1.calculaRendimento();

    }

}
