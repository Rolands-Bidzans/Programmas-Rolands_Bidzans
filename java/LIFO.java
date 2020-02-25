package chapter;

import static java.lang.Math.ceil;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Rolands LIFO
 */
public class Chapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean beigt=false;
        int atbilde=1;
        Stack<String> stackOfCards = new Stack<>();
        String jaunaVertiba="";
        // Pushing new items to the Stack
         Scanner input = new Scanner(System. in);
        
        System.out.print("Ievadiet cik daudz elementus ievadisiet");
        int reizes=input.nextInt();
        
        input.nextLine();
        for(int i=0;i<reizes;i++){
            System.out.print("Ievadiet elementu:");
            jaunaVertiba=input.nextLine();
            stackOfCards.push(jaunaVertiba);
        }

        System.out.println("Stack => " + stackOfCards);
        System.out.println();

        
        
        while(stackOfCards.indexOf(stackOfCards.peek())>1 || beigt!=true){
            System.out.print(stackOfCards.indexOf(stackOfCards.peek())+" != 1");
            String cardAtTop = stackOfCards.pop();  
            System.out.println("Stack.pop() => " + cardAtTop);
            System.out.println("Current Stack => " + stackOfCards);
            cardAtTop = stackOfCards.peek();
            System.out.println("Stack.peek() => " + cardAtTop);
            System.out.println();
            System.out.print("Vai iznemt vel vienu elementu?:");

                    
            atbilde=input.nextInt();
            if(atbilde==0){
                beigt=true;
            }
            
           
        }
    }
        
}
