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
        
        Scanner scan = new Scanner(System.in);

	int[] masivs = new int[5];

	for (int i = 0; i < 5; i++) {
		System.out.print("Ievadiet elementu: ");
		masivs[i]=scan.nextInt();
	}

	for (int a = 0; a < 5; a++) {
		System.out.println(a+" masiva vertiba ir " + masivs[a]);
	}
    }
}
