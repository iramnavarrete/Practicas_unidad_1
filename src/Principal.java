
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author administrador
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sCaptu = new Scanner(System.in);
        //Solicitar grupos
        System.out.println("¿Cuántos grupos tiene? ");
        int iGrup = sCaptu.nextInt();
        int aiGrup[] =new int[iGrup];
//        Solicitar edades
        System.out.println("¿Cuántas edades se van a capturar?");
        int iCant=sCaptu.nextInt();
//        crear arreglo bidimensional que capture grupo y alumnos
        
        
        for (int i = 0; i < aiGrupCant.length; i++) {
            for (int j = 0; j < aiGrupCant[i].length; j++) {
                System.out.println("Ingrese la edad: ");
                aiGrupCant[i][j] = sCaptu.nextInt();
            }
            
        }
        
        
    
    }
}
