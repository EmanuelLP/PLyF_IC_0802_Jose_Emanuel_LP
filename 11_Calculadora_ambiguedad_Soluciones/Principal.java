

public class Principal{
	public static void main(String[]args){
		//Primera forma
	/*	Principal.engine((int x,int y) -> x + y);
		Principal.engine((int x,int y) -> x * y);
		Principal.engine((int x,int y) -> x / y);
		Principal.engine((int x,int y) -> x - y);
		Principal.engine((int x,int y) -> x % y); 

		Principal.engine((long x,long y) -> (int) x + (int) y);
		Principal.engine((long x,long y) -> (int) x * (int) y);
		Principal.engine((long x,long y) -> (int) x / (int) y);
		Principal.engine((long x,long y) -> (int) x - (int) y);
		Principal.engine((long x,long y) -> (int) x % (int) y); */
		
		//Segunda forma
		Principal.engine((CalculadoraInt)( x, y) -> x + y);
		Principal.engine((CalculadoraInt)( x, y) -> x * y);
		Principal.engine((CalculadoraInt)( x, y) -> x / y);
		Principal.engine((CalculadoraInt)( x, y) -> x - y);
		Principal.engine((CalculadoraInt)( x, y) -> x % y);

		Principal.engine((CalculadoraLong)( x, y) ->  (int)(x + y));
		Principal.engine((CalculadoraLong)( x, y) ->  (int)(x * y));
		Principal.engine((CalculadoraLong)( x, y) ->  (int)(x / y));
		Principal.engine((CalculadoraLong)( x, y) ->  (int)(x - y));
		Principal.engine((CalculadoraLong)( x, y) ->  (int)(x % y)); 

		//Tercera solucion

		/*Principal.engine(objInt);
		Principal.engine(objLong);*/



/*		Principal.engine((long x,long y) -> x + y);
		Principal.engine((long x,long y) -> x * y);
		Principal.engine((long x,long y) -> x / y);
		Principal.engine((long x,long y) -> x - y);
		Principal.engine((long x,long y) -> x % y); */

		/*Principal.engines((x,y) -> (int) x + (int)y);
		Principal.engines((x,y) -> (int) x * (int) y);
		Principal.engines((x,y) -> (int) x / (int) y);
		Principal.engines((x,y) -> (int) x - (int) y);
		Principal.engines((x,y) -> (int) x % (int) y);*/
	}

	//Sobrecarga de Métodos
	private static void engine(CalculadoraInt cal){
		int x = 2, y = 4;
		int resultado = cal.calcular(x, y);
		System.out.println("resultado = " + resultado);
	}

	private static void engine(CalculadoraLong cal){
		int x = 2, y = 4;
		int resultado = cal.calcular(x, y);
		System.out.println("resultado = " + resultado);
	}


}