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
     * 
     * LOS ARREGLOS DE OBJETOS GUARDAN DIRRECIONES DE MEMORIA Y CADA DIRECCION APUNTA A UN OBJETO 
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno aaDatosAlumno[];//El identificador es nulo
        aaDatosAlumno = new Alumno[10]; //Creamos un arreglo de 10 alumnos
        
        
        for (int i = 0; i <aaDatosAlumno.length; i++) {
            aaDatosAlumno[i] = new Alumno("Iram","16550506",1);
            }
        for (Alumno aaDatosAlumno1 : aaDatosAlumno) {
            System.out.println("Nombre "+ aaDatosAlumno1.getsNom());
            System.out.println("Matricula "+ aaDatosAlumno1.getsMatri());
            System.out.println("Carrera "+ aaDatosAlumno1.getiCar());
            System.out.println(aaDatosAlumno);
        }
        //crear copia
        Alumno aaCopiaDatosAlumno[];
        aaCopiaDatosAlumno = new Alumno[10];
        for (int i = 0; i < aaDatosAlumno.length; i++) {
            
            aaCopiaDatosAlumno[i] = new Alumno(aaDatosAlumno[i].getsNom(),aaDatosAlumno[i].getsMatri(),aaDatosAlumno[i].getiCar());
           // IMPRIMIR COPIA
        }
        for (Alumno aaCopiaDatosAlumno1 : aaCopiaDatosAlumno) {
            System.out.println("Nombre "+ aaCopiaDatosAlumno1.getsNom());
            System.out.println("Matricula "+ aaCopiaDatosAlumno1.getsMatri());
            System.out.println("Carrera "+ aaCopiaDatosAlumno1.getiCar());
            System.out.println(aaCopiaDatosAlumno);
        }
    }
    
}
class Alumno{
    private String sNom;
    private String sMatri;
    private int iCar;
    
    public Alumno(String sNombre,String sMatricula, int iCarrera){
        sNom = sNombre;
        sMatri = sMatricula;
        iCar = iCarrera;
        
        
    }

    
    public String getsNom() {
        return sNom;
    }

    public void setsNom(String sNom) {
        this.sNom = sNom;
    }

    public String getsMatri() {
        return sMatri;
    }

    public void setsMatri(String sMatri) {
        this.sMatri = sMatri;
    }

    public int getiCar() {
        return iCar;
    }

    public void setiCar(int iCar) {
        this.iCar = iCar;
    }
    
}