import java.util.*;
public class EvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        findEven(number);
        sc.close();
    }
    public static void findEven(int number){
        if(number % 2 == 0){
            System.out.println(number + " is Even number");
        }
        else{
            System.out.println(number + " is Odd number");
        }
    }
}
