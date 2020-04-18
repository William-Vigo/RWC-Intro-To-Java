import java.util.Arrays;
import java.util.Random;

public class dataStructures{
    public static void main(String[] args) {
        /*  Different ways to declare an array:
                1. type[] name = new type[size];
                2. type[] name;
                name = new type[size] 
                3. type[] name = {value, value, value};
        */
        
      int[] grades = new int[5];
        
        /*
            index =  0  1  2  3  4
              arr = [0, 0, 0, 0, 0]
        
        */
        System.out.println(Arrays.toString(grades));
        grades[0] = 88;
        /*
            index =  0  1  2  3  4
              arr = [88, 0, 0, 0, 0]
        
        */
        grades[1] = 90;
        grades[2] = 55;
        grades[3] = 4;
        grades[4] = 100;

        int[] arr = new int[5];
        Random rand = new Random();

        for(int i = 0; i < arr.length; i++){
            int num = rand.nextInt(100)+1;
            arr[i] = num;
        }

        String[] str = new String[5];
        str[2] = "hello";
        /*
            index =  0  1  2        3  4
              arr = [0, 0, "hello", 0, 0]
        
        */
        str[2] = "hi";
        /*
            index =  0  1  2        3  4
              arr = [0, 0, "hi", 0, 0]
        
        */
        System.out.println(Arrays.toString(str));

    }
}