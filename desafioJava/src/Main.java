import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un dia");
        int dd = scanner.nextInt();
        System.out.println("Ingrese un mes");
        int mm = scanner.nextInt();
        System.out.println("ingrese un año");
        int aa = scanner.nextInt();
        boolean fechaValida = false;

        /*aca determinamos si el mes y el año estan correctos y se hace la delimitacion de los dias de cada mes,
        tambien cuando el año es Biciesto
         */
        if(mm >= 1 && mm <= 12 && aa >= 1900 && aa <= 2099) {
            if ((mm == 1 || mm == 3 || mm == 5 || mm == 7 ||
                    mm == 9 || mm == 10 || mm == 12) && (dd >= 1 && dd <= 31)) {
                fechaValida = true;

            } else if (mm == 2 && ((aa % 4 == 0 && aa % 400 == 0) || aa % 100 != 0) && (dd >= 1 && dd < 30)) {
                fechaValida = true;

            } else if (mm == 2 && dd >= 1 && dd <= 28) {
                fechaValida = true;


            } else if (mm == 4 || mm == 6 || mm == 8 || mm == 11 && dd >= 1 && dd <= 30) {
                fechaValida = true;

            } else {

                fechaValida = false;
            }
        }
            if(fechaValida){
                System.out.println("La fecha ingresada es un dato correcto: " + "dia " + dd + ", mes " + mm + ", año " + aa);
            }
            // si no entra en ninguna de las sentencias if-elseif, se procede a mostrar por consola el mensaje de dato invalido
            else {
                System.out.println("La fecha ingresada es invalida: " + "dia " + dd + ", mes " + mm + ", año " + aa);
            }







    }



}