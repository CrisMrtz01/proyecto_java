
package EjerciciosGuia;

import java.util.Hashtable;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
            Hashtable contenedor = new Hashtable();
        Scanner info = new Scanner(System.in);
        
         int carnet = 0;
        String nombre = null;
        String codigoCarrera = null;
        int x = 1;
        

        for (int i = 0; i < 2; i++) {  
            
        System.out.println("Ingrese el numero del carnet: ");
        carnet = info.nextInt(); info.nextLine();
        
         System.out.println("Ingrese el nombre: ");
        nombre = info.nextLine(); 
        
        System.out.println("Ingrese el Código de la carrera: ");
         codigoCarrera = info.nextLine();
     }
        
        while(x<=2){
        
        
        contenedor.put("Carnet" , carnet);

        
        contenedor.put("Nombre", nombre);

           
           
        contenedor.put("CodigoCarrera1", codigoCarrera);

        
        //--------------------------------------------------
        
        int micarnet =  (int) contenedor.get("Carnet");
 
   
        String nombre1 =   (String) contenedor.get("Nombre");
 
        String codigoCarrera1 =   (String) contenedor.get("CodigoCarrera1");
        
        
       System.out.println("Número de carnet: "  + micarnet+ "\n Nombre del estudiante: "
              + nombre1 + "\n Código de la carrera: " + codigoCarrera1 + "\n");
        
       System.out.println("Número de carnet: "  + micarnet + "\n Nombre del estudiante: "
               + nombre1 + "\n Código de la carrera: " + codigoCarrera1 + "\n");
         
     
        
        
    }
    }
}
