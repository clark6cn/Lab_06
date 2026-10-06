import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        boolean done = false;
        String againYN = "";
        do {
            boolean validInput = false;
            do {
                System.out.println("What is the temperature in Celsius?");
                if (in.hasNextDouble()) {
                    celsius = in.nextDouble();
                    validInput = true;
                } else {
                    String trash = in.nextLine();
                    System.out.println("You must enter a valid number, not " + trash);
                }
            }while(!validInput);
            System.out.println("Celsius is " + celsius);
            double fahrenheit = (((double) 9 / 5) * celsius) + 32;
            System.out.println("Then Fahrenheit is: " + fahrenheit + "º");
            in.nextLine();
            boolean validYN = false;
            do {
                System.out.println("Would you like to go again? (Y/N)");
                againYN = in.nextLine();
                if (againYN.equalsIgnoreCase("Y")) {
                    validYN = true;
                    done = false;
                } else if (againYN.equalsIgnoreCase("N")) {
                    validYN = true;
                    done = true;
                } else {
                    System.out.println("You must enter a valid input, not " + againYN);
                }
            }while(!validYN);
        }while(!done);

    }
}