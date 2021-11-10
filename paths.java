import java.util.Scanner;
 
public class paths {
	
	static public boolean cont = true;
	static int count;
	static Scanner input = new Scanner(System.in);
	int shrekHealth = 10;
	static int weaponDamage = (int)(Math.random()*10 +1);
	
	//Enemy path
	public static void leftPath() {
		System.out.println("You walk down the path to your left...");
		System.out.println("You come upon a large beast! It seems to be a some kind of Ogre.");
		System.out.println("It seems your only option is to attack! All you have is a rather unpredicatable blade...");
		System.out.println("");
		System.out.println("You slashed at the ogre, doing" + weaponDamage + "damage.");
		
		//loss if damage is less than ogre health (10)
		if(weaponDamage < 10) {
			System.out.println("You didn't defeat the ogre and he destroyed you...");
			System.out.println("");
			System.out.println("");
			System.out.println(" .88888.                                   .88888.                             ");
			System.out.println("d8'   `88                                 d8'   `8b                            ");
			System.out.println("88        .d8888b. 88d8b.d8b. .d8888b.    88     88 dP   .dP .d8888b. 88d888b. ");
			System.out.println("88   YP88 88'  `88 88'`88'`88 88ooood8    88     88 88   d8' 88ooood8 88'  `88 ");
			System.out.println("Y8.   .88 88.  .88 88  88  88 88.  ...    Y8.   .8P 88 .88'  88.  ... 88       ");
			System.out.println(" `88888'  `88888P8 dP  dP  dP `88888P'     `8888P'  8888P'   `88888P' dP       ");
			System.out.println("ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
			System.out.println("");
			System.out.println("");
			System.out.println("Restart the program if you would like to try again");
			
			System.exit(0);
		}
		
		//
		else if(weaponDamage >= 10) {
			System.out.println("The ogre has been vanquished! Now you can continue on");
			System.out.println("");
			System.out.println("As you continue you see a light ahead, and rush towards it. You are free!");
			System.out.println("");
			System.out.println("");
			System.out.println("dP    dP                      dP   dP   dP oo          dP ");
			System.out.println("Y8.  .8P                      88   88   88             88 ");
			System.out.println(" Y8aa8P  .d8888b. dP    dP    88  .8P  .8P dP 88d888b. 88 ");
			System.out.println("   88    88'  `88 88    88    88  d8'  d8' 88 88'  `88 dP ");
			System.out.println("   88    88.  .88 88.  .88    88.d8P8.d8P  88 88    88    ");
			System.out.println("   dP    `88888P' `88888P'    8888' Y88'   dP dP    dP oo ");
			System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
			System.out.println("");
			System.out.println("");
			System.out.println("I hope you have enjoyed this game. The program will now terminate");
			
			System.exit(0);
			
		}
		
	}
	
	//Center path (inevitable death)
	public static void rightPath() {
		
		//runs code so long as user wants to continue going (infinite loop til death)
		while(cont == true) {
		System.out.println("You walk down the path in front of you. It seems to go on for a long time. Will you still continue?");
		String userCont = input.nextLine();
		
		//If user has repeatedly gone down tunnel 10 times, code will run
		if(count == 10) {
			System.out.println("You really wasted your time on this tunnel? I admire your dedication,");
			System.out.println("it is too bad you spent the rest of your life looking for an exit that will never come...");
			System.out.println("");
			System.out.println("");
			System.out.println(" .88888.                                   .88888.                             ");
			System.out.println("d8'   `88                                 d8'   `8b                            ");
			System.out.println("88        .d8888b. 88d8b.d8b. .d8888b.    88     88 dP   .dP .d8888b. 88d888b. ");
			System.out.println("88   YP88 88'  `88 88'`88'`88 88ooood8    88     88 88   d8' 88ooood8 88'  `88 ");
			System.out.println("Y8.   .88 88.  .88 88  88  88 88.  ...    Y8.   .8P 88 .88'  88.  ... 88       ");
			System.out.println(" `88888'  `88888P8 dP  dP  dP `88888P'     `8888P'  8888P'   `88888P' dP       ");
			System.out.println("ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
			System.out.println("");
			System.out.println("");
			System.out.println("Restart the program if you would like to try again");
		
		
		}
		
		//checks if user wants to continue, if so, count simply increases 
		//and code should loop again
		if(userCont.equals("Yes") || userCont.equals("yes")) {
			count++;
			System.out.println("You proceed further...");
		}
		
		//ATTEMPT to leave tunnel
		else if(userCont.equals("No") || userCont.equals("no")) {
			System.out.println("");
			System.out.println("You give up and turn back, only to realize the way back has been blocked off");
			System.out.println("Distraught, you wither away hopelessly for the rest of your days. Get rekt.");
			System.out.println("");
			System.out.println("");
			System.out.println(" .88888.                                   .88888.                             ");
			System.out.println("d8'   `88                                 d8'   `8b                            ");
			System.out.println("88        .d8888b. 88d8b.d8b. .d8888b.    88     88 dP   .dP .d8888b. 88d888b. ");
			System.out.println("88   YP88 88'  `88 88'`88'`88 88ooood8    88     88 88   d8' 88ooood8 88'  `88 ");
			System.out.println("Y8.   .88 88.  .88 88  88  88 88.  ...    Y8.   .8P 88 .88'  88.  ... 88       ");
			System.out.println(" `88888'  `88888P8 dP  dP  dP `88888P'     `8888P'  8888P'   `88888P' dP       ");
			System.out.println("ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
			System.out.println("");
			System.out.println("");
			System.out.println("Restart the program if you would like to try again");
			
			System.exit(0);
			
			
			}
		}
	}
}

