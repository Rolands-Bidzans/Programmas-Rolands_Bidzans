#include<iostream> 
#include<stack> 
using namespace std;

void showstack(stack <int> s)
{
	while (!s.empty())
	{
		cout << '\t' << s.top();
		s.pop();
	}
	cout << '\n';
}

int main(){

	bool beigt = true;
	stack<int> mystack;
	mystack.push(0);
	mystack.push(1);
	mystack.push(2);
	mystack.push(3);
	mystack.push(4);
	mystack.push(5);
	mystack.push(6);
	mystack.push(7);
	mystack.push(8);

	// Printing content of stack 
	while (!mystack.empty()) {
		 
		
		mystack.pop();
		cout << "stack  = ";
		showstack(mystack);
	}
	system("pause");
	return 0;
}