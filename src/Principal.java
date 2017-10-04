
import java.util.Scanner;

/*
 * Hacer un programa que determine el valor minimo y maximo de un arreglo
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
        Scanner sCaptu = new Scanner(System.in);
        System.out.println("¿De que tamaño va a ser el arreglo de datos?");
        int iDatos=sCaptu.nextInt();
        int aiDatos[]=new int[iDatos];
        
        for (int i = 0; i < iDatos; i++) {
            System.out.println("Inserte el número en la pocisión "+i);
            aiDatos[i]=sCaptu.nextInt();
        }
        int min=aiDatos[0],max=aiDatos[0];
        
        for (int i = 0; i < iDatos; i++) {
            if (aiDatos[i]<min) {
                min=aiDatos[i];
            }
            if (aiDatos[i]>max) {
                max=aiDatos[i];
            }
        }System.out.println("El minimo es "+ min);
        System.out.println("El maximo es "+max);
    }
    
}
