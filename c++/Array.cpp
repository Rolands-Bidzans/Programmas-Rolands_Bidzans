#include <iostream>
#include <string>
#include <stack>
#include <cmath>



int main() {


		int* masivs = new int[5];

		for (int i = 0; i < 5; i++) {
			std::cout << "Ievadiet elementu: ";
			std::cin >> masivs[i];
		}

		for (int a = 0; a < 5; a++) {
			std::cout << a << " masiva vertiba ir " << masivs[a] << "\n";
		}

		system("pause");
		return 0;

}
