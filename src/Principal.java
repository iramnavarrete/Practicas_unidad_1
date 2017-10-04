
import java.util.Scanner;

/*
 * Hacer un programa que busque las veces que se repite un numero en un arreglo
 */

/**
 *
 * @author 16550506
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sCaptu= new Scanner(System.in);
        System.out.println("¿Cuántos datos va a ingresar?");
        int iDatos=sCaptu.nextInt();
        int aiDatos[]= new int [iDatos];//Un arreglo que tenga el tamaño de los datos que va aingresar el usuario
        
        for (int i = 0; i < iDatos; i++) {//Asignar los valores de la pocisión en el arreglo
            System.out.println("Inserte el nùmero en la pocisión " + (i));
            aiDatos[i]=sCaptu.nextInt();
        }
        
        int contador=0;//Asignar un valor que cuente las veces que se repite un número
        System.out.println("Inserte el número del cual quiere saber sus repeticiones: ");
        int iBuscar= sCaptu.nextInt();
        for (int i = 0; i < iDatos; i++) {
            if(aiDatos[i]==iBuscar){//Si es igual el dato buscar y el de la pocisión sumas 1 al contador y se imprime al final
                contador++;
            }
            
        }System.out.println("El dato se repite "+contador+" veces");
    }
    
}
