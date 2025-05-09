import java.util.Scanner;
public class MiniATM{
    public static void main(String[] args){
        System.out.println(".....Welcome to Mini ATM.....");
        int balance = 0;
        int amount;
        int choice;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice:"); 
            choice = sc.nextInt();
        switch(choice){
            case 1:
            System.out.println("Your balance is :"+balance);
            break;
            case 2:
            System.out.println("Enter amount to deposit:");
            amount = sc.nextInt();
            balance += amount;
            System.out.println("Amount deposited Successfully!");
            break;
            case 3:
            System.out.println("Enter amount to Withdraw:");
            amount = sc.nextInt();
            if(amount <= balance){
                balance -= amount;
                System.out.println("Withdrawl Successful!");
            }else{
                System.out.println("Insufficient Balance");
            }
            break;
            case 4:
            System.out.println("Thank You!");
            sc.close();
            System.exit(0);
            break;
            default:
            System.out.println("Invalid choice.Please try again");
            break;
        }
    }
}
}
