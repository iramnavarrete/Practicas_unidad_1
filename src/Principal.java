
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
        
        //Preguntar cuantas edadesse van a capturar
        Scanner sCaptu= new Scanner(System.in);
        System.out.println("Cuantas edades se van a capturar: ");
        int iCant= sCaptu.nextInt();
        int aiEdades[]= new int[iCant];
        //Capturar
        for (int i = 0; i < iCant; i++) {
            System.out.println("Introduce la edad");
            aiEdades[i]=sCaptu.nextInt();
        }
        //Calcular el promedio de edades
        int iAcum=0;
        for (int iVal : aiEdades) {
            iAcum= iAcum + iVal; //iAcum +=iVal; EQUIVALENTE 
        }
        System.out.println("El promedio es: "+iAcum/iCant);
    }
    
}
