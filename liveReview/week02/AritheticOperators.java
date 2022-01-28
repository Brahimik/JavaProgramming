package week02;

public class AritheticOperators {
    public static void main(String[] args) {

        System.out.println("10/ 3 : "+ (10/3));
        System.out.println("10 / 3.0 : "+ (10/3.0));//3.0 is double dataType
        System.out.println("10 + 3 : " + 10 + 3);// 10 + 3 : 103 concatinationSTRING+INTEGER
       // RESULT INTEGER "10 + 3 : "+10 = "10 = 3: 10" -----String + int = String
//which operation comes first in java
// paranthesis comes first,division multiplaction is before concatinatiion
        
        //impotant : JAVA RUNS FROM TOP TO BOTTOM AND LEFT TO RIGHT 

        int num1 = 10;
        double num2 = 3.0;
        
        int result = (int) (num1/num2); //explicit

        System.out.println("result = " + result);

    }





}
