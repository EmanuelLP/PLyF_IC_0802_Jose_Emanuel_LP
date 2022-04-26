

public class Principal{
	public static void main(String[]args){
		
			Principal.engine((int x,int y) -> x + y);
			//() -> return Principal.engine((int x,int y) -> x + y); 
		
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

	private static CalculadoraInt engine(){
		int x = 2, y = 4;
		//int resultado = cal.calcular(x, y);
		//System.out.println("resultado = " + resultado);	
		return 	calcular(x,y);
	}
}