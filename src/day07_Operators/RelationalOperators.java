package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        // >,>=, < , <=

        boolean result1 = 200 > 40;//true
        System.out.println("result = " + result1);

        boolean result2 = 300>= 150;//true
        System.out.println("result2 = " + result2);

        boolean result3 = 100>= 100;//true. one of these >= must be true then it is true
        System.out.println("result3 = " + result3);

        boolean result4 = 300>= 500; //false. thise numbers are not greater or equal
        System.out.println("result4 = " + result4);

        //credit score of 720
        int creditscore = 745;

        boolean isEligibleForLoan = creditscore >= 720;// if the creditscore is 720 or greater, then it is eligible

        boolean result5 = 100< 120; //true
        System.out.println("result5 = " + result5);

        boolean result6 = 200 < 180; //false
        System.out.println("result6 = " + result6);

        int score = 75;
        boolean hasFiled = score <= 59;//false
        System.out.println("hasFiled = " + hasFiled);

        boolean result7 = 45<= 60;//true
        System.out.println("result7 = " + result7);

        System.out.println("---------------------------------");

        int x = 100;
        int y = 200;

        boolean equal = x==y;//false
        //100==200
        System.out.println("equa = " + equal);

        boolean result8 = "Muhtar" == "Good Guy";//false
        System.out.println("result8 = " + result8);

        boolean result9 = 'A' == 'a';//false
        System.out.println("result9 = " + result9);

        boolean result10 = "Java" == "Java";//true
        System.out.println("result10 = " + result10);

        System.out.println("-----------------------------------");

        //"Hello World"== "hello world"; false
        System.out.println("-----------------------------------");

        boolean result11 = 100 != 200.5; //true. esut degil,true
        System.out.println("result11 = " + result11);

        boolean result12 = "Java" != "Break"; //true
        System.out.println("result12 = " + result12);

        boolean result13 = 300 != 300;//false
        System.out.println("result13 = " + result13);








    }






}