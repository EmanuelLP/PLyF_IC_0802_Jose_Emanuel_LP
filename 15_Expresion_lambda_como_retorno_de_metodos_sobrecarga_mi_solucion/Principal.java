

public class Principal{
	public static void main(String[]args){
		System.out.println("==> CalculadoraInt --> resultado = " + Principal.engine(int(5)).calculate(5,5));
		System.out.println("==> CalculadoraLong --> resultado = " + Principal.engine(int(6)).calculate(6,2));
	}

	
	//Retorna un objeto de tipo "CalculadoraInt"
	private static CalculadoraInt engine(int a){
		return (x , y) -> x * y;
	}

	//Retorna un objeto de tipo "CalculadoraLong"
	private static CalculadoraLong engine(long b){
		return (x , y) -> (int)(x - y);
	}
	

}