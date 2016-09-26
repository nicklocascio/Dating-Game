import java.sql.Time;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonRunner
	{
	static ArrayList <Person> person = new ArrayList <Person>();
	
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
		person.add(new Person("Mike", 22, 54, 70, "Brown", "Brown", "Mountains", "Outdoors"));
		person.add(new Person("Jeff", 31, 68, 90, "Blonde", "Blue", "City", "Indoors"));
		person.add(new Person("Mark", 27, 70, 105, "Black", "Green", "Ocean", "Outdoors"));
		person.add(new Person("Rick", 42, 74, 122, "Brown", "Brown", "Countryside", "Indoors"));
		person.add(new Person("Steven", 36, 84, 60, "Blonde", "Blue", "Mountains", "Outdoors"));
		
		// Women
		person.add(new Person("Katy", 25, 60, 115, "Brown", "Blue", "Mountains", "Outdoors"));
		person.add(new Person("Abby", 31, 63, 106, "Blonde", "Green", "City", "Outdoors"));
		person.add(new Person("Vanessa", 64, 54, 65, "Black", "Brown", "Ocean", "Outdoors"));
		person.add(new Person("Sophie", 56, 54, 132, "Red", "Brown", "Ocean", "Outdoors"));
		person.add(new Person("Claire", 72, 54, 95, "Blonde", "Blue", "Mountains", "Indoors"));
		
		// Intro
		System.out.println("Hello and welcome to the dating extravaganza! Get ready to find your soul mate!");
		delay();
		Scanner userInput = new Scanner(System.in);
		
		// Gender
		System.out.println("Are you interested in men or women?");
		String gender = userInput.nextLine();
		if(gender.equals("Men"))
			{
			System.out.println("You are interested in men. Let's play!");
			}
		else if(gender.equals("Women"))
			{
			System.out.println("You are interested in women. Let's play!");
			}
		
		//Age
		Scanner userInput2 = new Scanner(System.in);
		
		}
	}






// WITH HEIGHT, HAVE USER INPUT SOMETHING LIKE 5'2" AND THEN CONVERT TO 62"