//paso 1
public class Principal{
	//paso 2
	public static void main(String [] args){
		//paso 3
		PruebaExamen pe;
		//paso 4
		pe = (a,b,c)-> System.out.println(a+b+c);
		pe.operacionPrueba(5,5,5);
		//paso 5
		System.out.println(PruebaExamen.operacionPrueba(10,10));
		//paso 6		
		pe.mensajeHola();
		//paso 7
		pe.mensajeHola("Hello world");
		//paso 8
		pe = (a,b,c) -> System.out.println(a+(b*c));
		//paso 9
		pe.operacionPrueba(5,PruebaExamen.operacionPrueba(1,1),PruebaExamen.operacionPrueba(2,2));
		//paso 12
		Principal.miMetodo(pe);
		//paso 13
		Principal.miMetodo( (a,b,c) -> System.out.println(a+(b/c)) );
		//paso 16
		pe = (a,b,c) -> System.out.println(( (double)a +( (double)b / (double)c )));
		//paso 17
		Principal.miMetodo(pe,5,1,2); 

		
	}

	//paso 10
	private static void miMetodo(PruebaExamen prueba){
		//paso 11
		prueba.operacionPrueba(5,PruebaExamen.operacionPrueba(2,2),PruebaExamen.operacionPrueba(3,3));
	}
	//paso 14
	private static void miMetodo(PruebaExamen prueba, int a, int b, int c){
		//paso 15
		prueba.operacionPrueba(a, PruebaExamen.operacionPrueba(b,b), PruebaExamen.operacionPrueba(c,c));
	}
}