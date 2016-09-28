import java.sql.Time;
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
		// Men
		malePeople.add(new Person("Mike", 22, 54, 70, "Brown", "Brown", "Mountains", "Outdoors", 0)); //0 
		malePeople.add(new Person("Jeff", 31, 68, 90, "Blonde", "Blue", "City", "Indoors", 0)); //1
		malePeople.add(new Person("Mark", 27, 70, 105, "Black", "Green", "Ocean", "Outdoors", 0)); //2
		malePeople.add(new Person("Rick", 42, 74, 122, "Brown", "Brown", "Countryside", "Indoors", 0)); //3
		malePeople.add(new Person("Steven", 36, 84, 60, "Red", "Blue", "Mountains", "Outdoors", 0)); //4
		
		// Women
		femalePeople.add(new Person("Katy", 25, 60, 115, "Brown", "Blue", "Mountains", "Outdoors", 0)); //0
		femalePeople.add(new Person("Abby", 31, 63, 106, "Blonde", "Green", "City", "Outdoors", 0)); //1
		femalePeople.add(new Person("Vanessa", 28, 54, 65, "Black", "Brown", "Ocean", "Outdoors", 0)); //2
		femalePeople.add(new Person("Sophie", 43, 72, 132, "Red", "Brown", "Ocean", "Outdoors", 0)); //3
		femalePeople.add(new Person("Claire", 33, 66, 95, "Blonde", "Blue", "Mountains", "Indoors", 0)); //4
			
		// Intro
//		System.out.println("Hello and welcome to the dating extravaganza!");
//		delay();
//		Scanner confirmation = new Scanner(System.in);
//		System.out.println("Are you at least 20 years of age?");
//		String confirmed = confirmation.nextLine();
//		if(confirmed.equals("Yes"))
//			{
//			System.out.println("Get ready to find your soul mate!");
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
			MaleMatchmaking();
			}
//		else if(gender.equals("Women"))
//			{
//			System.out.println("You are interested in women. Let's play!");
//			}
		}
		
	public static void MaleMatchmaking()
		{
		// Age
		Scanner userInput2 = new Scanner(System.in);
		System.out.println("What is the ideal age for a partner for you?");
		int age = userInput2.nextInt();
		if(age < 20)
			{
			System.out.println("Get off this program please.");
			}
		else if(age > 20 && age < 30)
			{
			malePeople.get(0).setMatches(malePeople.get(0).getMatches()+1);
			malePeople.get(2).setMatches(malePeople.get(2).getMatches()+1);
			}
		else if(age > 30 && age < 40)
			{
			malePeople.get(1).setMatches(malePeople.get(1).getMatches()+1);
			malePeople.get(4).setMatches(malePeople.get(4).getMatches()+1);
			}	
		else if(age > 40)
			{
			malePeople.get(3).setMatches(malePeople.get(3).getMatches()+1);
			}
		// Height
//		Scanner userInput3 = new Scanner(System.in);
//		System.out.println("What height would you like your partner to be?");
		
		// IQ
		Scanner userInput4 = new Scanner(System.in);
		System.out.println("What would you like your partner's IQ to be?");
		int IQ = userInput4.nextInt();
		if(IQ > 115)
			{
			malePeople.get(3).setMatches(malePeople.get(3).getMatches()+1);
			}
		else if(IQ > 85 && IQ < 115)
			{
			malePeople.get(1).setMatches(malePeople.get(1).getMatches()+1);
			malePeople.get(2).setMatches(malePeople.get(2).getMatches()+1);
			}
		else if(IQ < 85)
			{
			malePeople.get(0).setMatches(malePeople.get(0).getMatches()+1);
			malePeople.get(4).setMatches(malePeople.get(4).getMatches()+1);
			}
		
		// Hair Color
		Scanner userInput5 = new Scanner(System.in);
		System.out.println("Do you prefer brown, blonde, red, or black hair?");
		String hairColor = userInput5.nextLine();
		if(hairColor.equals("Brown"))
			{
			malePeople.get(0).setMatches(malePeople.get(0).getMatches()+1);
			malePeople.get(3).setMatches(malePeople.get(3).getMatches()+1);
			}
		else if(hairColor.equals("Blonde"))
			{
			malePeople.get(1).setMatches(malePeople.get(1).getMatches()+1);
			}
		else if(hairColor.equals("Red"))
			{
			malePeople.get(4).setMatches(malePeople.get(4).getMatches()+1);
			}
		else if(hairColor.equals("Black"))
			{
			malePeople.get(2).setMatches(malePeople.get(2).getMatches()+1);		
			}
		
		// Eye Color
		Scanner userInput6 = new Scanner(System.in);
		System.out.println("Do you prefer brown, blue, or green eyes?");
		String eyeColor = userInput6.nextLine();
		if(eyeColor.equals("Brown"))
			{
			malePeople.get(0).setMatches(malePeople.get(0).getMatches()+1);
			malePeople.get(3).setMatches(malePeople.get(3).getMatches()+1);
			}
		else if(eyeColor.equals("Blue"))
			{
			malePeople.get(1).setMatches(malePeople.get(1).getMatches()+1);
			malePeople.get(4).setMatches(malePeople.get(4).getMatches()+1);
			}
		else if(eyeColor.equals("Green"))
			{
			malePeople.get(2).setMatches(malePeople.get(2).getMatches()+1);
			}
		
		// Living Preference
		Scanner userInput7 = new Scanner(System.in);
		System.out.println("Would you rather live in the mountains, ocean, city, or countryside?");
		String livingPreference = userInput7.nextLine();
		if(livingPreference.equals("Mountains"))
			{
			malePeople.get(0).setMatches(malePeople.get(0).getMatches()+1);
			malePeople.get(4).setMatches(malePeople.get(4).getMatches()+1);
			}
		else if(livingPreference.equals("Ocean"))
			{
			malePeople.get(2).setMatches(malePeople.get(2).getMatches()+1);
			}
		else if(livingPreference.equals("City"))
			{
			malePeople.get(1).setMatches(malePeople.get(1).getMatches()+1);	
			}
		else if(livingPreference.equals("Countryside"))
			{
			malePeople.get(3).setMatches(malePeople.get(3).getMatches()+1);	
			}
		
		// Hobby Preference
		Scanner userInput8 = new Scanner(System.in);
		System.out.println("Would you rather do things indoors or outdoors?");
		String hobbyPreference = userInput8.nextLine();
		if(hobbyPreference.equals("Indoors"))
			{
			malePeople.get(1).setMatches(malePeople.get(1).getMatches()+1);
			malePeople.get(3).setMatches(malePeople.get(3).getMatches()+1);
			}
		else if(hobbyPreference.equals("Outdoors"))
			{
			malePeople.get(0).setMatches(malePeople.get(0).getMatches()+1);
			malePeople.get(2).setMatches(malePeople.get(2).getMatches()+1);
			malePeople.get(4).setMatches(malePeople.get(4).getMatches()+1);
			}
		
		// Matchmaking
		// Figure out how to traverse an arraylist and get greatest value
		}
	}
	






// WITH HEIGHT, HAVE USER INPUT SOMETHING LIKE 5'2" AND THEN CONVERT TO 62"