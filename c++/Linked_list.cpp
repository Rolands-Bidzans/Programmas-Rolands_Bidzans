#include <iostream>
#include <cstddef> 
#include <string>
using namespace std;


class Node
{
public:
	string data;
	Node *next;
};

void deleteNode(Node *head, Node *n)
{
	
	if (head == n)
	{
		if (head->next == NULL)
		{
			cout << "There is only one node." <<
				" The list can't be made empty ";
			return;
		}

		
		head->data = head->next->data;

		
		n = head->next;

		
		head->next = head->next->next;

		 
		free(n);

		return;
	}



	Node *prev = head;
	while (prev->next != NULL && prev->next != n)
		prev = prev->next;

	
	if (prev->next == NULL)
	{
		cout << "\nGiven node is not present in Linked List";
		return;
	}

	 
	prev->next = prev->next->next;

	 
	free(n);

	return;
}


void push(Node **head_ref, string new_data)
{
	Node *new_node = new Node();
	new_node->data = new_data;
	new_node->next = *head_ref;
	*head_ref = new_node;
}


void printList(Node *head)
{
	while (head != NULL)
	{
		cout << head->data << " ";
		head = head->next;
	}
	cout << endl;
}


int main()
{
	Node *head = NULL;
	string elements;
	for (int i = 0; i < 10; i++) {
		std::cout << "Ievadiet elementu: ";
		std::cin >> elements;
		push(&head,elements);
	}

	cout << "Dots Linked List: ";
	printList(head);

	
	cout << "\nDzest node " << head->next->next->next->data << " ";
	deleteNode(head, head->next->next->next);

	cout << "\nModificets Linked List: ";
	printList(head);


	cout << "\nDzest pirmais node ";
	deleteNode(head, head);

	cout << "\nModificets Linked List: ";
	printList(head);

	system("pause");
	return 0;
}