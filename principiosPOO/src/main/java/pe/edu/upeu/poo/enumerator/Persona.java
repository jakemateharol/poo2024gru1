/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.poo.enumerator;

    enum GENEROD{
        Femenino,Masculino
    }
enum ESTADO_CIVIL{Soltero,Casada,Divorciado,Viudo}
public class Persona {
    String nombre;
    String dni;
    String genero=GENEROD.Femenino.name();
    String estadoc;
    public static void main(String[] args) {
        Persona p=new Persona();
        System.out.println("GENERO"+p.genero);
        for(ESTADO_CIVIL ec:ESTADO_CIVIL.values()){
        
            System.out.println("EC:"+ec);}
    }
    
}
