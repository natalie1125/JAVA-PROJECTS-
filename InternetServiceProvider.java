import java.util.Scanner;

public class InternetServiceProvider
{
    public static void main(String[] args)
    {
        char selectPackage;
        String input;
        double totalCharge = 0.0;
        double hours;

        // create the Scanner Object
        Scanner keyboard = new Scanner(System.in);

        // Ask the user for the input package
        System.out.print("Enter your package (A,B, or C): ");
        input = keyboard.nextLine();
        selectPackage = input.charAt(0);

        // Check the input package is valid and get the number of hours
        if (selectPackage < 'A' || selectPackage > 'C')
        {
            System.out.println("Invalid package. Please enter A, B, or C");
        }
        else
        {
            System.out.print("Enter the number of hours that you used: ");
            hours = keyboard.nextDouble();

            // Determine the bill charge
            switch (selectPackage)
            {
                case 'A':
                    totalCharge = 9.95;
                    if (hours > 10.0)
                        totalCharge += (hours - 10.0) * 2.0;
                    break;
                case 'B':
                    totalCharge = 13.95;
                    if (hours > 20.0)
                        totalCharge += (hours - 20);
                    break;
                case 'C':
                    totalCharge = 19.95;
            }
        // Display the result
            System.out.println("\n--------------------------------------");
            System.out.printf("The total charge is $%.2f.", totalCharge);
            System.out.println("\n--------------------------------------\n");
        }

    }
}