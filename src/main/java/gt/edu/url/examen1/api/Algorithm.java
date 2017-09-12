package gt.edu.url.examen1.api;

public class Algorithm implements Chudnovsky {
	
	private Factorial numero = new Factorial(); 
	
	
	@Override
	public double calcularPi(int cantidadDigitos) {
	
		double numerador = 0.0; 
		double denominador = 0.0; 		
		double resultado = 0.0; 
		
		for(int i = 0; i < cantidadDigitos; i++) {
			numerador =  numero.factorial(6*cantidadDigitos) * (13591409 + 545140134 * cantidadDigitos); 
			denominador = numero.factorial(3*cantidadDigitos) *Math.pow(numero.factorial(cantidadDigitos), 3) * Math.pow(-640320,3*cantidadDigitos);
			resultado = resultado + (numerador/denominador);  			
		}	
		resultado = resultado*12;
		resultado = 1/resultado; 
		
		return resultado;
	}
	

}
