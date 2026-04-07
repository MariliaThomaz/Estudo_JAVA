public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {
        // Conversão entre tipos primitivos numéricos
        // A conversão entre tipos primitivos numéricos pode ser feita de forma implícita ou explícita.
        // Conversão implícita (widening): ocorre quando um tipo de dado menor é convertido para um tipo de dado maior.
        int numInt = 100;
        long numLong = numInt; // Conversão implícita de int para long
        System.out.println("Número inteiro: " + numInt);
        System.out.println("Número longo (conversão implícita): " + numLong);

        // Conversão explícita (narrowing): ocorre quando um tipo de dado maior é convertido para um tipo de dado menor.
        double numDouble = 3.14;
        int numInt2 = (int) numDouble; // Conversão explícita de double para int
        System.out.println("Número double: " + numDouble);
        System.out.println("Número inteiro (conversão explícita): " + numInt2);

        float numFloat = 5.67F;
        // float numFloat = (float) 5.67; // Conversão explícita de double para float

        int numInt3 = (int) numFloat; // Conversão explícita de float para int
        System.out.println("Número float: " + numFloat);
        System.out.println("Número inteiro (conversão explícita): " + numInt3);

        //Trucamentos de conversão
        float numFloat2 = 9.9955489898F;
        int numInt5 = (int) numFloat2; // Conversão explícita de float para int
        System.out.println("Número float (truncado): " + numFloat2);
        System.out.println("Número inteiro (conversão explícita): " + numInt5);

        // problemas comveção questão tamnho como int para byte, ou seja,
        //  quando o valor do tipo maior excede a capacidade do tipo menor, ocorre
        //  um estouro de valor (overflow) e o resultado pode ser imprevisível.
        int numInt6 = 128;  
        byte numByte = (byte) numInt6; // Conversão explícita de int para byte
        System.out.println("Número inteiro: " + numInt6);
        System.out.println("Número byte (conversão explícita com estouro): " + numByte);
    }
}
