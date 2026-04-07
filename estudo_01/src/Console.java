public class Console {
    public static void main(String[] args) {
        // O console é uma interface de linha de comando que permite a interação do usuário com o 
        //programa. Ele é usado para exibir mensagens, receber entrada do usuário e 
        // realizar operações de entrada/saída.

        // Imprime uma mensagem no console
        System.out.println("Bem-vindo ao console!");

        // Recebe entrada do usuário
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");

        // Fechar o scanner para evitar vazamento de recursos
        scanner.close();

        /*
        Mas ele  fez  importação direta da classe Scanner usando o nome completo (java.util.Scanner) em vez de usar uma declaração de importação no início do arquivo.
        
        Scanner entrada  =  new Scanner(System.in);
         */
    }

}
