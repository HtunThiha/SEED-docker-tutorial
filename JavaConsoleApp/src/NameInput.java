import java.util.Scanner;

public class NameInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hello! What is your name?: ");
        String nameInput = scanner.nextLine();
        System.out.println("Your name is " + nameInput + "!");
    }
}
