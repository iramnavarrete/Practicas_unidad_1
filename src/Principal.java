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
//        Matriz 2
        System.out.println("Matriz 1:");
        double aiArray [][]=new double[5][5];
        for (int i = 0; i < aiArray.length; i++) {
            for (int j = 0; j < aiArray.length; j++) {
                (aiArray[i][j])=(Math.random()*10)+1;
                System.out.print("["+aiArray[i][j]+"]");
            }System.out.println("");
        }
        
//        matriz 2
        System.out.println("Matriz 2: ");
        double aiArray1 [][]=new double[5][5];
        for (int i = 0; i < aiArray1.length; i++) {
            for (int j = 0; j < aiArray1.length; j++) {
                (aiArray1[i][j])=(Math.random()*10)+1;
                System.out.print("["+aiArray1[i][j]+"]");
            }System.out.println("");
        }
//        Matriz resultados
        System.out.println("Matriz resutlados:");
        double aiResult[][]=new double[5][5];
        for (int i = 0; i < aiResult.length; i++) {
            for (int j = 0; j < aiResult.length; j++) {
                aiResult[i][j]=aiArray[i][j]*aiArray1[i][j];
                System.out.print("["+aiResult[i][j]+"]");
            }System.out.println("");
        }
    }
    
}
