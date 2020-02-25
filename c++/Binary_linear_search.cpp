#include <iostream>
#include <cmath>



int main() {

	std::cout << "Ievadiet skaitlu garumu:";
	int maxSkaits;
	std::cin >> maxSkaits;
	int* skaitli = new int[maxSkaits];

	for (int i = 1; i <= maxSkaits; i++) {
		skaitli[i - 1] = i;
	}

	std::cout << "Ievadiet kuru skaitli meklet:";

	int searchNum;
	std::cin >> searchNum;
	int minNum = 0;
	int maxNum = maxSkaits - 1;
	bool atrasts = false;
	int reizes = 1;
	int midNum;
	
	if ( searchNum <= maxSkaits & searchNum >= 1  ) {
		if (searchNum != maxSkaits) {
			while (atrasts == false) {
				reizes++;
				midNum = (maxNum + minNum) / 2;

				if (searchNum == skaitli[(int)round(midNum)]) {
					std::cout << "Mekletais skaitlis atrodas masiva elementa Nr." << midNum << "\n";
					std::cout << "Tika veikti " << reizes << " cikli, lai atrastu masiva mekleto skaitli!(Binarais)\n";
					atrasts = true;
				}
				else if (searchNum < skaitli[(int)round(midNum)]) {
					maxNum = midNum;
				}
				else {
					minNum = midNum;
				}
			}


			int a = 0;
			bool sakrit = true;
			while (sakrit != false) {
				if (skaitli[a] == searchNum) {
					sakrit = false;
					std::cout << "Tika veikti " << a + 1;
					std::cout << "cikli ,lai atrastu mekleto masivu (Linearais)\n";
				}
				a++;
			}

		}
		else {
			std::cout << "Mekletais skaitlis atrodas masiva elementa Nr"<<(maxSkaits-1)<<"\n";
			std::cout << "Tika veikti " << reizes << " cikli, lai atrastu masiva mekleto skaitli!\n";
			std::cout << "Tika veikti " << maxSkaits << " cikli, lai atrastu masiva mekleto skaitli!\n";
		}

	}
	else {
		std::cout << "Skaitlis neiederas pec parametriem!";
	}

	system("pause");
	return 0;
}