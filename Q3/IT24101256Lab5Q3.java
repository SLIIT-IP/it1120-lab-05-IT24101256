import java.util.Scanner;

public class IT24101256Lab5Q3 {
    public static void main(String[] args) {
        final int ROOM_CHARGE_PER_DAY = 48000;
        final int DISCOUNT_3_4_DAYS = 10;
        final int DISCOUNT_5_OR_MORE_DAYS = 20;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        // Validation
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than End date.");
            return;
        }

        // Calculate the number of days reserved
        int daysReserved = endDate - startDate;

        // Calculate the total amount to be paid
        int discountRate = 0;
        if (daysReserved == 3 || daysReserved == 4) {
            discountRate = DISCOUNT_3_4_DAYS;
        } else if (daysReserved >= 5) {
            discountRate = DISCOUNT_5_OR_MORE_DAYS;
        }

        double totalAmount = ROOM_CHARGE_PER_DAY * daysReserved * (1 - discountRate / 100.0);

        System.out.println("\nRoom Charge Per Day:"+ ROOM_CHARGE_PER_DAY);
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Total Amount to be Paid: Rs " + totalAmount);
    }
}