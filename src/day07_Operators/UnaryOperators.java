package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int num1 = +25; //+ is optional
        int num2 = -25; //- mandatory

        System.out.println(num1 < 0 ); //false
        System.out.println(num2 < 0 ); //true

        System.out.println("--------------------------------------");

        int a = 5;
        ++a; //pre increment.increases the value by one right away.
        System.out.println(a);

        --a; //pre decrement. decraeses the value by one immediatly
        System.out.println(a);

        System.out.println("--------------------------------------");

        int b = 100;
        System.out.println(++b);//pre increament

        int c = 100;
        System.out.println(c++);//post increment:postpones it
        System.out.println(c);//101

        System.out.println("--------------------------------------");

        int x = 200;

        System.out.println(--x); //pre decrement:  dercrases  the value by one immediatly

        int y = 200;
        System.out.println(y--);//post decrement; first passes the current value then decreses
                                    // the value by 1
        System.out.println(y);
        System.out.println("----------------------------------------------");

        int z = 45;

        System.out.println(++z);//pre icreasemet 46
        System.out.println(z++);//46
        System.out.println(z);//47

        int q = 30;
        System.out.println(--q);//pre;29
        System.out.println(q--);//29
        System.out.println(q);//28
    }
}
