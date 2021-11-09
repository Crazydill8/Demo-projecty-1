import java.util.Scanner;

public class startGame {
	
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		final paths direction = new paths();
		
		
		System.out.println("I was hoping to make this in a jFrame,");
		System.out.println("but unfortunately couldn't. I would like to learn more about using them");
		System.out.println("---------------------------------------------------------------------------------------------------------");
		System.out.println("You wake up in a dark dungeon; Looking behind you there is only");
		System.out.println("a wall, and so you must go forward. You find a fork where the path splits into 3 directions");
		System.out.println("");
		System.out.println("Choose a direction, left, straight, or to the right");
		
		String chosenDirection = input.nextLine();
		
		
		//Path will change based on input
		if(chosenDirection.equals("Left") || chosenDirection.equals("left") || chosenDirection.equals("Go left") || chosenDirection.equals("go left")) {
			direction.leftPath();
		}
		
		if(chosenDirection.equals("straight") || chosenDirection.equals("Straight") || chosenDirection.equals("Go straight") || chosenDirection.equals("go straight")) {
			direction.straightPath();
		}
		
		if(chosenDirection.equals("Right") || chosenDirection.equals("right") || chosenDirection.equals("Go right") || chosenDirection.equals("go right")) {
			direction.rightPath();
		}
		
		System.out.println("");
		System.out.println("The game is over. Hope you won, but if not, oh well.");
		
		
	}
}
