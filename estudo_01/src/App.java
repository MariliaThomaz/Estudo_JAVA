public class App {
  // main é o ponto de entrada do programa, onde a execução começa
  public static void main(String[] args) {
    // Imprime "Hello, World!" no console
    System.out.println("Hello, World!");

    float respota = 0.0f;
    // ao usar final, a variável se torna uma constante, ou seja, seu valor não pode
    // ser alterado após a atribuição inicial
    final int valor2 = 10;
    respota = valor2 / 4.0f;
    // atalio para (sysoi) que é um atalho para System.out.println
    System.out.println("conta de padaria: " + respota);

    System.out.println("___Faça a conversão temperatura Fahrenheit para Celsius___ ");
    float fahrenheit = 100.0f;
    // Porque usa 100.0f? O sufixo 'f' indica que o número é do tipo float, e 100.0
    // é um valor de ponto flutuante que representa a temperatura em Fahrenheit que
    // queremos converter para Celsius.
    final float divisor = 5.0f; // O sufixo 'f' indica que o número é do tipo float, e 5.0 é um valor de ponto
                                // flutuante que representa o divisor usado na fórmula de conversão de
                                // Fahrenheit para Celsius.
    final float multiplicador = 9.0f; // O sufixo 'f' indica que o número é do tipo float, e 9.0 é um valor de ponto
                                      // flutuante que representa o multiplicador usado na fórmula de conversão de
                                      // Fahrenheit para Celsius.
    float celsius = (fahrenheit - 32) * divisor / multiplicador;
    System.out.println(fahrenheit + " graus Fahrenheit é igual a " + celsius + " graus Celsius.");

    System.out.println("___Faça a conversão temperatura Celsius para Fahrenheit___ ");
    celsius = 100.0f;
    float fahrenheit2 = (celsius * multiplicador / divisor) + 32;
    System.out.println(celsius + " graus Celsius é igual a " + fahrenheit2 + " graus Fahrenheit.");

    //infencia de tipo é a capacidade do compilador de deduzir o tipo de uma variável com base no valor atribuído a ela.
     var idade = 25; // O compilador infere que 'idade' é do tipo int com base no valor inteiro atribuído a ela.
     var nome = "João"; // O compilador infere que 'nome' é do tipo String com base no valor de texto atribuído a ela.
     System.out.println("Idade: " + idade); 
     System.out.println("Nome: " + nome);


     //int a = 10;    
    // a = "bala" isto não pode atribuir um valor do tipo String a uma variável do tipo int, 
    
  }
}