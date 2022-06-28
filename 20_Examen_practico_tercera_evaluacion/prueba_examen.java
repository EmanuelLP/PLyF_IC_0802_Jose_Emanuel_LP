public interface prueba_examen{
	
	public void mensaje_hola(){
		System.out.print("Hola mi nombre es José Emanuel López Paez");
	}

	public default void mensaje_hola(String mensaje){
		System.out.print("La cadena es " + mensaje);
	}

	public static int operacion_prueba(int a, int b){
		return (a+b);
	}

	public abstract void operacion_prueba(int a, int b, int c){}
	
}