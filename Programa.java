public class Programa{
	public static void main(String[] arg){
		Calculadora casio = new Calculadora();
		//casio.multiplicar(5,8,1);
		//casio.restar(100,23,45,69,15);
		//casio.cuadrada(2);
		casio.Factorwhile(11);
		casio.FactorFor(11);
		System.out.println(casio.FactorRecursividad(11));	
	}

}