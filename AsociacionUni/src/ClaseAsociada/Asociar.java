/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseAsociada;

/**
 *
 * @author Luis Fabian
 */
public class Asociar {
    
    public static void main(String[] args){
    Persona persona1;
    persona1 =new Persona();
    Persona persona2 = new Persona();
    persona1.nombre = "Daniel Jose";
    persona2.nombre = "Jose Rodrigo";
    persona1.Docu = "1003468795";
    persona2.Docu = "1002856436";
    
    Moto moto1 = new Moto();
    Moto moto2 = new Moto();
    moto1.Tipomoto = "Acuatica";
    moto1.Marca = "Moex";    
    moto2.Tipomoto = "Montaña";
    moto2.Marca = "Loyrz";
    moto2.Llantas = 2;
    persona1.Tributo = moto1;
    persona2.Tributo = moto2; 
    persona1.mostrar();
    persona2.mostrar();
        
    }
}
