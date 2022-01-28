package week02;

public class CraInfo {
    public static void main(String[] args) {
// you sjould type your favorite car
        int year = 2022;
        String make = "Audi";
        String model = "A8";
        // aytomathic = true manual = false;
        boolean transmission = true;
        String colour = "white";
        int milage = 0;
        int price = 75_000; // for euro

        System.out.println(year + " " + make + " " + " " + model + " transmission");
        System.out.println(colour + " " + milage + "+price+ ");

        //lets turn this value into tl. 1 euro = 15.5 tl

        double priceInTL = price * 15.5;

        double taxRate = 1.80;//for this kind of cars

        double priceAfterTaxInTL = priceInTL * taxRate;
        System.out.println("priceAfterTaxInTL = " + priceAfterTaxInTL);

//variables are used because they can make our data reuseable and maintainable
    }
}
