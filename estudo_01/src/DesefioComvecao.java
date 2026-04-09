/*
O desafio consiste em utilizar o Scanner do Java para capturar 3 
valores informados como String, correspondentes aos 3 últimos salários. 
Em seguida, será calculada a média desses valores. O programa deve permitir 
a entrada de números decimais utilizando vírgula ou ponto como separador 
decimal.
*/
import java.util.Scanner;

public class DesefioComvecao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os 3 últimos salários separados por espaço:");
        String valor1 = scanner.next().replace(",", ".");
        String valor2 = scanner.next().replace(",", ".");
        String valor3 = scanner.next().replace(",", ".");

        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);

        double media = (salario1 + salario2 + salario3) / 3;

        System.out.printf("A média dos salários é: %.2f%n", media);

        scanner.close();
    }
}
