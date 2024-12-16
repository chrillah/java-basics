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

        int sum = calculate(2, 10);
        System.out.println(sum);

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