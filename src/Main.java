import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");


        Scanner input  = new Scanner(System.in);
        System.out.println("Please give me a number to square");
        int num = input.nextInt() ;
        System.out.println(squareNumber(num));



        helloWorld();
        hello("Kanye ", "Winne the pooh");
        System.out.println(squareNumber(5));
        int myNewNumber=squareNumber(4);
        multiplyByFive(myNewNumber);
        System.out.println(hello("Killoran"));
        areaOfSquare(5);
        periOfSquare(6);
        areaOfCircle(5);
        periOfCircle(5);
        areaOfTri(4,5);
        periOfTri(3,3,3);



    }
    static void periOfTri(double a, double b, double c){
        System.out.println(a+b+c);
    }
    static void areaOfTri(double length, double b){
        System.out.println((length*b)*1/2);
    }

    static void periOfCircle(double length){
        System.out.println(Math.PI*length*2);
    }

    static void areaOfCircle(double radius){
        System.out.println(Math.PI*(radius*radius));
    }

    static void periOfSquare(double length){
        System.out.println(length*4);
    }

    static void areaOfSquare(double length){
        System.out.println(length*length);
    }




    static String hello(String a ){
        a = "Hello to "+a;
        return a;
    }
    static void helloWorld(){
        System.out.println("Hello World! Hehe");
    }

    static void hello(String a, String b){
        System.out.println("Hello "+ a + "Hello "+b);
    }
    static int squareNumber (int a){
        int squareValue = a*a;
        return squareValue ;
    }
    static void multiplyByFive(int a){
        System.out.println(a*5);
    }
}