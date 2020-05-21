
package ejercicios;

import java.util.Scanner;

public class TransaccionesBancarias {
    public static void main(String[] args) {
        
        CuentaBancaria cuenta = new CuentaBancaria();
        Scanner leer = new Scanner(System.in);
        
        String duiCliente, nombreCliente;
        long telefonoCliente;
        double abono, retiro;
        System.out.println("Ingrese los datos que le solicitan a continuacion");
        System.out.println("Nombre del propietario");
        duiCliente = leer.nextLine();
        
        System.out.println("Numero DUI");
        nombreCliente = leer.nextLine();
        
        System.out.println("Telefono");
        telefonoCliente = leer.nextLong();
        
        Cliente propietario = new Cliente(duiCliente, nombreCliente, telefonoCliente);
        cuenta.propietarioCuenta = propietario;
        
        System.out.println("Ingresa la cantidad a abonar");
        cuenta.abonar(abono = leer.nextDouble());
        
        System.out.println("Ingrese la cantidad a retirar");
        cuenta.retirar(retiro = leer.nextDouble());
        
        System.out.println("Su saldo de la cuenta es: " + cuenta.saldoCuenta);
        
        System.out.println("Datos del propietario: \n" + cuenta.datosPropieroCuenta());
    }
}
