

public class Principal{
	public static void main(String[]args){
		CalculadoraLong _calLong = (x,y) -> x+y;
		CalculadoraInt _calInt = (x,y) -> x*y;
		Principal.engine(_calLong);
		Principal.engine(_calInt);
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