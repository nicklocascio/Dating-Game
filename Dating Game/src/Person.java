public class Person
	{
	private String name;
	private int age;
	private int height;
	private int IQ;
	private String hairColor;
	private String eyeColor;
	private String livingPreference;
	private String favoriteHobby;
	private int matches;
	
	public Person(String aa, int a, int b, int c, String d, String e, String f, String g, int h)
		{
		name = aa;
		age = a;
		height = b;
		IQ = c;
		hairColor = d;
		eyeColor = e;
		livingPreference = f;
		favoriteHobby = g;
		}

	public String getName()
		{
		return name;
		}

	public void setName(String name)
		{
		this.name = name;
		}
	
	public int getAge()
		{
		return age;
		}

	public void setAge(int age)
		{
		this.age = age;
		}

	public int getHeight()
		{
		return height;
		}

	public void setHeight(int height)
		{
		this.height = height;
		}

	public int getIQ()
		{
		return IQ;
		}

	public void setIQ(int iQ)
		{
		IQ = iQ;
		}

	public String getHairColor()
		{
		return hairColor;
		}

	public void setHairColor(String hairColor)
		{
		this.hairColor = hairColor;
		}

	public String getEyeColor()
		{
		return eyeColor;
		}

	public void setEyeColor(String eyeColor)
		{
		this.eyeColor = eyeColor;
		}

	public String getLivingPreference()
		{
		return livingPreference;
		}

	public void setLivingPreference(String livingPreference)
		{
		this.livingPreference = livingPreference;
		}

	public String getFavoriteHobby()
		{
		return favoriteHobby;
		}

	public void setFavoriteHobby(String favoriteHobby)
		{
		this.favoriteHobby = favoriteHobby;
		}
	
	public int getMatches()
		{
			return matches;
		}

	public void setMatches(int matches)
		{
			this.matches = matches;
		}
	
	}



