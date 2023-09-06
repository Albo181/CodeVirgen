import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String correctPass = "boobies";
        int attempts = 0;

        Scanner console = new Scanner(System.in);

        while (attempts < 3) {
            System.out.println("Introduce la contraseña: ");
            String userInput = console.nextLine();

            if (userInput.equals(correctPass)) {
                System.out.println("La contraseña es correcta. Bienvenido a Boobielandia.");
                break;
            } else {
                attempts++;
                System.out.println("Contraseña incorrecta. Te quedan " + (3 - attempts) + " intentos");

                if (attempts == 3) {
                    System.out.println("Cuenta desactivada por superar el número de intentos permisibles.");
                }

            }
        }


    }
  }