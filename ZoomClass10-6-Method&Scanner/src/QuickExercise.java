import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class QuickExercise {

    static void threeSamllest(int i, int e, int c) {
        int smallest;


        if(i< e && i< c) {
            smallest = i;
        }else if(e< i && e< c) {
            smallest = e;
        }else{
            smallest =c;
        }
        System.out.println("Smallest is " +smallest);

        }
        static void averageScanner(){
        Scanner scannyBoi = new Scanner(System.in);
        try {
            System.out.println("Please enter 1st number:");
            float a = scannyBoi.nextFloat();
            System.out.println("Please enter 2st number:");
            float b = scannyBoi.nextFloat();
            System.out.println("Please enter 3st number:");
            float c = scannyBoi.nextFloat();
            System.out.println((a + b + c) / 3);
        } catch(Exception e){
            System.out.println("We only take number inputs");
        }


        }
        static void passwordCheck(String pass) {
//            int intCount = 0;
            Pattern p = Pattern.compile("[^A-Za-z0-9 ]");
            Matcher m = p.matcher(pass);
            boolean check = m.find();
            if (check) {
                System.out.println("Special character found in the string");
            } else {
                System.out.println("Valid password Special character not found in the string");
            }
            if (pass.length() > 8) {
                System.out.println("Not enough characters");
            } else {
                System.out.println("Invalid password less than 10 characters in password");
            }
            int digit=0;
//            int specialChars = 0;
            int letters = 0;
            for(int i=0;i<pass.length();i++)
            {
                if(Character.isDigit(pass.charAt(i)))
                    digit++;
                if(Character.isLetter(pass.charAt(i)))
                    letters++;
            }
            if(digit >= 2 && pass.length() < 8) {
                System.out.println("Invalid Password");
            }else{
                System.out.println("good you have " + digit + " " + pass.length());
            }
        }


            public static void main (String[]args){

                threeSamllest(13,5,10);
                averageScanner();
                passwordCheck("beef@123");
            }
        }

