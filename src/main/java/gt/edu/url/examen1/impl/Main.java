package gt.edu.url.examen1.impl;
import gt.edu.url.examen1.api.Algorithm;
import java.util.Scanner;


/**
 *
 * @author Alexrod97
 */
public class Main {
    
    public static void main(String[] args) {
    	Scanner read = new Scanner (System.in);
    	
    	Algorithm algoritmoChudnovsky = new Algorithm(); 
    	int k = 0;
    	double resultado = 0.0;    
    	
        System.out.println("Ingrese la cantidad de digitos a operar para pi");
        k = read.nextInt(); 
        resultado = algoritmoChudnovsky.calcularPi(k); 
        System.out.println(resultado); 
        read.close();
    }
    
}
