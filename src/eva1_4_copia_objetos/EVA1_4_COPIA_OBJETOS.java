/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_copia_objetos;

/**
 *
 * @author administrador
 */
public class EVA1_4_COPIA_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i =5;
        System.out.println(" i = " + i);
        //CREAR UNA COPIA DE i <-- no es una copia, solo la referencia
        int iCopia = i; //Valor de i a la variable iCopia
        System.out.println("Copia de i = "+iCopia);
        i++;
        System.out.println("i++ = "+i);
        System.out.println("iCopia ="+iCopia);
    //DECLARAR UN OBJETO DE TIPO NUMERO
        Numero nVal = new Numero();
        System.out.println("Valor de nVal.i = "+ nVal.i);
        Numero nCopiaVal = nVal;
        System.out.println("Valor de nCopiaVal = "+nCopiaVal.i);
        nVal.i++;
        //Imprimimos nVal y copia
        System.out.println("Valor de nVal.i = "+ nVal.i);
        System.out.println("Valor de nCopiaVal.i = "+nCopiaVal.i);
        //IMPRIMIR LOS OBJETOS
        System.out.println(nVal);
        System.out.println(nCopiaVal);
        
        //COPIA REAL DE UN OBJETO
        Numero nCopiaReal = new Numero();
        nCopiaReal.i = nVal.i;
        System.out.println("Valor de nVal.i = "+ nVal.i);
        System.out.println("Valor de nCopiaReal.i = "+ nCopiaReal.i);
        i++;
        System.out.println("Valor de nVal.i = "+ nVal.i);
        System.out.println("Valor de nCopiaReal.i = "+ nCopiaReal.i);
        //IMPRIMIR LOS OBJETOS
        System.out.println(nVal);
        System.out.println(nCopiaReal);
    }
    
}
class Numero{
    public int i=12;
}