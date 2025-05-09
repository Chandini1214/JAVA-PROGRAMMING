import java.util.*;
public class StudentGradeCalculator {
    public static char grade(float average){
    if(average >= 90){
        return 'A'; 
    }
    else if(average >= 80){
        return 'B'; 
    }
    else if(average >= 70){
        return 'C'; 
    }
    else if(average >= 60){
        return 'D'; 
    }
    else{
        return 'F';
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student name:");
        String name = sc.nextLine();
        System.out.println("Enter the marks of Subject1:");
        int s1 = sc.nextInt();
        System.out.println("Enter the marks of Subject2:");
        int s2 = sc.nextInt();
        System.out.println("Enter the marks of Subject3:");
        int s3 = sc.nextInt();
        System.out.println("Enter the marks of Subject4:");
        int s4 = sc.nextInt();
        System.out.println("Enter the marks of Subject5:");
        int s5 = sc.nextInt();
        int total = s1 + s2 + s3 + s4 + s5;
        float average = total/5.0f;
        System.out.println("Total Marks:" + total);
        System.out.println("Average:" + average);
        char grade = grade(average);
        System.out.println("Grade:" + grade);
        sc.close();
    }
}