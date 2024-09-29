import java.util.Scanner;

public class Project1{
    public static void main(String[] args) {
        System.out.println("Temp To Celcius");
        System.out.println("Enter the Celsius Value: ");
        Scanner sc = new Scanner(System.in);
        double C = sc.nextDouble();
        double F = 9.0 / 5.0 * C + 32.0;
        System.out.println("Fahrenheit: " + F);      
        sc.close();
    }
    
}