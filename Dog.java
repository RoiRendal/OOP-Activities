public class Dog
{
    String dogName;
    boolean male;
    Dog[] dogPuppies;
    int puppyNumber;

    public Dog()
	{
        dogPuppies = new Dog[10];
        puppyNumber = 0;
    }
    
    public void setName(String newName)
	{
        dogName = newName;
    }
    
    public String showName()
	{
        return dogName;
    }
    
    public void setMale(boolean isMale)
	{
        male = isMale;
    }
    
    public boolean isMale()
	{
        return male;
    }
    
    public void setPuppyNumber(int newPuppyNumber)
	{
        if (newPuppyNumber >= 0 && newPuppyNumber <= 10)
		{
            puppyNumber = newPuppyNumber;
        }
		else
		{
            System.out.println("Invalid puppy number. It should be between 0 and 10.");
        }
    }
    
    public int showPuppyNumber()
	{
        return puppyNumber;
    }
    
    public void newPuppy(Dog newPuppy)
	{
        if (puppyNumber < 10)
		{
            dogPuppies[puppyNumber] = newPuppy;
            puppyNumber++;
        }
		else
		{
            System.out.println("Too many puppies!");
        }
    }
    
    public void listPuppies()
	{
        for (int i = 0; i < puppyNumber; i++)
		{
            String puppyName = dogPuppies[i].showName();
            System.out.println("Puppy name is: " + puppyName);
        }
    }
    
    public void makeBark()
	{
        System.out.println("Woof! Woof!");
    }
}