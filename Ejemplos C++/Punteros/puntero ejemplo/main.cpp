#include <iostream> //para las operaciones de entrada y salida.
#include <conio.h> //provee un sistema de entrada y salida por consola.
using namespace std;

int main(int argc, char** argv) {
	// &n = la direccion de n.
	// *n = La variable cuya direccion esta almacenada en n.
	
	
	int num, *dir_num;//Declaramos una variable y un puntero
	
	num = 30;
	dir_num = &num;
	
	cout<<"Numero: "<<*dir_num<<endl;
	cout<<"Direccion de memoria: "<<dir_num<<endl;
	
	return 0;
}
