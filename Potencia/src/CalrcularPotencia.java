/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class CalrcularPotencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int base = 5;
        int exponente = 3;
        int resultado;
        
        try {
            
            if (exponente == 0 || base == 1) {
                resultado = 1;
            } else {
                resultado = base;
                for (int i = 1; i < exponente; i++) {
                    resultado *= base;
                }
            }
            System.out.println("El resultado de la potencia es: " + resultado);
        }
        
        catch (Exception ex) {
            System.out.println("Imposible calcular la potencia: " + ex);
            
        }
        
    }
    
}
