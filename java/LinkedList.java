package chapter;

import static java.lang.Math.ceil;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Rolands Linked list
 */
public class Chapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        LinkedList<String> object = new LinkedList<String>(); 
        
   
        for(int i=0;i<10;i++){ 
            System.out.println("Ievadiet elementu : ");
            object.add(scan.nextLine());
        }
        
        System.out.println("2 elements ir pamainits uz Zvaigzne");
        object.add(2, "Zvaigzne"); 
        System.out.println("Linked list : " + object); 
  
        
        System.out.println("Zvaigzne ir dzesta!");
        object.remove("Zvaigzne"); 
        System.out.println("Linked list : " + object); 
        System.out.println("3 elements ir dzests!");
        object.remove(3); 
        System.out.println("Linked list : " + object); 
        System.out.println("Pirmais elements ir dzests!");
        object.removeFirst(); 
        System.out.println("Linked list : " + object); 
        System.out.println("Pedejais elements ir dzests!");
        object.removeLast(); 
        System.out.println("Linked list after deletion: " + object); 
  

        boolean status = object.contains("Mango"); 
  
        if(status) 
            System.out.println("List contains the element 'Mango' "); 
        else
            System.out.println("List doesn't contain the element 'Mango'"); 
  

        int size = object.size(); 
        System.out.println("Size of linked list = " + size); 
  

        Object element = object.get(2); 
        System.out.println("Element returned by get() : " + element); 
        object.set(2, "Saulkrasti"); 
        System.out.println("Linked list after change : " + object);

    }
        
}
