//paso 1
public interface PruebaExamen{
	//paso 2
	default public void mensajeHola(){
		//paso 3
		System.out.println("Hola mi nombre es Jose Emanuel Lopez Paez");
	}
	//paso 4
	default public void mensajeHola(String mensaje){
		System.out.println("La cadena es " + mensaje);
	}
	//paso 5
	public static int operacionPrueba(int a, int b){
		//paso 6
		return (a+b);
	}

	//abstract
	 public void operacionPrueba(int a, int b, int c);
	
}