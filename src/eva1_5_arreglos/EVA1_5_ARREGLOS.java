/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_arreglos;

/**
 *
 * @author 16550506
 */
public class EVA1_5_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aiMisNume[] = new int[10];
        for ( int i = 0;i<10;i++){
            aiMisNume [i] = (int)(Math.random() * 10 +1);
    }
        //FOR EACH
        for(int x:aiMisNume){ //int x; for ( int i = 0;i<10;i++){}
            System.out.println(" x = "+x);
    }
        //MULTIPLES ARREGLOS
        int [] aiArreglo1, aiArreglo2, aiArreglo3; // TODOS SON ARREGLOS
        aiArreglo1 = new int [3];
        aiArreglo2 = new int [10];
        aiArreglo3 = new int [100];
        
        //ARREGLOS Y VARIANLES
        int aiArre[], iVar, iVar2;//SOLO EL PRIMERO ES ARREGLO[]
        aiArre = new int[10];
        iVar = 10;
        iVar2 = 30;
    }
}
