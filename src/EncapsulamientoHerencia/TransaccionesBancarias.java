
package EncapsulamientoHerencia;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class TransaccionesBancarias {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
        double abonoCuenta, cargoCuenta;
        try{
            //Ingreso de los respectivos valores a los atributos heredados 
            System.out.println("DUI del clente");
            long numDui = Long.parseLong(leer.readLine());
            System.out.println("Nombre del Cliente");
            String nombres = leer.readLine();
            System.out.println("Telefono del cliente");
            String telefono = leer.readLine();
            
            //Ingresar valores de prueba
            System.out.println("Ingresar el abono a la cuenta");
            abonoCuenta = Double.parseDouble(leer.readLine());
            System.out.println("Ingresar el cargo a la venta");
            cargoCuenta = Double.parseDouble(leer.readLine());
            
            //Asignar los valores de los atributos heredados
            cuenta.setNumDui(numDui);
            cuenta.setNomCliente(nombres);
            cuenta.setTelCliente(telefono);
            
            //Retornar valores del metodo get de la clase heradada 
            System.out.println("Numero de DUI: " +cuenta.getNumDui());
            System.out.println("Nombre del Cliente: " + cuenta.getNomCliente());
            System.out.println("Telefono del cliente: " + cuenta.getTelCliente());
            
            //Asignar valores metodo get
            cuenta.setAbonoCuenta(abonoCuenta);
            cuenta.setCargoCuenta(cargoCuenta);
            cuenta.setSaldoCuenta();
            //Retornor valores metodo get
            System.out.println("Abono: " + cuenta.getAbonoCuenta());
            System.out.println("Cargo: " + cuenta.getCargoCuenta());
            System.out.println("Saldo: " + cuenta.getSaldoCuenta());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
