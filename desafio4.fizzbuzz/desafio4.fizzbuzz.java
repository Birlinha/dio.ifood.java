// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.*;

public class Desafio {
  
    static String fizzbuzz(int num) {
      String final_sentence = "";
      int mult = 0;
      int c = 0;
      
      do {
        mult = 3 * c;
        
        if( mult == num ) {
          final_sentence = final_sentence + "Fizz";
        }
        
        c = c + 1;
      } while ( mult < num );
      
      c = 0;
      
      do {
        mult = 5 * c;
        
        if( mult == num ) {
          final_sentence = final_sentence + "Buzz";
        }
        
        c = c + 1;
      } while ( mult < num );
      
      if(final_sentence == "") {
        String str = String.valueOf(num);
        return str;
      } else {
        return final_sentence;
      }
    }
  
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        int num = number.nextInt();
        String fn_answer = fizzbuzz(num);
        System.out.print(fn_answer);
                
        // TODO: Retorne a palavra correta de acordo com o múltiplo de "num". 
        // Caso o valor não seja múltiplo de 3 ou 5, exiba o número, conforme o enunciado.
        
    }
}