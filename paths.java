import java.util.Scanner;

public class paths {
	
	//win condition for later
	public boolean win;
	static public boolean cont = true;
	static int count;
	static Scanner input = new Scanner(System.in);
	
	public static void leftPath() {
		System.out.println("You walk down the path");
	}
	
	public static void straightPath() {
		
		//runs code so long as user wants to continue going (infinite loop til death)
		while(cont == true) {
		System.out.println("You walk down the path in front of you. It seems to go on for a long time. Will you continue?");
		String userCont = input.nextLine();
		
		//If user has repeatedly gone down tunnel 10 times, code will run
		if(count == 10) {
		System.out.println("You really wasted your time on this tunnel? I admire your dedication,");
		System.out.println("it is too bad you spent the rest of your life looking for an exit that will never come");
		}
		
		//checks if user wants to continue
		if(userCont.equals("Yes") || userCont.equals("yes")) {
			count++;
		}
		else if(userCont.equals("No") || userCont.equals("no")) {
			System.out.println("You give up and turn back, only to realize how far you've gone.");
			System.out.println(" You spend the rest of your days wandering aimlessly.");
			System.out.println("");
			System.out.println("[insert game over screen here]");
		}
		
		}
	}
	
	public static void rightPath() {
		
	}
}
