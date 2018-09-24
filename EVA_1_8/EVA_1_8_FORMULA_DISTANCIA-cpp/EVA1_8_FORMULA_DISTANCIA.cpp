//Isela Alejandra Ponce de León Carrasco
#include<iostream>
using namespace std;
int main (){
	float vi, vf, tiempo, velprom;
	cout<<"Ingrese la velocidad inicial"<<endl;
	cin>>vi;
	
	cout<<"Ingrese la velocidad final"<<endl;
	cin>>vf;
	
	cout<<"Ingrese el tiempo"<<endl;
	cin>>tiempo;
	
	velprom = (vi+vf)/2*tiempo;
	
	cout<<"La velocidad promedio que recorriste es de "<<velprom<<" Km/h"<<endl;
	return 0;
}
