package gt.edu.url.examen1.api;

/**
*
* @author AlexRod97
*/

public class Factorial {
	
	public  int factorial(int n) {
        if (n == 0) {
            return (1);
        }
        else {
            return (n * factorial(n - 1));
        }
    }

}
