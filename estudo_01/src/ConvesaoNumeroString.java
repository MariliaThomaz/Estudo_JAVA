import javax.swing.JOptionPane;

public class ConvesaoNumeroString {
    public static void main(String[] args) {
        // Conversão entre números e strings
        // A conversão entre números e strings é comum em programação, especialmente quando lidamos com entrada e saída de dados.
        // Para converter um número para uma string, podemos usar o método toString() ou a concatenação de strings.
        int numero = 123;
        String numeroString1 = Integer.toString(numero); // Usando toString()
        String numeroString2 = "" + numero; // Usando concatenação de strings

        System.out.println("Número: " + numero);
        System.out.println("Número convertido para string (toString): " + numeroString1);
        System.out.println("Número convertido para string (concatenação): " + numeroString2);

        // Para converter uma string para um número, podemos usar os métodos parseInt(), parseDouble(), etc., dependendo do tipo de número que queremos.
        String strNumero = "456";
        try {
            int numeroConvertido = Integer.parseInt(strNumero); // Convertendo string para int
            System.out.println("String convertida para número: " + numeroConvertido);
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Por favor, digite um número válido.");
        }

        //comveção de strting para double
        String strDouble = "3.14";  
        try {
            double doubleConvertido = Double.parseDouble(strDouble); // Convertendo string para double
            System.out.println("String convertida para double: " + doubleConvertido);
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Por favor, digite um número válido.");
        }
        // Exemplo de conversão usando JOptionPane para entrada de dados
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro nome");  
        String valor2 = JOptionPane.showInputDialog("Digite o segundo nome");
        try {         int numero1 = Integer.parseInt(valor1);
            int numero2 = Integer.parseInt(valor2);
            int soma = numero1 + numero2;
            System.out.println("A soma dos números é: " + soma);
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Por favor, digite números válidos.");
        }
    }
}
