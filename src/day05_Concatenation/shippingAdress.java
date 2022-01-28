package day05_Concatenation;

public class shippingAdress {
    public static void main(String[] args) {
        String name = "Erhan Burakmak",
                buildingNummer = "37-1",
                streetName = "Groen Van Prinstererstraat",
                city = "Amsterdam",
                state = "North Holland",
                zipCode = "1051EH"; /* IS THE WAY DECLARING ONE DATATYPE THEY
                                        ARE ALL String*/

        String adress = "name +\"\\n\"+ buildingNummer + \"\\n\" + streetName + \"\\n\" + city + \"\\n\" + state + \"\\n\" + zipCode";
        System.out.println(name +"\n"+ buildingNummer + "\n" + streetName + "\n" + city + "\n" + state + "\n" + zipCode);


    }


}
