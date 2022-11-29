// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A, N, c;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();
        
        int result = 0 ;
        int multiplo = 0 ;
        
        c = 0;
        do {
          
          multiplo = A*c ;
          
          result = result + multiplo ;
          
          c = c + 1 ;
          
        } while ( multiplo < N ) ;
        
        System.out.println(result);
        //TODO:  Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".
        input.close();
    }
}