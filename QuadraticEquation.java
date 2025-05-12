import java.util.*;
public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Co-efficient a : ");
        double a = sc.nextDouble();
        System.out.print("Enter the Co-effiecient b : ");
        double b = sc.nextDouble();
        System.out.print("Enter the Co-efficient c : ");
        double c = sc.nextDouble();
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = - b + (Math.sqrt (discriminant));
            double root2 = -b - (Math.sqrt(discriminant));
            System.out.println("The Roots and are Real and Distinct.");
            System.out.println("The value of Root 1 : " + root1);
            System.out.println("The value of Root 2 :" + root2);
        }
        else if (discriminant == 0) {
            double root = - b / 2 * a;
            System.out.println("The Roots are Real and Equal.");
            System.out.println("The value of Root : " + root);
        }
        else{
            double realpart = -b / 2 * a;
            double imagpart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("The Roots are Complex and Imaginary.");
            System.out.println("Root 1 : " + realpart + " + " + imagpart + " i ");
            System.out.println("Root 2 : " + realpart + " - " + imagpart + " i ");
        }
        sc.close();
    }
}
