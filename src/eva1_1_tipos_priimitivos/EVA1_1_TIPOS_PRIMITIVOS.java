

//PROYECTO INICIAIL PARA CONOCER E IDENTIFICAR LOS TIPOS DE DATOS DE ENTRADA EN JAVA
package eva1_1_tipos_priimitivos;

import java.util.Scanner;

/**
 *
 * @author 16550506
 */
public class EVA1_1_TIPOS_PRIMITIVOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String sNom;
        int iEdad;
        double dSal;
        
        Scanner sScanner = new Scanner(System.in);
        System.out.println("Inserte su nombre: ");
        sNom = sScanner.nextLine();
        System.out.println("Inserte su edad: ");
        iEdad = sScanner.nextInt();
        System.out.println("Inserte su  salario: ");
        dSal = sScanner.nextDouble();
        
        hacerAlgo(sNom,iEdad, dSal);
        
    }
    
    /**
     * Ejemplo para comentarios usando javadoc
     * @param sNombre ejemplo usando String
     * @param iEdad ejemplo usando entero
     * @param dSalario ejemplo usando double
     */
    public static void hacerAlgo(String sNombre, int iEdad, double dSalario){
        System.out.println(sNombre + " " + iEdad+" "+ dSalario);
    }
}
