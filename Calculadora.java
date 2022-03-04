public class Calculadora{
	public void multiplicar(int a, int b, int c){
		System.out.println(a*b*c);
	}
	public void restar(int d, int e, int f, int g, int h){
		System.out.println(d-e-f-g-h);
	}
	public void cuadrada(int i){
		double resultado=Math.sqrt(i);
		System.out.println(resultado);
	}
	public void Factorwhile(int a){
		int n1=1; 
		int n2=1;
		int n3; 
		while(a>0){
		n3=n1+n2;
		n1=n2;
		n2=n3;
		a=a-1;
	}
	System.out.println(n2);
}
	public void FactorFor(int a){
		int n1=1;
		int n2=1;
		int n3;
		for(int i=a;i>=0;i--){
		n3=n1+n2;
		n1=n2;
		n2=n3;
		}	
	System.out.println(n1);		
	}
	public int FactorRecursividad(int a){
		if (a>0){
		return FactorRecursividad (a-1) + FactorRecursividad (a-2);
		}else{
		return 1;
	}
	}
}