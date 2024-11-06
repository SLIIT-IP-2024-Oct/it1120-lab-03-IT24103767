import java.util.Scanner;
public class IT24103767Lab3Q1A{
public static void main(String[]args) {
Scanner scanner= new Scanner(System.in);
System.out.print("Enter the price of 1kg of rice:");
double priceperkg = scanner.nextDouble();
System.out.print("Enter the number of kilograms to buy:");
double number_of_kilograms= scanner.nextDouble();
double Total_Amount= priceperkg * number_of_kilograms;
System.out.printf("The total amount you have to pay is:%.2f%n",Total_Amount);
scanner.close();
 }
}