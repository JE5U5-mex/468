
package desafio;

import java.util.Scanner;

/**
 *
 * @author andrey josè nogueira
 */
public class Desafio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   String nome;
       int idade, diasVida;
       Scanner ler = new Scanner(System.in);
       
        System.out.println("Informe o nome:");
        nome = ler.nextLine();
        System.out.println("Informe a idade:");
        idade = ler.nextInt();
        
        diasVida = idade * 468;
        System.out.println(nome+", VOCÊ JÁ VIVEU "+diasVida +" dias" );

    }
    
}
