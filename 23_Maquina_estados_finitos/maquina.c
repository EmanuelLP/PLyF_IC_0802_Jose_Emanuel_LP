#include <stdio.h>
#include <stdlib.h>
#include<stdbool.h>
//Se genera un menu que valide las entredas sean del rango mencionado
int  menu(){
	int evento;
	bool bandera = false;
	do{
		printf ("0.- no_carros\n1.-carros_este\n10.-carros_norte\n11.-ambos_lados\n");
		printf("Ingrese una accion\n");	
		scanf("%i",&evento);
		if(evento == 0 || evento == 1 || evento == 10 || evento == 11){
			bandera = true;
			return evento;
		}else{
			printf("\t\tOpcion no valida intente de nuevo\n");	
			bandera = false;
		}
	}while(bandera==false);
}

int main(){
		int evento;
		//Se ejecuta en un ciclo infinito
		//Se da un tiempo de espera con sleep 1000 = 1 segundo
		do{
			printf("\t\t\tgo norte\n");
			evento= menu();
			//	Despues de tener la entrada se compara y se tiene que 2 valores regresan al mismo punto
			//entrando en un ciclo hasta elejir otra ruta
				while (evento == 0 || evento == 10){
					Sleep(3000);
					printf("\t\t\tgo norte\n");
					evento= menu();					
				}
				if (evento == 1 || evento == 11){
					Sleep(2000);	
					printf("\t\t\twait norte\n");								
				}				
			evento= menu();
			Sleep(3000);
			printf("\t\t\tgo este\n");		
			evento= menu();
			//	Despues de tener la entrada se compara y se tiene que 2 valores regresan al mismo punto
			//entrando en un ciclo hasta elejir otra ruta
				while (evento == 0 || evento == 1){
					Sleep(3000);	
					printf("\t\t\tgo este\n");
					evento= menu();							
				}
				if (evento == 10 || evento == 11){
					Sleep(2000);			
					printf("\t\t\twait este\n");						
				}
			evento= menu();	
			Sleep(3000);
		}while(1);		
	return 0;
}
