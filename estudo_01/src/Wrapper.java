import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {
        // Wrapper classes são classes que encapsulam tipos primitivos em objetos.
        // Eles fornecem métodos e propriedades adicionais, além de permitir que os valores sejam 
        // tratados como objetos.
        // As wrapper classes correspondentes aos tipos primitivos são:
        // byte -> Byte
        // short -> Short
        // int -> Integer
        // long -> Long
        // float -> Float
        // double -> Double
        // char -> Character
        // boolean -> Boolean

        int numPrimitivo = 42;
        Integer numWrapper = Integer.valueOf(numPrimitivo); // Convertendo int para Integer

        System.out.println("Valor primitivo: " + numPrimitivo);
        System.out.println("Valor wrapper: " + numWrapper);

        // Usando métodos da classe wrapper
        int valorMaximo = Integer.MAX_VALUE;
        int valorMinimo = Integer.MIN_VALUE;

        System.out.println("Valor máximo de Integer: " + valorMaximo);
        System.out.println("Valor mínimo de Integer: " + valorMinimo);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: "); 
        String input = scanner.nextLine();
        try {
            int numeroConvertido = Integer.parseInt(input); // Convertendo String para int
            // todo valor que retona do usario ela vem como string, 
            // entao para converter para um numero inteiro usamos o metodo parseInt da classe Integer
            System.out.println("Número convertido: " + numeroConvertido);
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
        }   
        scanner.close();
    }

}
