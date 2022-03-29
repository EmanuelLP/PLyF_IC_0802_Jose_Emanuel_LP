
#include <stdio.h>

#define p7	1<<7
#define p6	1<<6
#define p5	1<<5
#define p4	1<<4
#define p3	1<<3
#define p2	1<<2
#define p1	1<<1
#define p0	1<<0

void posicion(unsigned char entero,unsigned char decimal){
	int base=1, numero=0;
	float dec, valor;
	if(entero & p7){
		printf("128\n");
		base=128;
		numero=numero+base;
	}
	if(entero & p6){
		printf("64\n");
		base=64;
		numero=numero+base;
	}
	if(entero & p5){
		printf("32\n");
		base=32;
		numero=numero+base;
	}
	if(entero & p4){
		printf("16\n");
		base=16;
		numero=numero+base;
	}
	if(entero & p3){
		printf("8\n");
		base=8;
		numero=numero+base;
	}
	if(entero & p2){
		printf("4\n");
		base=4;
		numero=numero+base;
	}
	if(entero & p1){
		printf("2\n");
		base=2;
		numero=numero+base;
	}
	if(entero & p0){
		printf("1\n");
		base=1;
		numero=numero+base;
	}
		
	printf("Numero entero: %i",numero);
	
	if(decimal & p7){
		printf("0.5\n");
		valor=0.5;
		dec=dec+valor;
	}
	if(decimal& p6){
		printf("0.25\n");
		valor=0.25;
		dec=dec+valor;
	}
	if(decimal & p5){
		printf("0.125\n");
		valor=0.125;
		dec=dec+valor;
	}
	if(decimal & p4){
		printf("0.625\n");
		valor=0.625;
		dec=dec+valor;
	}
	printf("Numer0 decimal %f",dec);
}



int main(){
	posicion(p6|p5|p4|p3|p2|p0|p7|p5|p4);
	
	return 0;
}
