public class Logicas {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Operadores lógicos
        boolean resultado1 = (a < b) && (b > 15); // true && true -> true
        boolean resultado2 = (a > b) || (b > 15); // false || true -> true
        boolean resultado3 = !(a < b); // !true -> false

        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2: " + resultado2);
        System.out.println("Resultado 3: " + resultado3);

        boolean resultado4 = (a == 10) && (b == 20); // true &&(e= and) true -> true
        boolean resultado5 = (a != 10) || (b != 20); // false ||(ou- or) false -> false
        boolean resultado6 = (a > b) ^ (b < 30); // false ^(ou exclusivo = XOR) true -> true
        boolean resultado7 = (a > b) ^ (b < 15); // false ^(ou exclusivo = XOR) false -> false  
        boolean resultado8 = !(a > b) && (b < 30); // (!negação true) && true -> true
         boolean resultado9 = (a > b) && (b < 30); // false && true -> false
        System.out.println("Resultado 4: " + resultado4);
        System.out.println("Resultado 5: " + resultado5);
        System.out.println("Resultado 6: " + resultado6);
        System.out.println("Resultado 7: " + resultado7);
        System.out.println("Resultado 8: " + resultado8);
        System.out.println("Resultado 9: " + resultado9);

    }
}
