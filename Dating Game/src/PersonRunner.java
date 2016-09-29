import java.util.ArrayList;
import java.util.Scanner;

public class PersonRunner
	{
	static ArrayList <Person> malePeople = new ArrayList <Person>();
	static ArrayList <Person> femalePeople = new ArrayList <Person>();
	
	public static void delay()
		{
		try
			{
			Thread.sleep(2000);
			} 
		catch (InterruptedException e)
			{
			e.printStackTrace();
			}
		}
	
	public static void main(String[] args)
		{			
		// Intro
//		System.out.println("Hello and welcome to the dating extravaganza!");
//		delay();
//		Scanner confirmation = new Scanner(System.in);
//		System.out.println("Are you at least 20 years of age?");
//		String confirmed = confirmation.nextLine();
//		if(confirmed.equals("Yes"))
//			{
//			System.out.println("Get ready to find your soul mate!");
//			delay();
//			}
//		else if(confirmed.equals("No"))
//			{
//			System.out.println("Bye bye!");
//			}
		
		// Gender
		Scanner userInput = new Scanner(System.in);
		System.out.println("Are you interested in men or women?");
		String gender = userInput.nextLine();
		if(gender.equals("Men"))
			{
			System.out.println("You are interested in men. Let's play!");
			Matchmaking.MaleMatchmaking();
			}
		else if(gender.equals("Women"))
			{
			System.out.println("You are interested in women. Let's play!");
			Matchmaking.FemaleMatchmaking();
			}
		}
	}
	






// WITH HEIGHT, HAVE USER INPUT SOMETHING LIKE 5'2" AND THEN CONVERT TO 62"