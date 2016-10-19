#include <iostream>
#include <unistd.h>
main(){

	int number;
	
	std::cout << "L'ID del processo e': " << getpid() << std::endl;

	std::cout <<"Inserisci un numero: " << std::endl;
	std::cin >> number;



}
