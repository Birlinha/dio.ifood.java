// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.*;

public class Desafio {

    public static void main(String[] args) {
        //TODO: Imprima se os valores numéricos passados são iguais ou não.
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        
        int b = scanner.nextInt();
        
        System.out.print( (a==b)?"Sao iguais!":"Nao sao iguais!" );
        scanner.close();
    }
}