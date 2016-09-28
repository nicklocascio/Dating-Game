import java.util.ArrayList;
import java.util.Scanner;

public class Matchmaking
	{		
	static ArrayList <Person> malePeople = new ArrayList <Person>();
	static ArrayList <Person> femalePeople = new ArrayList <Person>();
	
	public static void MaleMatchmaking()
		{		
		malePeople.add(new Person("Mike", 22, 54, 70, "Brown", "Brown", "Mountains", "Outdoors", 0)); //0 
		malePeople.add(new Person("Jeff", 31, 68, 90, "Blonde", "Blue", "City", "Indoors", 0)); //1
		malePeople.add(new Person("Mark", 27, 70, 105, "Black", "Green", "Ocean", "Outdoors", 0)); //2
		malePeople.add(new Person("Rick", 42, 74, 122, "Brown", "Brown", "Countryside", "Indoors", 0)); //3
		malePeople.add(new Person("Steven", 36, 84, 60, "Red", "Blue", "Mountains", "Outdoors", 0)); //4
		
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
		if(malePeople.get(0).getMatches() > malePeople.get(1).getMatches() || 
		   malePeople.get(0).getMatches() > malePeople.get(2).getMatches() ||
		   malePeople.get(0).getMatches() > malePeople.get(3).getMatches() ||
		   malePeople.get(0).getMatches() > malePeople.get(4).getMatches())
			{
			System.out.println(malePeople.get(0).getName());
			}
		else if(malePeople.get(1).getMatches() > malePeople.get(0).getMatches() ||
				malePeople.get(1).getMatches() > malePeople.get(2).getMatches() ||
				malePeople.get(1).getMatches() > malePeople.get(3).getMatches() ||
				malePeople.get(1).getMatches() > malePeople.get(4).getMatches()) 
			{
			System.out.println(malePeople.get(1).getName());
			}
		else if(malePeople.get(2).getMatches() > malePeople.get(0).getMatches() ||
				malePeople.get(2).getMatches() > malePeople.get(1).getMatches() ||
				malePeople.get(2).getMatches() > malePeople.get(3).getMatches() ||
				malePeople.get(2).getMatches() > malePeople.get(4).getMatches())
			{
			System.out.println(malePeople.get(2).getName());
			}
		else if(malePeople.get(3).getMatches() > malePeople.get(0).getMatches() ||
				malePeople.get(3).getMatches() > malePeople.get(1).getMatches() ||
 				malePeople.get(3).getMatches() > malePeople.get(2).getMatches() ||
				malePeople.get(3).getMatches() > malePeople.get(4).getMatches())
			{
			System.out.println(malePeople.get(3).getName());
			}
		else if(malePeople.get(4).getMatches() > malePeople.get(0).getMatches() ||
				malePeople.get(4).getMatches() > malePeople.get(1).getMatches() ||
				malePeople.get(4).getMatches() > malePeople.get(2).getMatches() ||
				malePeople.get(4).getMatches() > malePeople.get(3).getMatches())
			{
			System.out.println(malePeople.get(4).getName());
			}
		}
	
	// FEMALE IS RIGHT HEREEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE
	
	public static void FemaleMatchmaking()
		{	
		femalePeople.add(new Person("Sophia", 22, 54, 70, "Brown", "Brown", "Mountains", "Outdoors", 0)); //0 
		femalePeople.add(new Person("Katie", 31, 68, 90, "Blonde", "Blue", "City", "Indoors", 0)); //1
		femalePeople.add(new Person("Stephanie", 27, 70, 105, "Black", "Green", "Ocean", "Outdoors", 0)); //2
		femalePeople.add(new Person("Claire", 42, 74, 122, "Brown", "Brown", "Countryside", "Indoors", 0)); //3
		femalePeople.add(new Person("Lily", 36, 84, 60, "Red", "Blue", "Mountains", "Outdoors", 0)); //4
		
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
			femalePeople.get(0).setMatches(femalePeople.get(0).getMatches()+1);
			femalePeople.get(2).setMatches(femalePeople.get(2).getMatches()+1);
			}
		else if(age > 30 && age < 40)
			{
			femalePeople.get(1).setMatches(femalePeople.get(1).getMatches()+1);
			femalePeople.get(4).setMatches(femalePeople.get(4).getMatches()+1);
			}	
		else if(age > 40)
			{
			femalePeople.get(3).setMatches(femalePeople.get(3).getMatches()+1);
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
			femalePeople.get(3).setMatches(femalePeople.get(3).getMatches()+1);
			}
		else if(IQ > 85 && IQ < 115)
			{
			femalePeople.get(1).setMatches(femalePeople.get(1).getMatches()+1);
			femalePeople.get(2).setMatches(femalePeople.get(2).getMatches()+1);
			}
		else if(IQ < 85)
			{
			femalePeople.get(0).setMatches(femalePeople.get(0).getMatches()+1);
			femalePeople.get(4).setMatches(femalePeople.get(4).getMatches()+1);
			}
		
		// Hair Color
		Scanner userInput5 = new Scanner(System.in);
		System.out.println("Do you prefer brown, blonde, red, or black hair?");
		String hairColor = userInput5.nextLine();
		if(hairColor.equals("Brown"))
			{
			femalePeople.get(0).setMatches(femalePeople.get(0).getMatches()+1);
			femalePeople.get(3).setMatches(femalePeople.get(3).getMatches()+1);
			}
		else if(hairColor.equals("Blonde"))
			{
			femalePeople.get(1).setMatches(femalePeople.get(1).getMatches()+1);
			}
		else if(hairColor.equals("Red"))
			{
			femalePeople.get(4).setMatches(femalePeople.get(4).getMatches()+1);
			}
		else if(hairColor.equals("Black"))
			{
			femalePeople.get(2).setMatches(femalePeople.get(2).getMatches()+1);		
			}
		
		// Eye Color
		Scanner userInput6 = new Scanner(System.in);
		System.out.println("Do you prefer brown, blue, or green eyes?");
		String eyeColor = userInput6.nextLine();
		if(eyeColor.equals("Brown"))
			{
			femalePeople.get(0).setMatches(femalePeople.get(0).getMatches()+1);
			femalePeople.get(3).setMatches(femalePeople.get(3).getMatches()+1);
			}
		else if(eyeColor.equals("Blue"))
			{
			femalePeople.get(1).setMatches(femalePeople.get(1).getMatches()+1);
			femalePeople.get(4).setMatches(femalePeople.get(4).getMatches()+1);
			}
		else if(eyeColor.equals("Green"))
			{
			femalePeople.get(2).setMatches(femalePeople.get(2).getMatches()+1);
			}
		
		// Living Preference
		Scanner userInput7 = new Scanner(System.in);
		System.out.println("Would you rather live in the mountains, ocean, city, or countryside?");
		String livingPreference = userInput7.nextLine();
		if(livingPreference.equals("Mountains"))
			{
			femalePeople.get(0).setMatches(femalePeople.get(0).getMatches()+1);
			femalePeople.get(4).setMatches(femalePeople.get(4).getMatches()+1);
			}
		else if(livingPreference.equals("Ocean"))
			{
			femalePeople.get(2).setMatches(femalePeople.get(2).getMatches()+1);
			}
		else if(livingPreference.equals("City"))
			{
			femalePeople.get(1).setMatches(femalePeople.get(1).getMatches()+1);	
			}
		else if(livingPreference.equals("Countryside"))
			{
			femalePeople.get(3).setMatches(femalePeople.get(3).getMatches()+1);	
			}
		
		// Hobby Preference
		Scanner userInput8 = new Scanner(System.in);
		System.out.println("Would you rather do things indoors or outdoors?");
		String hobbyPreference = userInput8.nextLine();
		if(hobbyPreference.equals("Indoors"))
			{
			femalePeople.get(1).setMatches(femalePeople.get(1).getMatches()+1);
			femalePeople.get(3).setMatches(femalePeople.get(3).getMatches()+1);
			}
		else if(hobbyPreference.equals("Outdoors"))
			{
			femalePeople.get(0).setMatches(femalePeople.get(0).getMatches()+1);
			femalePeople.get(2).setMatches(femalePeople.get(2).getMatches()+1);
			femalePeople.get(4).setMatches(femalePeople.get(4).getMatches()+1);
			}
		
		// Matchmaking
		if(femalePeople.get(0).getMatches() > femalePeople.get(1).getMatches() || 
			femalePeople.get(0).getMatches() > femalePeople.get(2).getMatches() ||
			femalePeople.get(0).getMatches() > femalePeople.get(3).getMatches() ||
			femalePeople.get(0).getMatches() > femalePeople.get(4).getMatches())
			{
			System.out.println(femalePeople.get(0).getName());
			}
		else if(femalePeople.get(1).getMatches() > femalePeople.get(0).getMatches() ||
				femalePeople.get(1).getMatches() > femalePeople.get(2).getMatches() ||
				femalePeople.get(1).getMatches() > femalePeople.get(3).getMatches() ||
				femalePeople.get(1).getMatches() > femalePeople.get(4).getMatches()) 
			{
			System.out.println(femalePeople.get(1).getName());
			}
		else if(femalePeople.get(2).getMatches() > femalePeople.get(0).getMatches() ||
				femalePeople.get(2).getMatches() > femalePeople.get(1).getMatches() ||
				femalePeople.get(2).getMatches() > femalePeople.get(3).getMatches() ||
				femalePeople.get(2).getMatches() > femalePeople.get(4).getMatches())
			{
			System.out.println(femalePeople.get(2).getName());
			}
		else if(femalePeople.get(3).getMatches() > femalePeople.get(0).getMatches() ||
				femalePeople.get(3).getMatches() > femalePeople.get(1).getMatches() ||
				femalePeople.get(3).getMatches() > femalePeople.get(2).getMatches() ||
				femalePeople.get(3).getMatches() > femalePeople.get(4).getMatches())
			{
			System.out.println(femalePeople.get(3).getName());
			}
		else if(femalePeople.get(4).getMatches() > femalePeople.get(0).getMatches() ||
				femalePeople.get(4).getMatches() > femalePeople.get(1).getMatches() ||
				femalePeople.get(4).getMatches() > femalePeople.get(2).getMatches() ||
				femalePeople.get(4).getMatches() > femalePeople.get(3).getMatches())
			{
			System.out.println(femalePeople.get(4).getName());
			}
		}
	}
