/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.poo.herencia;

/**
 *
 * @author Datos
 */
public class cat extends Vehicle{
    private String modelo = "mustang";
    
    private void aplicarherencia(){
        System.out.println("la marca es "+marca);
        System.out.println("este carro es de marca"+marca+"y el modelo es :"+modelo);
        sonido();
        
    }
    
    public static void main(String[] args) {
        new cat().aplicarherencia();
        
    }
}
