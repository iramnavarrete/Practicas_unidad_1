/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aiArreglo[]=new int[200000000];
        
        for (int i = 0; i < aiArreglo.length; i++) {
            aiArreglo[i] = (int)((Math.random()*100)+1);
            
        }
    }
    
}
