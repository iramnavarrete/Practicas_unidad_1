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
        int valor=0;
        int aiArray[][]=new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (aiArray[i]==aiArray[j]) {
                    valor=1;
                }else{
                    valor=0;
                }System.out.print("["+valor+"]");
            }System.out.println("");
        }
    }
    
}
