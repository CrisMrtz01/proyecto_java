
package ejercicios;


public class CuentaBancaria {
    long numerocuenta;
    Cliente propietarioCuenta;
    double saldoCuenta;
    
    public void abonar (double cantidad){
        saldoCuenta += cantidad;
    }
    
    public void retirar(double cantidad){
        if (cantidad > saldoCuenta) {
            System.out.println("Saldo Insuficiente!");
        }
        saldoCuenta -= cantidad;
       
    }
    
    public String datosPropieroCuenta(){
        String informacion = "";
        informacion += "DIU:" + propietarioCuenta.duiCliente + "\n";
        informacion += "Nombre:" + propietarioCuenta.nombreCliente + "\n";
        informacion += "Telefono" + propietarioCuenta.telefonoCliente + "\n";
        return informacion;
    } 
}
