package day08_IfStatements;

public class EvenlyDivisible {
    public static void main(String[] args) {
        int number = 100;

        boolean divisible2 = number % 2 ==0;//ture
        boolean divisibleBy3 = number % 3==0;//false
        boolean divisibleBy5 = number %5 == 0;//true

        System.out.println(number + "is divisible by 2 : " + divisible2);
        System.out.println(number + "is divisible by 3 : " + divisibleBy3);
        System.out.println(number + "is divisible by 5 : " + divisibleBy5);

        System.out.println("---------------------------------------");

        int Year = 200;

        boolean isLeapYear = Year % 4 == 0;

        System.out.println(Year+ " is leap year: "+ isLeapYear);
    }
}
/*
 2. Create a class called EvenlyDivisible,and write a program that can check if a number is evenly divisible by 2, 3, 5
    		Ex:
				number = 65;

			output:
				65 is divisible by 2: false
				65 is divisible by 3: false
				65 is divisible by 5: true
 */