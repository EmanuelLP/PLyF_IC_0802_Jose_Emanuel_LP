public class LambdaTest{
	public static void main(String[] ards){
		//Expresión lambda ==> representa un objto de una interfaz funcional
		FuncionTest ft = () -> System.out.println("Hola mundo");
		//Implementacioón del método abstracto "saludar()" de la interfaz funcional
		//ft.saludar();
		LambdaTest objeto = new LambdaTest();
		objeto.miMetodo(ft);
	}

	public void miMetodo(FuncionTest parametro){
		parametro.saludar();
	}
}