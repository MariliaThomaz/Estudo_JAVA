public class Atribuicao {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Atribuição simples
        a = 15; // a agora é 15
        System.out.println("Valor de a: " + a);

        // Atribuição composta
        b += 5; // b agora é 25 (20 + 5)
        System.out.println("Valor de b: " + b);

        a *= 2; // a agora é 30 (15 * 2)
        System.out.println("Valor de a: " + a);

        b /= 5; // b agora é 5 (25 / 5)
        System.out.println("Valor de b: " + b);

        a -= 10; // a agora é 20 (30 - 10)
        System.out.println("Valor de a: " + a);

        //operadores unários
        a++; // a agora é 21 (20 + 1)   
        System.out.println("Valor de a: " + a);
        b--; // b agora é 4 (5 - 1)
        System.out.println("Valor de b: " + b);
        int c = -a; // c agora é -21 (negação de a)
        System.out.println("Valor de c: " + c);

        int f = 1;
        int g =2;
        System.out.println("mini dessafio: ");
    System.err.println(++f == g--); // pré-incremento de f e pós-decremento de g
    // o que acontente aqui é nivel de  presendencia de operadores, 
    // o pré-incremento de f ocorre antes da comparação, 
    // então f é incrementado para 2 antes de ser comparado com g.
    //  O pós-decremento de g ocorre após a comparação, 
    // então g é comparado com 2 antes de ser decrementado para 
    // 1. Portanto, a expressão (++f == g--) avalia como true, 
    // porque f é incrementado para 2 e g é comparado com 2 
    // antes de ser decrementado.

    }   
}
