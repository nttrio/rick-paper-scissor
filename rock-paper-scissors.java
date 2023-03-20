import java.util.Scanner;

public class RPS1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] choices = {"rock", "paper", "scissors"};
        int round = 1;
        int playerScore = 0;
        int computerScore = 0;
        boolean continuePlaying = true;
        
        while (continuePlaying) {
            System.out.println("Round " + round);
            System.out.print("Enter your choice (rock, paper, scissors): ");
            String playerChoice = scanner.nextLine();
            int computerChoice = (int) (Math.random() * 3);
            System.out.println("Computer chooses " + choices[computerChoice]);
            
            if (playerChoice.equals(choices[computerChoice])) {
                System.out.println("Tie!");
            } else if (playerChoice.equals("rock") && choices[computerChoice].equals("scissors") ||
                    playerChoice.equals("paper") && choices[computerChoice].equals("rock") ||
                    playerChoice.equals("scissors") && choices[computerChoice].equals("paper")) {
                System.out.println("You win!");
                playerScore++;
            } else {
                System.out.println("Computer wins!");
                computerScore++;
            }
            
            if (round == 3) {
                System.out.println("Game over!");
                System.out.println("Your score: " + playerScore);
                System.out.println("Computer score: " + computerScore);
                System.out.print("Do you want to play again? (y/n): ");
                String answer = scanner.nextLine();
                if (answer.equalsIgnoreCase("n")) {
                    continuePlaying = false;
                    System.out.print("Thank you for playing!");
                } else {
                    round = 0;
                    playerScore = 0;
                    computerScore = 0;
                }
            }
            
            round++;
        }
        
        scanner.close();
    }
}
