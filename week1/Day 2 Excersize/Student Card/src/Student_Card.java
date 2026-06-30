import java.util.Scanner;

public class Student_Card {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("What is your age?");
        int age = Integer.valueOf(scanner.nextLine());

        System.out.println("What is your major?");
        String major = scanner.nextLine();

        System.out.println("What is your GPA?");
        double gpa = Double.valueOf(scanner.nextLine());

        System.out.println("What is your favorite programming language?");
        String fav = scanner.nextLine();

        System.out.println();
        System.out.println();

        for (int i = 0; i < 33; i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.print("        Student Profile");
        System.out.println();

        for (int i = 0; i < 33; i++) {

            System.out.print("=");
        }

        System.out.println();

        System.out.printf("Name: %s\n", name);
        System.out.printf("Age: %d\n", age);
        System.out.printf("Major: %s\n", major);
        System.out.printf("GPA: %.2f\n", gpa);
        System.out.printf("Language: %s\n", fav);

        for (int i = 0; i < 33; i++) {

            System.out.print("=");
        }

        System.out.println();

        if (gpa > 3.5) {
            System.out.println("*** Dean's List Student ***");
        }

        scanner.close();
    }
}