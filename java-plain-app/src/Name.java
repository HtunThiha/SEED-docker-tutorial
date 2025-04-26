
import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        // asks for name and prints it back
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name?: ");
        String nameInput = scanner.nextLine();

        System.out.println("Your name is " + nameInput + "!");
    }
}