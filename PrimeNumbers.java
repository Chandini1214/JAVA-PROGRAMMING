import java.util.*;
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the Value1 : ");
        int x = sc.nextInt();
        System.out.print("Enter the Value2 : ");
        int y = sc.nextInt();
        printPrimeNumbers(x , y);
        sc.close();
    }
    public static boolean isPrime(int n){
        if (n <= 1) 
            return false;
        for(int i = 2; i <= n/2; i++)
            if (n % i == 0)
                return false;
        return true;
    }
    public static void printPrimeNumbers(int x , int y) {
        System.out.println("The Prime Numbers between " + x + " and " + y + " are : ");
        for(int i = x ; i <= y; i++)
            if (isPrime(i)) 
                System.out.println(i + " ");
            
    }

}
