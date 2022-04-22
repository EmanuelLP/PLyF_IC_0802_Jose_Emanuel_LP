

public class Principal{
	public static void main(String[]args){
	



		Principal.engine((long x,long y) -> x + y);
		Principal.engine((long x,long y) -> x * y);
		Principal.engine((long x,long y) -> x / y);
		Principal.engine((long x,long y) -> x - y);
		Principal.engine((long x,long y) -> x % y); 

		Principal.engines((x,y) -> (int) x + (int)y);
		Principal.engines((x,y) -> (int) x * (int) y);
		Principal.engines((x,y) -> (int) x / (int) y);
		Principal.engines((x,y) -> (int) x - (int) y);
		Principal.engines((x,y) -> (int) x % (int) y);
	}

	//Sobrecarga de Métodos
	private static void engine(CalculadoraInt cal){
		int x = 2, y = 4;
		int resultado = cal.calcular(x, y);
		System.out.println("resultado = " + resultado);
	}

	private static void engines(CalculadoraLong cal){
		int x = 2, y = 4;
		int resultado = cal.calcular(x, y);
		System.out.println("resultado = " + resultado);
	}


}