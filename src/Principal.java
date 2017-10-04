
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Navarrete
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sCaptu = new Scanner(System.in);
        System.out.println("Inserte el número de datos: "); 
        int iDato=sCaptu.nextInt();
        int aiDato[]=new int[iDato];
       
        
        for (int i = 0; i < aiDato.length; i++) {
            System.out.println("Inserte el numero: ");
            aiDato[i]=sCaptu.nextInt();
            
        }
        
        System.out.println("¿Qué número desea buscar?");
        int iBuscar=sCaptu.nextInt();
        
        for (int i = 0; i < aiDato.length; i++) {
                if (aiDato[i]==iBuscar) {
                System.out.println("Su numero esta en la pocisión "+i);
                break;
            
            }
        }
    }
    
}
