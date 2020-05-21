
package EjerciciosGuia;

 //1-. Modelar una clase Casa con los atributos número de casa, numero de pasaje y nombre de la calle. El número de la
//casa debe ser alfanumérico para contemplar las casas que tengan números como “27A”). Cuando la casa se crea se asigna
//tanto el número de la casa, el número de pasaje y la calle. La clase tiene que tener definido un método para imprimir 
// los valores asignados

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("El llamado del metodo es Aqui:");
        Casa("Numero de Casa: 199A");
        Casa("Numero de Pasaje: 155B");
        Casa("Nombre de la Calle: Los Cedros");
        
    }
   
    public static String Casa(String valores){
        System.out.println("Valores Asignados a la casa: " + valores);
        return valores;
    }
    //Este comentario servira para comprobar un cambio realizado en la terminal GitBash
}
