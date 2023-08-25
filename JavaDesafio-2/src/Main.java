import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas: ");
        int cantidad = scanner.nextInt();
        int contador1 = 0;
        int contador2 = 0;
        int calificacionAlta = MIN_VALUE;
        int calificacionBaja = MAX_VALUE;
        int promocionan = 0;
        int reprueban = 0;



        GestorDeAlumnos[] gestor = new GestorDeAlumnos[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Digite su nombre: ");
            String nombre = scanner.next();
            System.out.println("Digite su apellido: ");
            String apellido = scanner.next();
            System.out.println("Digite su calificacion: ");
            int calificacionExamen = scanner.nextInt();
            System.out.println("Digite su numero de examen: ");
            int nroExamen = scanner.nextInt();
            gestor[i] = new GestorDeAlumnos(nombre, apellido, nroExamen, calificacionExamen);

            if (calificacionExamen >=0 && calificacionExamen <= 10){
                continue;
            } else{
                System.out.println("Introduciste un dato incorrecto");
                System.exit(0);
            }

        }

        for (int i = 0; i < cantidad; i++) {
            if (gestor[i].calificacionExamen >= calificacionAlta) {
                calificacionAlta = gestor[i].calificacionExamen;
            }
            if (gestor[i].calificacionExamen < calificacionBaja) {
                calificacionBaja = gestor[i].calificacionExamen;
            }
            if (gestor[i].calificacionExamen >= 7) {
                promocionan++;
                System.out.println("Alumno que promociona: " + gestor[i].nombre + " con una calificacion de: "
                        + gestor[i].calificacionExamen + " y han aprobado " + promocionan + " estudiantes" );

            }else{
                reprueban++;
                System.out.println("Alumno que reprueba: " + gestor[i].nombre + " con una calificacion de: "
                        + gestor[i].calificacionExamen + " y han reprobado " + reprueban +  " estudiantes");

                }



        }
        for(int i = 0; i < cantidad; i++) {
            if (calificacionAlta == gestor[i].calificacionExamen){
                contador1++;
            }
            if (calificacionBaja == gestor[i].calificacionExamen){
                contador2++;
            }

        }

        System.out.println("La calificacion mas alta fue: " + calificacionAlta + " y el numero de alumnos obtuvieron esta clificacion fueron: " + contador1);
        System.out.println("La calificacion mas baja fue: " + calificacionBaja + " y el numero de alumnos obtuvieron esta clificacion fueron: " + contador2);




}

    }
