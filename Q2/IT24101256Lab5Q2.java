import java.util.Scanner;
public class IT24101256Lab5Q2
{
 public static void main(String[]args)
 {
  //Create an object called input to scanner class
   Scanner input=new Scanner(System.in);

  // Input the number of new members introduced
        System.out.print("Enter the number of new members introduced: ");
        int newMembers = input.nextInt();

        // Validate the input
        if (newMembers < 0) {
            System.out.println("Input must be a number 0 or greater");
        } else {
            String prize;

            // Determine the prize using switch statement
            switch (newMembers) {
                case 0:
                    prize = "No Prize";
                    break;
                case 1:
                    prize = "Pen";
                    break;
                case 2:
                    prize = "Umbrella";
                    break;
                case 3:
                    prize = "Bag";
                    break;
                case 4:
                    prize = "Travelling Chair";
                    break;
                default:
                    prize = "Headphone";
                    break;
            }

            // Output the prize
            System.out.println("\nPrize is a: " + prize);
        }
    }
}