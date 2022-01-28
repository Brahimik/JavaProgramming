package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {

        //age: 38 years old
        byte age = 38;

        // weight: 160 pounds
        // byte weight = 160 is out of byte' range
        // byte nus = -129 is out of byte' range
        short weight = 160; // 160 is within the range of short

        //salary:100000 $
        // short salary = 100000; // 100000 is out of short' range
        int saalary = 100000; // int is the preffered data type for integer numbers


        long asset = 3_333_333_333l;

        //tax = 0.26

        float tax = 0.26f;

        double PI = 3.14;

        //we lwarn them all but the one we are gonna use is int and double..

char ch1 = '#';
/*
we will use char only when we have a single character data. for example
gender: 'M'    then you need to use char.
 */

        char gender = 'M';
        char grade = 'F';
        char yesNo = 'Y';

        //boolean we use  for true or false. for ex;

        boolean isemployed = true;
        boolean isMarried = false;
        boolean result = 100 > 300;

        System.out.println("isemployed = " + isemployed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);


    }


}
