import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your age: ");
        int age = scanner.nextInt();
        scanner.close();
        System.out.printf("Your age is: %d", age);
    }
}