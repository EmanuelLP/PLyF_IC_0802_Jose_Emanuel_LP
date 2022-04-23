

public class Principal{
	public static void main(String[]args){
		
		
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