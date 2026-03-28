import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        boolean keepPlaying = true;

        while (keepPlaying) {
            System.out.println("Roll   Die1   Die2   Die3   Sum");
            System.out.println("_______________________________");

            int rollNumber = 0;
            boolean gotTriple = false;

            while (!gotTriple) {
                rollNumber++;

                int die1 = rand.nextInt(6) + 1;
                int die2 = rand.nextInt(6) + 1;
                int die3 = rand.nextInt(6) + 1;

                int sum = die1 + die2 + die3;

                System.out.printf("  %-5d  %-5d  %-5d  %-5d %-5d%n", rollNumber, die1, die2, die3, sum);

                if (die1 == die2 && die2 == die3) {
                    gotTriple = true;
                }

            }
            System.out.print("Roll again? (Y/N): ");
            String answer = in.nextLine().trim();

            if (!answer.equalsIgnoreCase("Y")) {
                keepPlaying = false;
            }
            System.out.println();
        }

        System.out.println("Goodbye!");
        in.close();

    }
}