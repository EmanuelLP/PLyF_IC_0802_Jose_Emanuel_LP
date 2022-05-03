

public class Principal{
	public static void main(String[]args){
		System.out.println("==> CalculadoraLong --> resultado = " + Principal.engine(  (long)5, (long)5  ).calculate(4,4));
		System.out.println("==> CalculadoraInt --> resultado = " + Principal.engine(  (int)5, (int)5 ).calculate(4,4));
		
	}

	//Retorna un objeto de tipo "CalculadoraInt"
	private static CalculadoraInt engine(int a, int b){
		return (x , y) -> a * b;
	}

	//Retorna un objeto de tipo "CalculadoraLong"
	private static CalculadoraLong engine(long a, long b){
		return (x , y) -> (int)(a + b);
	}


}