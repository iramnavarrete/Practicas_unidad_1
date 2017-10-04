
import java.util.Scanner;

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
        
        Scanner sCaptu = new Scanner(System.in);
        System.out.println("Inserte el número");
        int iDato=sCaptu.nextInt();
        
        int iResiduo;
        int aiArreglo[]= new int[iDato];
        
        for (int i = 2; i < aiArreglo.length; i++) {
            iResiduo = iDato % i;
            if (iResiduo==0) {
                System.out.println("El numero no es primo");
                break;
            }else{ 
                System.out.println("El numero es primo");
                break;
            }
        }
        int iRaiz = (int)(Math.sqrt(iDato));
        for (int i = 0; i < iRaiz; i++) {
            if (iDato !=0) {
                System.out.println("El numero no es primo");
                break;
            }else{ 
                System.out.println("El numero es primo");
                break;
            }
        }
    }
    
}
