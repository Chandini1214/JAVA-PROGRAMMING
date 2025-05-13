import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        while (true) {
        System.out.print("Enter the Year : ");
        year = sc.nextInt();
        if (year > 0) {
            break;
        }
        else{
            System.out.println("Year must be positive! Please try again!!!");
        }
        }
        if(year % 4 == 0 && year % 100 != 0){
            System.out.println("The year " + year + " is a Leap year ." );
        }
        else if(year % 100 == 0 && year % 400 == 0){
            System.out.println("The year " + year + " is a Leap year ." );
        }
        else{
            System.out.println("The year " + year + " is not a Leap year ." );
        }
        sc.close();
    }
}
