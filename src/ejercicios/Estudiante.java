
package ejercicios;

public class Estudiante {
    long carnet;
    String nombre, apellido;
       public void registroEstudiante()
        {
            System.out.println("Metodo para registro de estudiante");
        }
       
       public void consultarEstudiante(){
           System.out.println("Metodo para consultas de estudiante");
       }
       
       public void eliminarEstudiante(){
           System.out.println("Metodo para eliminar estudiantes");
       }
    public static void main(String[] args) {
        Estudiante est = new Estudiante();  
        est.carnet = 1234;
        est.nombre = "Amelia";
        est.apellido = "Rosales";
        
        est.registroEstudiante();
        est.consultarEstudiante();
        est.eliminarEstudiante();
        
        System.out.println("Cartnet: " + est.carnet);
        System.out.println("Nombre: " + est.nombre);
        System.out.println("Apellido: " + est.apellido);
        

    }
}
