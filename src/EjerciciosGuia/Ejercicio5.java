
package EjerciciosGuia;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;


public class Ejercicio5 {

    
    public static void main(String[] args) {
       NumberFormat  formato = new DecimalFormat ("0.00");
       Scanner leer = new Scanner (System.in); 
       double lectura_anterior, lectura_actual;
       double  dia_facturacion = 1;
       double multiplicador = 0.10;
       System.out.println("Ingrese la lectura anterior:");
       lectura_anterior = leer.nextDouble();
       System.out.println("Ingrese la lectura actual:");
       lectura_actual = leer.nextDouble();
        
       double consumo = lectura_actual-lectura_anterior * multiplicador;
       double valor_factura = consumo*0.20;
       
        System.out.println("El valor de la factura por dia en kWh es:"+valor_factura);
       
    }
    
}
