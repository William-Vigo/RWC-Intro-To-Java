//public class NameOfFileHere{}
public class syntax{
    public static void main(String[] args){
        // type name; or type name = value;
       
        System.out.println("line 1");
        System.out.println("line 2");
        
        int x =0;
        for(int y = 0; y < 10; y++){
            int z = 50;
            x+=z;
        } 
        
        System.out.println(x);
        //must start with latters a-z (uppercase or lowercase)
        //after first letter anything goes except special characters eg. !#$%^&*().,
        // Camel Case should be used
        int BankTotal = 0;
        for(int NumOfDeposits = 0; NumOfDeposits < 10; NumOfDeposits++){
            int DailDeposit = 50;
            BankTotal += DailDeposit;
        }
        System.out.println(BankTotal);

        
    }
}