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
        // ARREGLOS MULTIDIMENSIONALES ARREGLOS DE ARREGLOS
        
//MATRIZ DE 2 X 2 DIMENSIONES [filas] x [columnas]
        int aiMatriz[][]=new int [2][2]; //4 enteros
        //llenar con valores aleatorios
        //for para columnas
        for (int i = 0; i < 2; i++) { //cada fila
            for (int j = 0; j < 2; j++) { //cada columna
                aiMatriz[i][j] = (int)(Math.random()*10);
            }
            
        }
        //IMPRIMIR
        //
        for (int i = 0; i < 2; i++) { //cada fila
            for (int j = 0; j < 2; j++) { //cada columna
                System.out.print("["+aiMatriz[i][j]+"]");
            }
            System.out.println("");//NOS CAMBIA DE LINEA
        }
        //USANDO FOR EACH
        for (int[] aiMatriz1 : aiMatriz) {//CADA FILA --> arreglo
            //USANDO OTRO FOR EACH // RECORRER COLUMNAS
            for (int b : aiMatriz1) {
                System.out.print(" [ "+b+" ] ");
            }System.out.println("");
        }
    }
    
}
