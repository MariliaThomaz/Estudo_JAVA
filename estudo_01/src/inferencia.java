public class inferencia {
    public static void main(String[] args) {
        // Infere o tipo de dado com base no valor atribuído
        var numero = 42; // O compilador infere que 'numero' é do tipo int
        var texto = "Olá, mundo!"; // O compilador infere que 'texto' é do tipo String
        var decimal = 3.14; // O compilador infere que 'decimal' é do tipo double

        System.out.println("Número: " + numero);
        System.out.println("Texto: " + texto);
        System.out.println("Decimal: " + decimal);

        /*
         * O que é var no Java
         * O var não é um tipo neutro.
         * Ele usa inferência de tipo em tempo de compilação.
         * Ou seja: o compilador analisa o valor atribuído e define o tipo
         * automaticamente.
         * 
         * Ideia principal que você captou (e está correta) 🧠
         * 
         * Seu raciocínio foi muito bom:
         * 
         * "Talvez o var seja melhor para  algo local e não para algo estruturado do sistema"
         * 
         * Isso está exatamente alinhado com boas práticas reais de desenvolvimento.
         * 
         * var não é errado — ele é uma ferramenta de conveniência.
         */
    }
}
