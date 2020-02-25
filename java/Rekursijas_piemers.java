package chapter;

import static java.lang.Math.ceil;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author rolan
 */
public class Chapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int skaitlis;
        Scanner scan=new Scanner(System.in);
        System.out.print("Ievadiet skaitli:");
        skaitlis=scan.nextInt();
        System.out.println(fact(skaitlis));
    }
    
    public static long fact(long n){
        if(n<=1)
            return 1;
        else
            return n*fact(n-1);
    }
}
