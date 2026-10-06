import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double numGal = 0;
        double mpg = 0;
        double gasPrice = 0;
        boolean done = false;
        String trash = "";
        do{
            System.out.println("How many gallons are in your gas tank?");
            if(in.hasNextDouble()){
                numGal = in.nextDouble();
                done = false;
            }
            else{
                trash = in.nextLine();
                System.out.println("You must enter a valid number, not " + trash);
                done = true;
            }
        }while(done);
        do{
            System.out.println("What is your car's miles per gallon?");
            if(in.hasNextDouble()){
                mpg = in.nextDouble();
                done = false;
            }
            else{
                trash = in.nextLine();
                System.out.println("You must enter a valid number, not " + trash);
                done = true;
            }
        }while(done);
        do{
            System.out.println("What is the price per gallon?");
            if(in.hasNextDouble()) {
                gasPrice = in.nextDouble();
                done = false;
            }
            else{
                trash = in.nextLine();
                System.out.println("You must enter a valid number, not " + trash);
                done = true;
            }
        }while(done);
        double cost100Miles = (100/mpg)*gasPrice;
        double fullTank = numGal*mpg;
        System.out.println("The cost to drive 100 miles is $" + cost100Miles);
        System.out.println("Your car can go " + fullTank + " miles on a full tank.");
    }
}
