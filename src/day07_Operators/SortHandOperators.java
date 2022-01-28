package day07_Operators;

import jdk.swing.interop.SwingInterOpUtils;

public class SortHandOperators {
    public static void main(String[] args) {
        //assignment: =
        int number = 100;

        System.out.println("number = " + number);//100

        number = 200;

        System.out.println("number = " + number);//200

        String word = "Java Programming";

        System.out.println("word = " + word);//Java Programming

        word = "Wooden Spoon";

        System.out.println("word = " + word);

        word = "Cydeo";

        System.out.println("word = " + word);//Cydeo

        word = "Java Programming";

        System.out.println("word = " + word);
        System.out.println("----------------------------------");

        //addition Assignment
        int x = 100;

        System.out.println("x = " + x);

        System.out.println(x + 200);//300

        //x = x + 200;

        x += 200; //shortcuts of adding

        System.out.println("x = " + x);

        String str = "Wooden";

        str += "Spoon";

        System.out.println("str = " + str);

        double num1 = 2.5;
        System.out.println("num1 = " + num1);//2.5

        num1 += 5.5;

        System.out.println("num1 = " + num1);

        double availableBalance = 1000.50;
        //deposit 300$
        availableBalance += 300;

        System.out.println("availableBalance = " + availableBalance);

        System.out.println("---------------------------------------");

        //withdrawing 500$

        availableBalance -= 500;//800.5

        System.out.println("availableBalance = " + availableBalance);

        //withdraw 200$, then depositing 400$

        availableBalance -= 200; //available balance = 600.5
        availableBalance += 400;//available balance = 1000.5
        System.out.println("availableBalance = " + availableBalance);

        System.out.println("----------------------------------------------");
        //multiplication assignment operator

        double salary = 5000.50;

        System.out.println("salary = " + salary);

        salary *=2;

        System.out.println("salary = " + salary);

        double dodge = 0.00000001;
        dodge *= 1000000;
        System.out.println("dodge = " + dodge);

        System.out.println("----------------------------------------------");
        // division assignment
        double num2 = 25000.0;
        //num2 = num2 /2;

        num2 /= 2;

        System.out.println("num2 = " + num2);

        System.out.println("----------------------------------------------");
        //Remainder Assignment

        double num3 = 100;

        //%=
        num3 %= 3;//1

        System.out.println("num3 = " + num3);

        System.out.println("----------------------------------------------");

        int y =300;

        y %= 16;

        System.out.println("y = " + y);

        System.out.println("--------------------------------------");

        int balance = 3500;
        //insurance fee:$153

        balance %=153;
        System.out.println("balance = " + balance);
    }





}
