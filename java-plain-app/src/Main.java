
import java.time.Duration;



public class Main {
    public static void main(String[] args) throws InterruptedException {
        // prints Hello World!
        System.out.println("Hello World!");

        // keeps the container alive for 1 hour
        Thread.sleep(Duration.ofHours(1));
    }
}