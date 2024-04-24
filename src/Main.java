public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            if (i == 3) {
                continue;
            }
        }
    }
}