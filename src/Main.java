import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isContinue = true;
        do {
            System.out.println("Hello");
            System.out.println("Continue? (1/0)");
            int input = new Scanner(System.in).nextInt();
            if (input == 0) {
                isContinue = false;
            }

        } while (isContinue);
    }
}