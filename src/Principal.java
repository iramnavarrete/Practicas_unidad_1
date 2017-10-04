
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        // TODO code application logic here
        
        Scanner sCaptu = new Scanner(System.in);
        System.out.println("Inserte la cantidad de edades a capturar: ");
        int iCantidad = sCaptu.nextInt();
        int aiArray[]=new int[iCantidad];
        int numeroNombre=1;
        //Calcular la media
        double contador=0;
            for (int i = 0; i < iCantidad; i++) {
                System.out.println("Inserte la edad "+numeroNombre+": ");
                aiArray[i]=sCaptu.nextInt();
                contador=contador+aiArray[i];
                numeroNombre++;
                }
            double media=contador/iCantidad;
            System.out.println("La media es: "+ media);
            
            //Calcular la moda
            int moda=0;//Inicializar el valor de moda
            int contador1=0;//veces que se repite un numero
            int contadorMax=0;//El valor maximo hasta el momento de veces que se repite
            for (int i = 0; i < iCantidad; i++) {
            contador1=0;//Reiniciar el contador al terminar el siguiente for
                for (int j = 0; j < iCantidad; j++) {
                    if (aiArray[i]==aiArray[j]) {
                        contador1++;
                    }
                }
                if (contador1>contadorMax) {
                    moda=aiArray[i];
                    contadorMax=contador1;
                    
                }
        }System.out.println("La moda es: "+ moda);
        
        //Calcular la desviación estándar
        double sumatoria=0;
        double variable=0;
            for (int i = 0; i < aiArray.length; i++) {//sumara los xi -media al cuadrado
                variable=(aiArray[i]-media)*(aiArray[i]-media);
                sumatoria=sumatoria+variable;//Se acumula 
        }
            double resultado=Math.sqrt(sumatoria/(iCantidad-1));
            System.out.println("La desviación estándar es: "+resultado);
    } 
            
                 
    

   
            
        
}
    

