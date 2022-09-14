package studio2;
import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Money to start: ");
		int startAmount = in.nextInt();
		int startingRound = startAmount;
		System.out.println("Input your win chance (between 0 and 1): ");
		double winChance = in.nextDouble();
		System.out.println("Amount that you want to win: ");
		int winLimit = in.nextInt();
		System.out.println("How many simulations do you want to play?");
		int totalSimulations = in.nextInt(); 
		int plays = 0;
		int day = 1;
		
		while (totalSimulations > 0)
		{
			totalSimulations = totalSimulations - 1;
			System.out.println("Day: " + day);
			while(startAmount > 0 && startAmount < winLimit) {
				double simulation = Math.random();
				if(simulation > winChance) {
					startAmount = startAmount - 1;
					plays +=1;
				}
				else {
					startAmount = startAmount + 1;
					plays +=1;
				}
	
			}
			System.out.println("# of plays: " + plays);
			plays = 0;
			if(startAmount == winLimit) {
				System.out.println("Day " + day + ": Success");
				startAmount = startingRound;
			}
			else {
				System.out.println("Day " + day + ": Ruin");
				startAmount = startAmount + startingRound;
			}
			day = day + 1;
		}
	}

}
