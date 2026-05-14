import java.util.Scanner;

public class UserInfo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("What is your age?");
        int age = Integer.valueOf(scanner.nextLine());
        System.out.println("What is your GPA?");
        double gpa = Double.valueOf(scanner.nextLine());
        System.out.printf("Your name is %s\nYour age is %d\nYour GPA is %.1f\n", name, age, gpa);

        scanner.close();
    }
}
