package gt.edu.url.examen1.api;

import gt.edu.url.examen1.api.Reportero;
/**
 *
 * @author alexrod97
 */
public class TenisGame implements Reportero {

	public char[] lista = new char[6];
    
    @Override
    public String calcularGanador(int a, int b) {
                if(a>b){
                if(a>5 && a<8 && b<5 && b>=0){
                	ingresarGanador('A');
                    return "El set lo ha ganado: A";                
                }
                
                else 
                	if(a == 7){
                    if(b == 5 || b ==6){
                    	ingresarGanador('A');
                    	return "El set lo ha ganado: A";
                    }
                    
                    else{
                    	ingresarGanador('C');
                        return "Error";
                    }
                }
                
                else 
                	if(a >= 0 && a<=5 && b >= 0 && b<=5){
                	ingresarGanador('C');
                    return "Set inconcluso";
                }
                
                else{
                	ingresarGanador('C');
                    return "Error";
                }
            
                }
                
                else 
                	if(b>a){
                if(b>5 && b<8 && a<5 && a>=0){
                	ingresarGanador('B');
                	return "El set lo ha ganado: B";
                }
                
                else 
                	if(b == 7){
                    if(a == 5 || a ==6){
                    	ingresarGanador('B');
                    	return "El set lo ha ganado: A";
                    }
                    else{
                    	ingresarGanador('C');
                        return "Error";
                    }
                }
                
                else 
                	if(b >= 0 && b<=5 && a >= 0 && a <= 5){
                	ingresarGanador('C');
                    return "Set inconcluso";
                }
                
                else{
                	ingresarGanador('C');
                    return "Error";
                }
                }
                
                else{
                if(a == b && a+b <= 12 && a>=0 && b>=0){
                	ingresarGanador('C');
                    return "Set inconcluso";                
                }
                else
                {
                	ingresarGanador('C');
                    return "Error";
                }
            }
        
        
    }

    @Override
    public String calcularCampeon() {
        int ganadorA=0;
        int ganadorB = 0;
        for(int i =0; i<lista.length;i++){
            if(lista[i] == 'A'){
                ganadorA++;
            }
            else if(lista[i] == 'B'){
                ganadorB++;
            }
        }
        if(ganadorA > ganadorB){
            return "Campeón A";
        }
        else if(ganadorB > ganadorA){
            return "Campeón B";
        }
        else{
            return "No hay ganador";
        }
    }

    @Override
    public String printGanador(int juego) {
        
        return Character.toString(lista[juego-1]);
    }
    
    private void ingresarGanador(char ganador){
        for(int i =0; i<lista.length;i++){
            if(lista[i] != 'A' || lista[i] != 'B' || lista[i] != 'C'){
            	lista[i] = ganador;
                break;
            }
        }
            
    }

	@Override
	public String recordarGanador(int juego) {
		return Character.toString(lista[juego-1]);
	}
}
