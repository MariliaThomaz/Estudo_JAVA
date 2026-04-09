public class DesafioLogicos {
    /*
     * Desafio Lógico
     * Eu sou uma estudante e meu professor me deu um trabalho que vai ser entregue
     * na terça e outro na quinta-feira.
     * Caso um trabalho der certo eu vou ganhar um chocolate  dos meus pais, mas se
     * os dois trabalhos derem certo e se derem errado eu não vou ganhar nada,
     *  mas se e trabalho de terça-feira e quinta-feira der certo eu vou fazer uma viagem para
     * Disney.
     * 
     */
    public static void main(String[] args) {
        boolean trabalhoTerca = true; // true representa que o trabalho da terça-feira deu certo, false representa que
                                      // deu errado
        boolean trabalhoQuinta = false; // true representa que o trabalho da quinta-feira deu certo, false representa
                                        // que deu errado

        if (trabalhoTerca && trabalhoQuinta) {
            System.out.println("Parabéns! Você fazer uma viagem para Disney!");
        } else if (trabalhoTerca || trabalhoQuinta) {
            System.out.println("Parabéns! Você ganhou um chocolate!");
        } else {
            System.out.println("Infelizmente, você não ganhou nada.");
        }
    }
}