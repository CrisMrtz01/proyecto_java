
package EjerciciosGuia;

import java.util.Scanner;


public class Ejercicio6 {
  public String formato(String fecha){
     String formatoGuiones =""; 
        formatoGuiones = fecha.substring(0,2) + "-" +
                         fecha.substring(2,4) + "-" +
                         fecha.substring(4,8);
                return formatoGuiones;            
                
    }
  public String formato(int fecha){
                String formatoGuiones =""; 
                String fecha1 = String.valueOf(fecha);
                int cantidad = fecha1.length();
                
                if(cantidad==8){
                formatoGuiones = fecha1.substring(0,2) + "/" +
                                 fecha1.substring(2,4) + "/" +
                                 fecha1.substring(4,8);
                }else if(cantidad==7){
                    formatoGuiones = "0";
                    formatoGuiones += fecha1.substring(0,2) + "/" +
                                      fecha1.substring(1,3) + "/" +
                                      fecha1.substring(3,cantidad);
                }
                return formatoGuiones; 
             
    }
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Ejercicio6 objeto = new Ejercicio6();
        
        System.out.println("Ingrese una fecha: ");
        String f = leer.nextLine();
        
        System.out.println("La fecha con guiones es: " +objeto.formato(f));
        System.out.println("La fecha con plecas es: " +objeto.formato(Integer.parseInt(f)));
    }
    
}
