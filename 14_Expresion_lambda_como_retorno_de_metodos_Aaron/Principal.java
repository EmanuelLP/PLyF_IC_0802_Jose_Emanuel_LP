

public class Principal{
	public static void main(String[]args){
		
			Principal.engine((int x,int y) -> (long x1 , long y2) -> x1 + y2);

	}

	//Sobrecarga de Métodos
	private static void engine(CalculadoraInt obj){
		int x = 2, y = 3;
		CalculadoraLong o = obj.calcular(x,y);
		o.calcular((long)x,(long)y);		
	}

	
}