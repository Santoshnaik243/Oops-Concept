import java.util.Scanner;

class Bank{
    private int acc_balance = 500;
    private int pwd = 243;

    public void checkBalance(){
        int x;
        System.out.println("Enter your Password:");
        Scanner s1 = new Scanner(System.in);
         x = s1.nextInt();
         if(pwd == x){
            System.out.println("Your Account Balance is :"+" "+ acc_balance);

         }
         else{
            System.out.println("Incorrect Password");
 
         }
    }

    public void Credit(){
        int y; 
        int c;
        System.out.println("Enter your Password:");
        Scanner s1 = new Scanner(System.in);
        y = s1.nextInt();
        
         if (pwd == y) {
            System.out.println("How much money to be Credited:");
            c = s1.nextInt();
            acc_balance = acc_balance + c;  
            System.out.println("Total Balance:"+" "+acc_balance); 
        }
        else{
            System.out.println("Incorrect Password");

        }
       
    }

    public void Debit(){
        int z; 
        int d;
        System.out.println("Enter your Password:");
        Scanner s1 = new Scanner(System.in);
        z = s1.nextInt();
        
         if (pwd == z) {
            System.out.println("How much money to be Debited:");
            d = s1.nextInt();
            if (acc_balance<=d) {
                System.out.println("Sorry you have"+" "+acc_balance+" "+"rupees");
                return;
            }
            acc_balance = acc_balance - d;  
            System.out.println("Total Balance:"+" "+acc_balance); 
        }
        else{
            System.out.println("Incorrect Password");

        }
       
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Bank b = new Bank();
        int ch;
        System.out.println("1: CheckBalance");
        System.out.println("2: Credit");
        System.out.println("3: Debit");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Choice:");
        ch = s.nextInt();
        switch (ch) {
            case 1: b.checkBalance();
                break;
            case 2: b.Credit();
            break;
            case 3: b.Debit();
            break;
        
            default: System.out.println("Invalid Choice:");
                break;
        }

        
    }
}
