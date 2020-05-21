
package EjerciciosGuia.Ejercicio4;

public class Ejercicio4 {
        private String Nit;
        private String nombres;
        private String apellidos;
        private String direccion;
        private double salario;
        private double salarioconDesc;   

    public String getNit() {
        return Nit;
    }

    public void setNit(String Nit) {
        this.Nit = Nit;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalarioconDesc() {
        return salarioconDesc;
    }

    public void setSalarioconDesc() {
        this.salarioconDesc = this.salario - (this.salario * 0.10);
    }
}
