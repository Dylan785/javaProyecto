import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un dia");
        int dd = scanner.nextInt();
        System.out.println("Ingrese un mes");
        int mm = scanner.nextInt();
        System.out.println("ingrese un ano");
        int aa = scanner.nextInt();


        if (mm >= 1 && mm <= 12 && aa >= 1900 && aa <= 2099) {
        } if (mm == 1 && dd >=1 && dd <= 31) {
        } else if (mm == 2 && dd >=1 && dd <= 28) {
        } else if (mm == 2 && aa %4 == 0 && dd >=1 && dd <= 29) {
        } else if (mm == 3 && dd >=1 && dd <= 31) {
        } else if (mm == 4 && dd >=1 && dd <= 30) {
        } else if (mm == 5 && dd >=1 && dd <= 31) {
        } else if (mm == 6 && dd >=1 && dd <= 30) {
        } else if (mm == 7 && dd >=1 && dd <= 31) {
        } else if (mm == 8 && dd >=1 && dd <= 30) {
        } else if (mm == 9 && dd >=1 && dd <= 31) {
        } else if (mm == 10 && dd >=1 && dd <= 31) {
        } else if (mm == 11 && dd >=1 && dd <= 30) {
        } else if (mm == 12 && dd >=1 && dd <= 31) {
        } else {
            System.out.println("introduciste un dato incorrecto");
        }
        System.out.println("Correcto");
    }



}