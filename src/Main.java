import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Basic Java
        // Variables & Primitive variables
        // Casting
        // Det finns två typer av casting:
        //Implicit (automatisk) casting:
        //Java gör detta själv om du går från en mindre typ till en större typ.
        //Exempel:
        int litenNummer = 10;
        double storNummer = litenNummer; // Java omvandlar automatiskt
        System.out.println(storNummer);

        // Explicit casting:
        //Du måste själv berätta för Java att omvandla om du går från en större typ till en mindre typ (eftersom det kan innebära förlust av information).
        //Exempel:
        double storNummer1 = 10.5;
        int litenNummer2 = (int) storNummer; // Du "tvingar" Java att trimma ner
        System.out.println(litenNummer2);


/// ///////////////////////////////////////////////
        // Primitiva datatyper
        // byte
        // Beskrivning: Håller små heltal (8 bitar).
        // Värdeintervall: -128 till 127.
        // Exempel:
        byte ålder = 25;

        // short
        // Beskrivning: Håller lite större heltal (16 bitar).
        // Värdeintervall: -32,768 till 32,767.
        // Exempel:
        short år = 2024;

        // int
        // Beskrivning: Håller vanliga heltal (32 bitar).
        // Värdeintervall: -2,147,483,648 till 2,147,483,647.
        // Exempel:
        int population = 1000000;

        // long
        // Beskrivning: Håller mycket stora heltal (64 bitar).
        // Värdeintervall: -9,223,372,036,854,775,808 till 9,223,372,036,854,775,807.
        // Exempel:
        long avståndTillStjärna = 9460730472580800L; // L på slutet för att ange en long

        // float
        // Beskrivning: Håller decimaltal med enkel precision (32 bitar).
        // Exempel:
        float temperatur = 36.6f; // f på slutet för att ange en float

        // double
        // Beskrivning: Håller decimaltal med dubbel precision (64 bitar).
        // Exempel:
        double pi = 3.14159265359;

        // char
        // Beskrivning: Håller ett enda tecken (16 bitar, Unicode).
        // Exempel:
        char bokstav = 'A';

        // boolean
        // Beskrivning: Håller ett av två värden: true eller false.
        // Exempel:
        boolean ärJavaKul = true;


        // calling a method
        returnNothing("suck a dick");

        String result = "";

        result = returnString(2);
        System.out.println(result);

        result = returnString(12);
        System.out.println(result);

        int sum = calculate(12, 10);
        System.out.println(sum);


        // Arrayer
        // syntax

        // deklarera
        int[] intArray;
        intArray = new int[3];

        // tilldela
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        // Java Standard Library: Arrays
        // Arrays.toString
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        String[] names = {"Malin","Linda"};
        System.out.println(names);

        System.out.println(Arrays.toString(names));

        // Arrays.sort
        int[] unsortedNumbers = {6, 2, 4, 56, 7, 23, 9, 100, 1};

        // Skriver ut den osorterade arrayen
        System.out.println("Osorterade: " + Arrays.toString(unsortedNumbers));

        // Sorterar arrayen
        Arrays.sort(unsortedNumbers);

        // Skriver ut den sorterade arrayen
        System.out.println("Sorterade: " + Arrays.toString(unsortedNumbers));

        //Arrays.equals
        // boolean equals(int[] 1, int[] b)

        char[] arr1 = {'F', 'U', 'C', 'K'};
        char[] arr2 = {'f', 'u', 'c', 'k'};

        System.out.println(Arrays.equals(arr1, arr2));

        // Control flows
        // if(condition) / else if / else
        // switch / case
        // NYARE / switch, case enhanced
        int i1 = 0;
        switch(i1){
            case 0 -> System.out.println("0");
            case 1 -> System.out.println("1");
            default -> System.out.println("3");
        }

        // for-loop
        // for-each
        // for(type element : collection) { loop body}
        int[] exampleArrayNumbers = {1,3,4,5,6,3,2,4,6,7,8};
        for(int number : exampleArrayNumbers){
            System.out.println(number);
        }

        /*
        List<String> drinks = new ArrayList<>();
        drinks.add("cola");
        drinks.add("pepsi");
        */


        // while / do while

        /*
        int choice = 0;
        Scanner menu = new Scanner(System.in);

        do{
            try {
                choice = 0;
                System.out.println("MENU BITCH");
                System.out.println("1) Option 1");
                System.out.println("2) Option 2");
                System.out.println("3) Exit 3");
                System.out.println("Enter your choice bitch");
                choice = menu.nextInt();

                switch(choice){
                    case 1 -> System.out.println("Choice 1");
                    case 2 -> System.out.println("Choice 2");
                    case 3 -> System.out.println("Exiting bitch");
                    default -> System.out.println("Invalid choice bitch try again");
                }
            } catch(InputMismatchException e){
                System.out.println("No po, otra vez");
                menu.nextLine();
            }


        } while(choice != 3);
         */


        AnotherClass.methodFromThisClass();

        System.out.println(AnotherClass.testHest());

        System.out.println(AnotherClass.msg(12));
        System.out.println(AnotherClass.msg(19));

    }

    // Metoder
    // Syntax: return_type methodName(param_type param){}

    // example

    static void returnNothing(String msg){
        System.out.println(msg);
    }

    static String returnString(int a){

        String result = "";
        if(a > 10){
            result = "suck a big dick";
        }
        if( a < 10){
            result = "suck a small dick";
        }

        return result;
    }

    static int calculate(int a, int b){
        return a+b;
    }
}