public class PrimitivoVsObjeto {
    public static void main(String[] var0) {
        //tipos primitivos
        // ele amazenam valores simples e diretos, como números, caracteres e valores booleanos.
        //  Eles são eficientes em termos de desempenho e uso de memória, mas não possuem métodos
        //  ou propriedades associados a eles.
        byte var1 = 100;
        short var2 = 10000;
        int var3 = 100000;
        long var4 = 10000000000L;
        float var6 = 3.14F;
        double var7 = Math.PI;
        char var9 = 'A';
        boolean var10 = true;
        System.out.println("byte: " + var1);
        System.out.println("short: " + var2);
        System.out.println("int: " + var3);
        System.out.println("long: " + var4);
        System.out.println("float: " + var6);
        System.out.println("double: " + var7);
        System.out.println("char: " + var9);
        System.out.println("boolean: " + var10);
        String var11 = "Olá, mundo!";
        System.out.println("String: " + var11);
        var11.toUpperCase();
        System.err.println(var11);
        var11 = var11.toUpperCase();
        System.out.println(var11);


        //objetos dos tipos primitivos 
        // wrapper classes (classes empacotadoras) para tipos primitivos
        //wrapper são a versão objetos dos tipos primitivos. 
        // Eles fornecem métodos e propriedades adicionais, além de permitir que os valores
        //  sejam tratados como objetos.
        Integer var12 = Integer.valueOf(var3);
        Double var13 = Double.valueOf(var7);
        System.out.println("Integer (wrapper): " + var12);
        System.out.println("Double (wrapper): " + var13);

    }
}