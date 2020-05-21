
package ejemplos;

import java.util.Scanner;

public class Docente extends Estudiante{
    String nombreDocente = "";
    int edad = 0;
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
        Docente obj = new Docente();
        System.out.println("Nombre del docente: ");
        obj.nombreDocente = leer.nextLine();
        
        System.out.println("Cual es su edad: ");
        obj.edad = Integer.parseInt(leer.nextLine());
        
        System.out.println("Carnet del estudiante: ");
        obj.setCarnet(leer.nextLine());
        
        System.out.println("Nombre del estudiante: ");
        obj.setNombre(leer.nextLine());
        
        System.out.println("Direccion del estudiante: ");
        obj.setDireccion(leer.nextLine());
        
        System.out.println(obj.information());
        System.out.println("");
        System.out.println(obj.info2(obj));
    }
}
