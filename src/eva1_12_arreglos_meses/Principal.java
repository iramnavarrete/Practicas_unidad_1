/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_12_arreglos_meses;

import java.util.Scanner;

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
        String asMeses[]= {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        

//DIAS
        int aiDias [] = {31,28,31,30,31,30,31,31,30,31,30,31};
//Solicita el mes al usuario
        int iMes;
        Scanner sCaptu = new Scanner(System.in);
        
        System.out.println("Numero del mes (1-12): ");
        iMes=sCaptu.nextInt();
        System.out.println("El mes es: "+asMeses[iMes-1]+ " y tiene "+aiDias[iMes-1]+ " dias");
        
    }
    
}
