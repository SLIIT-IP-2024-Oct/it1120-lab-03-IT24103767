import java.util.Scanner;

public class IT24103767Lab3Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the price of 1 Kg of rice: ");
        double pricePerKg = scanner.nextDouble(); 

        System.out.print("Enter the number of kilograms to be bought: ");
        double kilograms = scanner.nextDouble();

        double totalAmount = pricePerKg * kilograms; 
        double discount = totalAmount * 0.10;
        double finalAmount = totalAmount - discount;

        System.out.printf("The amount to pay after a 10%% discount is: %.2f%n", finalAmount);
        
        scanner.close();
    }
}
