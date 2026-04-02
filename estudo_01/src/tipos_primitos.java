public class tipos_primitos {
    public static void main(String[] args) {
        // Tipos primitivos em Java
        byte b = 100; // 8 bits, de -128 a 127
        short s = 10000; // 16 bits, de -32.768 a 32.767
        int i = 100000; // 32 bits, de -2.147.483.648 a 2.147.483.647
        long l = 10000000000L; // 64 bits, de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807

        float f = 3.14f; // 32 bits, precisão de aproximadamente 7 dígitos decimais
        double d = 3.141592653589793; // 64 bits, precisão de aproximadamente 15 dígitos decimais

        char c = 'A'; // 16 bits, representa um único caractere Unicode
        boolean bool = true; // Representa um valor lógico (true ou false)

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
    }
    
}
