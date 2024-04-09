/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.poo.encapinterface;

/**
 *
 * @author Datos
 */
public class Loro implements Animal{

    @Override
    public void emitirSonido() {
        System.out.println("esto es la implementacion"+"...no te olvides");
        
    }

    @Override
    public void dormir() {
        System.out.println("zzzz...zzzz");
        
        
    }
    

    @Override
    public void hablar() {
        System.out.println("hola manito no seas flojo pues");
        
    }
    
    
}
