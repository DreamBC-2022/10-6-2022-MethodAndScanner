import java.util.Scanner;
public class ScannerManager {

    static void greeting() {
        Scanner Scanny = new Scanner(System.in);
        try {
            System.out.println("What is your First name? ");
            String firstName = Scanny.nextLine();
            System.out.println("What is your Last name? ");
            String lastName = Scanny.nextLine();
            System.out.println("What's your lucky #? ");
            int numb = Scanny.nextInt();
            System.out.println("Hello " + firstName + " " + lastName + ", your lucky number is " + numb);

        } catch (Exception e){
            System.out.println("Something went wrong, try again...");
        }
        }

        public static void main (String[]args){
            greeting();
        }
    }

