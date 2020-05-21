
package ejemplos;

public class Estudiante {
    String carnet;
    String nombre;
    String direccion;
    
    public Estudiante(){
    }
    
    public Estudiante(String carnet, String nombre, String direccion) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Estudiante(String carnet) {
        this.carnet = carnet;
    }

    
    
    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String information(){
    String info = "";
    info = "Su carnet es: " + this.carnet+"\n";
    info +="Su nombre es: " +this.nombre+"\n";
    info +="Su direccion es: " +this.direccion+"\n";
    return info;
            }
    
    public String info2(Estudiante est)
    {
        String info = "";
        info = "Su carnet es: " + est.getCarnet()+"\n";
        info +="Su nombre es: " + est.getNombre()+"\n";
        info +="Su direccion es: " + est.getDireccion()+"\n";
        return info;
    }
    
    
}
