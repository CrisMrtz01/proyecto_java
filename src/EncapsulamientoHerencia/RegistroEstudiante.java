
package EncapsulamientoHerencia;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RegistroEstudiante {
    public static void main(String[] args) {
        Estudiante est = new Estudiante();
        
        BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
        try{
            //Ingreso de los respectivos valores
            System.out.println("Carnet del estudiante");
            long carnet = Long.parseLong(leer.readLine());
            System.out.println("Nombres del estudiante");
            String  nombres = leer.readLine();
            System.out.println("Apellidos del estudiante");
            String apellidos = leer.readLine();
            
            //Asignando los valores a cada atributo
            est.setCarnetEstudiante(carnet);
            est.setNombresEstudiantes(nombres);
            est.setApellidosEstudiantes(apellidos);
            
            //Recuperacion de datos 
            System.out.println("<<Recuperando valores>>");
            System.out.println("Carnet: " + est.getCarnetEstudiante());
            System.out.println("Nombres: " + est.getNombresEstudiantes());
            System.out.println("Apellidos: " + est.getApellidosEstudiantes());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
