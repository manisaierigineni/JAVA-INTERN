import java.util.Scanner;
public class SimpleCalculator 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        while (true) 
		{
            System.out.println("Select operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
			System.out.println("5. Close");
            System.out.print("Enter choice (1/2/3/4/5): ");
            int choice = scanner.nextInt();
			if (choice == 5)
				break;
            if (choice >= 1 && choice <= 4) 
			{
                double n1 = scanner.nextDouble();
                double n2 = scanner.nextDouble();
                switch (choice) 
				{
                    case 1:
                        System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
                        break;
                    case 2:
                        System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
                        break;
                    case 3:
                        System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
                        break;
                    case 4:
                        double result = (n1/n2);
                        if (!Double.isNaN(result)) 
						{
                            System.out.println(n1 + " / " + n2 + " = " + result);
                        }
						break;
                }
            } 
			else 
			{
                System.out.println("Invalid Input");
            }
        }
    }
}
