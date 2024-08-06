import java.util.Scanner;

public class trueShooting {

    public static void main(String[] args) {
        name();
    }

    public static void name() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("State the player's first initial: ");
        String firstName = scanner.next(); 

        System.out.println("State the player's last name: ");
        String secondName = scanner.next(); 

        System.out.println("Player's total points: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid integer for total points.");
            scanner.next(); // Clear the invalid input
        }
        int tp = scanner.nextInt(); 

        System.out.println("Player's total field goal attempts: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid integer for total field goal attempts.");
            scanner.next(); // Clear the invalid input
        }
        int fga = scanner.nextInt(); 

        System.out.println("Player's total free throw attempts: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid integer for total free throw attempts.");
            scanner.next(); // Clear the invalid input
        }
        int fta = scanner.nextInt(); 

        scanner.close();

        calculations(tp, fga, fta, firstName, secondName);
    }

    public static void calculations(int total, int fieldGoal, int freeThrow, String f1, String f2) {
        double part1 = (0.5 * total); 
        double part2 = ((fieldGoal) + (0.44 * freeThrow)); 
        double result = ((part1) / (part2)); 
       
        System.out.println("\n\n");
        System.out.println("Player name: " + f1 + "." + f2);
        System.out.println("TS%: " + String.format("%.3f", result));
    }
}
