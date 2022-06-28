#include <stdio.h>
#include <stdlib.h>

#define _DEBUG 0

void llenarPosiciones(int tablero[],int n){
	int i=0;
	n=n*n;	
	//Llenar el tablero para evitar basura y evitar tener numeros que se comparan despues
	for (i=0; i< n; i++){
		tablero[i]=2;
		//	printf("[%d][%d]\n",i,j);
		
	}
}

void imprimir(int tablero[],int n){
	//imprimir
	int i=0;
	int salto=n,bandera=0;
	n=n*n;
	for (i=0; i<n ;i++){
	//	for(j=0; j<n ;j++){
		if(bandera>=salto){
			printf("\n");
			bandera=0;
		}
		printf("[%d]",tablero[i]);
		bandera++;
	}	
}

#if _DEBUG
int buscarReinaHorizontal(int tablero[],int coordenada, int n){
	int bandera=0;
	int i=0;
	for(i=coordenada;i<n;i++){
		if(tablero[i]==1){
			bandera=1;			
		}
	}
	if(bandera==0){
		int cc=coordenada-n;
		for(i=coordenada;i>cc;i--){
			if(tablero[i]==1){
				bandera=1;
			}
		}	
	}
//	printf("bandera ==%d;%d",bandera,coordenada);
	return bandera;
}

int buscarReinaVertical(int tablero[],int coordenada, int n){
	int bandera=0;
	int salto=n;
	n=n*n;
	int i=0;
	for(i=coordenada;i<n;i=i+salto){
		if(tablero[i]==1){
			bandera=1;
		}
	}
	
	if(bandera==0){		
		for(i=coordenada;i>=0;i=i-salto){
			if(tablero[i]==1){
				bandera=1;
			}
		}	
	}
	return bandera;
}

int buscarReinaDiagonal(int tablero[],int coordenada, int n){
	int bandera=0;
	int salto=n;
	n=n*n;
	int i=0;
	for(i=coordenada;i<n;i++){
		if(tablero[i]==1){
			bandera=1;
		}
		i=i+salto;
	}
	
	if(bandera==0){		
		for(i=coordenada;i>=0;i--){
			if(tablero[i]==1){
				bandera=1;
			}
			i=i-salto;
		}	
	}
	return bandera;
}
#endif
int  posicionReina(int tablero[],int n){
	//reina 1 puede comer 0
	//obtener coordenadas disponible
	int salto=n;
	int reina=0;
	int i=0;
	int existe=0;
	int coordenada;	
	n=n*n;
	for (i=0; i< n ;i++){
		if(tablero[i] == 2){
			coordenada=i;			
		/*
			existe=buscarReinaHorizontal(tablero,coordenada,n);
		//	printf("{%d}",existe);
			if(existe==0){
				existe=buscarReinaVertical(tablero,coordenada,n);
				//printf("{%d}",existe);
				if(existe==0){
					existe=buscarReinaDiagonal(tablero,coordenada,n);
				//	printf("{%d}",existe);
					if(existe==0){
					//	i=n;
					}							
				}
			}
		*/
			i=n;
		//	printf("\n{%d}\n",existe);														
		}			
	}
	tablero[coordenada]=1;
	reina=coordenada;
	return reina;
}

void recorrido(int tablero[], int n, int coordenada){
	int salto=n,bandera=0;
	n=n*n;
	int i=0;
	
	//come horizontal
	for(i= coordenada; i < n; i++){
		if( tablero[i] == 2){
			tablero[i] = 0;
		}		
		bandera++;
		if(bandera==salto){
			i=n;
		}						
	}	
	//come vertical
	for(i = coordenada; i < n; i=i+salto ){
		if( tablero[i] == 2){
			tablero[i]= 0;
		}
	}
	//come diagonal
	bandera=0;
	for (i=coordenada; i< n ;i++){
		if( tablero[i] == 2 || tablero[i] == 0){		
			tablero[i]=0;
		}			
		i=i+salto;
	}
}

int vector(int tablero[],int n){	
	int i=0;
	int bandera=0;	
	n=n*n;
	for (i=0; i<n ;i++){	
		if(tablero[i]==2){
			bandera=1;
			i=n;
		}						
	}
	return bandera;	
}

void numReinas(int tablero[],int n){
	int i=0;
	int cantidad=0;	
	n=n*n;
	for (i=0; i<n ;i++){	
		if(tablero[i]==1){
			printf("\nPosicion de reina [%d]= [%d]\n",cantidad,i);
			cantidad++;			
		}						
	}
	printf("\nCantidad de reinas: [%d]\n",cantidad);
}

int main(){
	int n=0;
	int bandera=0;
	int coordenada=0;
	printf("Ingresa el tamanio del tablero:\t");
	scanf("%d",&n);
	int tablero[n*n];	
	llenarPosiciones(tablero,n);
	//reina 1 puede comer 0
	do{
		coordenada=posicionReina(tablero,n);	
		recorrido(tablero,n,coordenada);		
		bandera=vector(tablero,n);
	}while(bandera==1);
	numReinas(tablero,n);
	imprimir(tablero,n);
	return 0;
}
