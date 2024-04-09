/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.poo.encapinterface;

/**
 *
 * @author Datos
 */
public class Principal {
    public static void main(String[] args) {
        Animal obj=new Loro();
        obj.dormir();
        obj.emitirSonido();
        obj.hablar();
    }
    
}
