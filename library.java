//import fileInfoGoesHere;
import java.util.Scanner;

public class library{
    public static void main(String[] args) {
        //object name = new object(optional)
        Scanner scan = new Scanner(System.in);

        //name.   <- use . to access object methods
        System.out.println("Please insert a number");
        int num = scan.nextInt();

        //the + sign on line 12 is used to combine the string and int so it can print it out
        System.out.println("You typed: " + num);
        
        //forgot to mention in the video that for Scanner you have to make sure you use the close() method when you are done with object
        scan.close();
    }
}