import java.util.Scanner;
public class ArithmeticOperations {
    public static double a;
    public static double b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        double a = sc.nextDouble();
        System.out.print("Enter the value of b : ");
        double b = sc.nextDouble();
        double sum = add(a, b);
        System.out.println("The Sum of " + a + " and " + b + " is : "+ sum);
        double minus = sub(a, b);
        System.out.println("The Subtraction of " + a + " and " + b + " is : " + minus);
        double multiply = mul(a, b);
        System.out.println("The Multiplication of " + a + " and " + b + " is : " + multiply);
        double division = div(a, b);
        System.out.println("The Division of " + a + " and " + b + " is : " + division);
        sc.close();
    }
    public static double add(double a, double b){
        return a + b;
    }
    public static double sub(double a, double b){
        return a - b;
    }
    public static double mul(double a, double b){
        return a * b;
    }
    public static double div(double a, double b){
        return a / b;
    }
}
    

