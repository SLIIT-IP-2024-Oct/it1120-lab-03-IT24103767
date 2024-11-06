import java.util.Scanner;
public class IT24103767Lab3Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();
        String numberStr = Integer.toString(number);
        if (numberStr.length() == 5) {
            for (int i = 0; i < numberStr.length(); i++) {
                if (i < numberStr.length() - 1) {
                    System.out.print(numberStr.charAt(i) + " ");
                } else {
                    System.out.print(numberStr.charAt(i));
                }
            }
        } else {
            System.out.println("Please enter a valid five-digit number.");
        }

        scanner.close();
    }
}
