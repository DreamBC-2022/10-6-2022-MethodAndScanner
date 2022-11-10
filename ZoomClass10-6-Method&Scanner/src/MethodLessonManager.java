public class MethodLessonManager {

    static void myWorld(){
        System.out.println("What's up World");
    }
    static void myMethod(String message){
        System.out.println(message);
        //by putting this Method we can call this in other Methods(mains)
        //so by typing myMethod(); it will print
        //by adding String message to myMethod() it is expecting us to pass a String when we called myMethod
        System.out.println("-Cam 2015");
        //this will add "-Rey" after what is entered into the myMethod
    }

    static void myYearMethod(String message, int year){
        System.out.println(message);
        System.out.println("-Cam" + " "+ year);

    }

    static void checkAge(int age){
        int x = 100; //x is only accessiable within the checkAge method
        if (age < 21){
            System.out.println("Naw Bro");
        } else{
            System.out.println("Come on in");
        }
        }

        static int sum(int k){
            System.out.println("in sum method");
            System.out.println("k = " + k);

            if(k > 0) {
                return k + sum(k-1);
                //since we call k to interact itself so it will continue without any input from us
            }
            else{
                return 0;
            }

        }



    public static void main(String[] args){
        //with void it is not expecting a return
        //void can be replace with int, string,float if it is expecting those
        //args is a array of String that will be run
        myYearMethod("be Happy", + 2013);
        myMethod("You is smart");
        myMethod("you is important");
        myMethod("you is special");
        myWorld();
        checkAge(20);
        //System.out.println(x);
        //this can not print because it is only accessible to checkAge
        int result = sum(5);
        System.out.println(result);
    }
}
