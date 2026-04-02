public class tipString {
    public static void main(String[] args) {
        // string não é um tipo primitivo, mas é amplamente utilizado para
        // representar texto, ele tambem não palavra reservada, mas é uma classe em Java
        String str = "Olá, mundo!";
        System.out.println("String: " + str);
        // utilisação dos pontos como usa -se para acessar os membros de uma
        // classe, como métodos e atributos.
        str.toUpperCase(); // Exemplo de uso do método toUpperCase() da classe String
        System.err.println(str);
        // O método toUpperCase() retorna uma nova string em maiúsculas, mas não altera
        // a
        // string original 'str', pois as strings em Java são imutáveis.
        str = str.toUpperCase(); // Agora 'str' referencia a nova string em maiúsculas
        System.out.println(str);

        System.out.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit. ".charAt(2));
        // O método charAt(0) retorna o caractere na posição 0 da string, que é 'L'.");

        String msg = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
        System.out.println(msg);
        // concatenação de string é a operação de combinar duas ou mais strings em uma
        // única string.
        String nome = "João";
        String sobrenome = "Silva";
        String nomeCompleto = nome + " " + sobrenome; // O operador '+' é usado para concatenar as strings
        System.out.println("Nome completo: " + nomeCompleto);
        //outra forma de concatenar string é usando o método concat() da classe String
        String nomeCompleto2 = nome.concat(" ").concat(sobrenome); // O método concat() é usado para concatenar as strings, e o espaço é adicionado entre o nome e o sobrenome.
        System.out.println("Nome completo 2: " + nomeCompleto2);   
        
          String msg2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
          System.err.println(msg2);
          System.out.println(msg2.startsWith("Lorem")); // O método startsWith("Lorem") verifica se a string 'msg2' começa com a sequência de caracteres "Lorem". Retorna true se começar, caso contrário, retorna false.
          System.out.println(msg2.endsWith("elit.")); // O método endsWith("elit.") verifica se a string 'msg2' termina com a sequência de caracteres "elit.". Retorna true se terminar, caso contrário, retorna false.
          System.out.println(msg2.contains("BOLA")); // O método contains("ipsum") verifica se a string 'msg2' contém a sequência de caracteres "ipsum". Retorna true se contiver, caso contrário, retorna false.
          System.out.println(msg2.length()); // O método length() retorna o número de caracteres na string 'msg2', incluindo espaços e pontuação. Retorna um valor inteiro representando a quantidade de caracteres.

           System.out.println(msg2.toLowerCase().startsWith("Lorem")); // O método toLowerCase() converte a string 'msg2' para minúsculas e o método startsWith("Lorem") verifica se a string resultante começa com a sequência de caracteres "Lorem". Retorna true se começar, caso contrário, retorna false.  
           System.out.println(msg2.toLowerCase().endsWith("elit.")); // O método toLowerCase() converte a string 'msg2' para minúsculas e o método endsWith("elit.") verifica se a string resultante termina com a sequência de caracteres "elit.". Retorna true se terminar, caso contrário, retorna false.

           var nome3 = "Maria";
           var sobrenome3 = "Oliveira";     
        var  idade3 = 30;
        var salario3 = 5000.0f;

        System.out.println("A senhora %s %s tem %d anos e ganha R$ %.2f por mês.".formatted(nome3, sobrenome3, idade3, salario3));
        // O método formatted() é usado para formatar a string de acordo com os valores
        //  fornecidos como argumentos. Ele substitui os marcadores de formato (%s, %d, %.2f) 
        // pelos valores correspondentes (nome3, sobrenome3, idade3, salario3) e 
        // retorna a string formatada.
        
    }
}