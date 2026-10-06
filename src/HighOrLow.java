import java.util.Random;
import java.util.Scanner;

public class HighOrLow {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int randomNum = rand.nextInt(1, 11);
        int guess = 0;
        boolean done = false;
        String trash = "";
        do{
            System.out.println("Guess a number between 1 and 10:");
            if(in.hasNextInt()){
                guess = in.nextInt();
                if(guess>=1 && guess<=10){
                    done = true;
                }
                else{
                    System.out.println("Your guess must be between 1 and 10.");
                    done = false;
                }
            }
            else{
                trash = in.nextLine();
                System.out.println("You must enter a valid number, not " + trash);
                done = false;
            }
        }while(!done);
        System.out.println("The random number was " + randomNum);
        if(guess>randomNum){
            System.out.println("Your guess was too high!");
        }
        else if(guess<randomNum){
            System.out.println("Your guess was too low!");
        }
        else{
            System.out.println("Your guess was on the money!");
        }
    }
}
