public class DesafioAritimetico {
    /*
     * A olá o desafio vai tem que ser vou tem que usar Math.pow()
     * ( ([6 * (3 + 2)]² / (3 * 2)) − ((1 − 5) * (2 − 7) / 2)² )³
     * ---------------------------------------------------------
     *                          10³
     */
    public static void main(String[] args) {

   

        double parteA = Math.pow(6 * (3 + 2), 2) / (3 * 2);
        double parteB = Math.pow(((1 - 5) * (2 - 7) / 2), 2);

        double resultado = Math.pow(parteA - parteB, 3) / Math.pow(10, 3);

        System.out.printf("Resultado final: %.2f%n", resultado);
    }
}
