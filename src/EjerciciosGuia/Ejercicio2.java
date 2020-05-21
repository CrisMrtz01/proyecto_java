
package EjerciciosGuia;

import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double precio, iva;
        System.out.println("Ingrese el precio del articulo:");
        precio = leer.nextDouble();
        System.out.println("Ingrese el porcentaje del IVA");
        iva = leer.nextDouble();
        
        double obtenerIVA = Ejercicio2.calculoIVA(precio, iva);
        double preciomasIVA = Ejercicio2.segundoMetodo(precio, iva);
        
        System.out.println("IVA: " + obtenerIVA);
        System.out.println("Precio del Articulo sin IVA: " + preciomasIVA);
    }
   
        //Este metodo sirve para calcular el PORCENTAJE DEL IVA
        public static double calculoIVA(double precio, double iva)
        {
            double IVA = 0;
            IVA = precio * iva;
            return IVA;
        }
        
        //Este metodo es para calcular el precio del articulo con menos el IVA 
        public static double segundoMetodo(double precio, double iva)
        {
            double total = 0, totalfinal = 0;
            total = precio + (precio * iva);
            totalfinal = total - (precio * iva);
            return totalfinal;
        }
    
}
