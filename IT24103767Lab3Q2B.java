import java.util.Scanner;
  public class IT24103767Lab3Q2B {
  public static void main (String[]args){
  Scanner scanner = new Scanner(System.in);
System.out.print("Enter the monthly salary:");
double monthly_salary = scanner.nextDouble();
System.out.print("Enter the number of OT hours:");
double number_of_OT_hours = scanner.nextDouble();
System.out.print("Enter the OT hourly rate:");
double OT_hourly_rate = scanner.nextDouble();
double OT_Amount = number_of_OT_hours * OT_hourly_rate;
double Total_salary = monthly_salary + OT_Amount;
System.out.printf("The Total_salary is: %.2f%n",Total_salary);
scanner.close();
     }
}