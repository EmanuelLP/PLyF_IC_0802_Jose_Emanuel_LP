#include <stdio.h>

typedef struct {
	char nombre[25];
	char apellidos[25];
	int  edad;
	char genero;
}Persona;

void comer(Persona persona);
void caminar(Persona persona);
void dormir(Persona persona);

int main(){
	Persona persona;
	printf("Ingrese el nombre:\t");
	fgets(persona.nombre, 25, stdin);
	printf("Ingrese el apellido:\t");
	fgets(persona.apellidos, 25, stdin);
	printf("Ingrese el genero:\t");
	scanf("%c",&persona.genero);
	printf("Ingrese la edad:\t");
	scanf("%d",&persona.edad);	
	comer(persona);
	fflush(stdin);
	caminar(persona);
	fflush(stdin);
	dormir(persona);
}

void comer(Persona persona){
	printf("Hora de comer %s\n",persona.nombre);
}
void caminar(Persona persona){
	printf("Caminar: %s por tu edad: %d camina min (%d) mts\n",persona.nombre,persona.edad,(persona.edad*100));
}
void dormir(Persona persona){
	printf("Dormir: %s %s genero: %c edad: %d duerme 8hrs \n", persona.nombre, persona.apellidos, persona.genero,persona.edad);	
}