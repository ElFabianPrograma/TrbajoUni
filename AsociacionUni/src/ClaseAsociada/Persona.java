
package ClaseAsociada;

/**
 *
 * @author Luis Fabian
 */
public class Persona {
   public String nombre;
   public Moto Tributo;
   public String Docu;  
   public void mostrar(){
       System.out.println("La persona se llama: "+ nombre 
               +"\nSu docummento es: "+Docu
               +"\nTiene una moto tipo: "+Tributo.Tipomoto 
               +"\nNumero de llantas: " +Tributo.Llantas
               +"\nMarca:"+ Tributo.Marca
               +"\n-----------------------------------------" );
   }
}
