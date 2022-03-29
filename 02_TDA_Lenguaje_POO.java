import java.util.Scanner;

public class Persona{

	//Atributos
	public String nombre;
	public String apellidos;
	public int edad;
	public char genero;

	//METODOS
	public static void comer(float hora){
		System.out.println("Hora de comida "+hora);
	}
	public static void caminar(float distancia){
		System.out.println("Caminar minimo "+distancia);		
	}
	public static void dormir(float hora){
		System.out.println("Hora de dormir "+hora);		
	}

	
	//MAIN
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		Persona persona= new Persona();
		System.out.println("Ingrese el nombre");
		persona.nombre=sc.nextLine();
		System.out.println("Ingrese el apellido");
		persona.apellidos=sc.nextLine();
		System.out.println("Ingrese la edad");
		persona.edad=sc.nextInt();
		System.out.println("Ingrese el genero");
		persona.genero=sc.next().charAt(0);
		System.out.println("Ingrese la hora");
		float hora = sc.nextFloat();
		System.out.println("Ingrese una distancia");
		int distancia= sc.nextInt();

		comer(hora);
		caminar(distancia);
		dormir(hora);
	}

}

