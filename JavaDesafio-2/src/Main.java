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



        // se crea un objeto de nombre gestor donde se almacenan los datos introducidos por consola
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

            /*se realiza una validacion para que la calificacion de examen sea >=10 & <=10 y si no es asi el programa cierre y
             envie un mensaje sobre dato incorrecto */
            if (calificacionExamen < 0 || calificacionExamen > 10){
                System.out.println("Introduciste un dato incorrecto");
                System.exit(0);
            }

        }
            /*se recorre la cantidad cantidad de personas y en cada iteracion por medio del la sentencia if se almacena
             la calificacion mas alta y la mas baja en las variables calificacionAlta y calificacionBaja*/
        for (int i = 0; i < cantidad; i++) {
            int promocionan = 0;
            int reprueban = 0;
            if (gestor[i].calificacionExamen >= calificacionAlta) {
                calificacionAlta = gestor[i].calificacionExamen;
            }
            if (gestor[i].calificacionExamen < calificacionBaja) {
                calificacionBaja = gestor[i].calificacionExamen;
            }
            // si un alumno tiene una calificacion >=7 se incrementa el contador de promocionan
            if (gestor[i].calificacionExamen >= 7) {
                promocionan++;
                System.out.println("Alumno que promociona: " + gestor[i].nombre + " con una calificacion de: "
                        + gestor[i].calificacionExamen + " y han aprobado " + promocionan + " estudiantes" );
                // si la calificacion es <7 se almacena en reprueban
            }else{
                reprueban++;
                System.out.println("Alumno que reprueba: " + gestor[i].nombre + " con una calificacion de: "
                        + gestor[i].calificacionExamen + " y han reprobado " + reprueban +  " estudiantes");

                }



        }
        // se recorre la cantidad de alumnos y se verifica cuantos alumnos obtuvieron la nota mas alta y la nota mas baja
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
