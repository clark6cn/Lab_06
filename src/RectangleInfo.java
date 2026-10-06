import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double width = 0;
        double height = 0;
        boolean done = false;
        String trash = "";
        do{
            System.out.println("What is the width of the rectangle?");
            if(in.hasNextDouble()){
                width = in.nextDouble();
                done = true;
            }
            else{
                trash = in.nextLine();
                System.out.println("You must enter a valid number, not " + trash);
                done = false;
            }
        }while(!done);
        done = false;
        do{
            System.out.println("What is the height of the rectangle?");
            if(in.hasNextDouble()){
                height = in.nextDouble();
                done = true;
            }
            else{
                trash = in.nextLine();
                System.out.println("You must enter a valid number, not " + trash);
                done = false;
            }
        }while(!done);
        double area = width*height;
        double perimeter = (2*width)+(2*height);
        double diagonal = Math.sqrt((width*width)+(height*height));
        System.out.println("The area of the rectangle is " + area);
        System.out.println("The perimeter of the rectangle is " + perimeter);
        System.out.println("The diagonal of the rectangle is " + diagonal);
    }
}
