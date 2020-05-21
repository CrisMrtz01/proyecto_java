
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
        //contenedor.put("carnet2", 1425781 );
        //contenedor.put("carnet3", 1475892);
        //contenedor.put("carnet4", 1436964 );
        //contenedor.put("carnet5", 1475832);
        
        
        contenedor.put("Nombre", nombre);
        //contenedor.put("nombre2", "Yoselin");
        //contenedor.put("nombre3", "Carlos");
        //contenedor.put("nombre4", "Jhonathan");
        //contenedor.put("nombre5", "Luis");
           
           
        contenedor.put("CodigoCarrera1", codigoCarrera);
        //contenedor.put("codigoCarrera2", "LOG21");
        //contenedor.put("codigoCarrera3", "ELE22");
        //contenedor.put("codigoCarrera4", "SIS21");
        //contenedor.put("codigoCarrera5", "MAN22");
        
        //--------------------------------------------------
        
        int micarnet =  (int) contenedor.get("Carnet");
        //int micarnet2 = (int) contenedor.get("carnet2");
        //int micarnet3 = (int) contenedor.get("carnet3");
        //int micarnet4 = (int) contenedor.get("carnet4");
        //int micarnet5 = (int) contenedor.get("carnet5");
        
   
        String nombre1 =   (String) contenedor.get("Nombre");
        //String nombre2 = (String) contenedor.get("nombre2");
        //String nombre3 = (String) contenedor.get("nombre3");
        //String nombre4 = (String) contenedor.get("nombre4");
        //String nombre5 = (String) contenedor.get("nombre5");
        
        
        String codigoCarrera1 =   (String) contenedor.get("CodigoCarrera1");
        //String codigoCarrera2 = (String) contenedor.get("codigoCarrera2");
        //String codigoCarrera3 = (String) contenedor.get("codigoCarrera3");
        //String codigoCarrera4 = (String) contenedor.get("codigoCarrera4");
        //String codigoCarrera5 = (String) contenedor.get("codigoCarrera5");
        
        
        
       System.out.println("Número de carnet: "  + micarnet+ "\n Nombre del estudiante: "
              + nombre1 + "\n Código de la carrera: " + codigoCarrera1 + "\n");
        
       System.out.println("Número de carnet: "  + micarnet + "\n Nombre del estudiante: "
               + nombre1 + "\n Código de la carrera: " + codigoCarrera1 + "\n");
         
      // System.out.println("Número de carnet: "  + micarnet3 + "\n Nombre del estudiante: "
        //       + nombre + "\n Código de la carrera: " + codigoCarrera3 + "\n");
          
          // System.out.println("Número de carnet: "  + micarnet3 + "\n Nombre del estudiante: "
          //      + nombre3 + "\n Código de la carrera: " + codigoCarrera + "\n");
           
          //  System.out.println("Número de carnet: "  + micarnet4 + "\n Nombre del estudiante: "
            //    + nombre4 + "\n Código de la carrera: " + codigoCarrera4 + "\n");
            
           //  System.out.println("Número de carnet: "  + micarnet5 + "\n Nombre del estudiante: "
           // + nombre5 + "\n Código de la carrera: " + codigoCarrera5 + "\n");
     
        
        
    }
    }
}
