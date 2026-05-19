import java.util.Scanner;

public class Student_Card{
    
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name?");
        String name = scanner.next();
        System.out.print("What is your age?");
        int age = Integer.valueOf(scanner.nextLine());
        System.out.print("What is your GPA?");
        double gpa = Double.valueOf(scanner.nextLine());




    




        scanner.close();
    }
}