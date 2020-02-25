package chapter;

import static java.lang.Math.ceil;
import java.util.Scanner;

/**
 *
 * @author Rolands Java Chapter1 Binary search + linear search
 */
public class Chapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
    	System.out.println("Ievadiet skaitlu garumu:");
	int maxSkaits;
	maxSkaits=scan.nextInt();
	int[] skaitli = new int[maxSkaits];

	for (int i = 1; i <= maxSkaits; i++) {
		skaitli[i - 1] = i;
	}

	System.out.println("Ievadiet kuru skaitli meklet:");

	int searchNum;
	searchNum=scan.nextInt();;
	int minNum = 0;
	int maxNum = maxSkaits-1 ;
	boolean atrasts = false;
	int reizes = 1;
	int midNum ;

	if (searchNum > 1 || searchNum < maxSkaits) {
		if (searchNum != maxSkaits) {
			while (atrasts == false) {
				reizes++;
				midNum = (maxNum + minNum) / 2;

				if (searchNum == skaitli[(int)Math.round(midNum)]) {
					System.out.println("Mekletais skaitlis atrodas masiva elementa Nr." + midNum);
					System.out.println("Tika veikti " + reizes + " cikli, lai atrastu masiva mekleto skaitli!(Binarais)");
					atrasts = true;
				}
				else if (searchNum < skaitli[(int) Math.round(midNum)]) {
					maxNum = midNum;
				}
				else {
					minNum = midNum;
				}
			}


			int a = 0;
			boolean sakrit = true;
			while (sakrit != false) {
				if (skaitli[a] == searchNum) {
					sakrit = false;
					System.out.print("Tika veikti " + (a + 1));
					System.out.println("cikli ,lai atrastu mekleto masivu (Linearais)");
				}
				a++;
			}

		}
		else {
			System.out.println("Mekletais skaitlis atrodas masiva elementa Nr.0\n");
			System.out.println("Tika veikti " + reizes + " cikli, lai atrastu masiva mekleto skaitli!\n");
		}

	}
	else {
		System.out.println("Skaitlis neiederas pec parametriem!");
	}

    }
        
}
