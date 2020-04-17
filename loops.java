import java.util.Random;

public class loops{
    public static void main(String[] args) {
        /* for loop, while loop, do while loop
        
        for(starting value; condition; increment){
            ...code
        }
        
        for loop steps:
            1. check the condition
            2. if condition is true run code
            3. increment 
            4. repeat

        while(condition){
            ...code
            *** make sure condition eventually becomes false ***
        }

        while loop steps:
            1.  check condition
            2.  if condition is true run code
            4.  repeat
            *** BECAREFUL to not make infinite loops (condition evenntually has to become false) ***

        do{
            ...code
        }while(condition)

        do while steps:
            1.  run code
            2.  check condition
            3.  if condition is true run code
            4.  repeat

        */
        int Total = 0;
        Random rand = new Random();

        for(int start = 1; start <= 20; start++){
            Total += start;
            System.out.println(start);
        }
        
        int num = rand.nextInt(5);
        while(num != 2){
            System.out.println("Still looping");
            num = rand.nextInt(5);
        }
        
        
        num = rand.nextInt(5);
        do{
            System.out.println("looping");
            num = rand.nextInt(5);
        }while(num != 2);
    }
}