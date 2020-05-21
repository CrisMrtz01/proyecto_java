
package EjerciciosGuia.Ejercicio4;

import java.util.Scanner;


public class Registro {
    public static void main(String[] args) {
        Ejercicio4 emp = new Ejercicio4();
        //Clase para lectura de datos
        Scanner leer = new Scanner(System.in);
        //Lectura de datos
        System.out.println("Ingrese el NIT del empleado: ");
        String nit = leer.nextLine();
        System.out.println("Nombre del Empleado: ");
        String nombre = leer.nextLine();
        System.out.println("Apellidos del empleado: ");
        String apellido = leer.nextLine();
        System.out.println("Direccion del empleado: ");
        String localizacion = leer.nextLine();
        System.out.println("Salario Devengado: ");
        double saldev = leer.nextDouble();

        
        //Se le asignan los valores a cada atributo
        emp.setNit(nit);
        emp.setNombres(nombre);
        emp.setApellidos(apellido);
        emp.setDireccion(localizacion);
        emp.setSalario(saldev);
        //emp.setSalarioconDesc(salwdesc);//Innecesario
        
        //datos del metodo
        double calcularSal = Registro.calcularSalario(saldev, saldev);
        String nombrecompleto = Registro.nombreCompleto(nombre, apellido);
        
        //Impresion de datos 
        System.out.println("Los Atributos son:");
        System.out.println("NIT: " + emp.getNit());
        System.out.println("Nombres: " + emp.getNombres());
        System.out.println("Apellidos: " + emp.getApellidos());
        System.out.println("Direccion: " + emp.getDireccion());
        //System.out.println("Salario con Descuento: " + emp.getSalarioconDesc());//Infuncional
        //Metodos
        System.out.println("Salario con Descuento: " + calcularSal);
        System.out.println("Nombre completo del Contibuyente: " + nombrecompleto);
        
    }
    
    public static double calcularSalario(double saldev, double salwdesc)
        {
        double salwdes = 0;
        salwdes = saldev - (saldev * 0.10);
        return salwdes;    
        } 
    public static String nombreCompleto(String nombre, String apellido)
    {
        String nombCompleto;
        nombCompleto = nombre + " " + apellido;
        return nombCompleto;
    }
}
