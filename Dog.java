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
    
    public void setNumberofPuppies(int newPuppyNumber)
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
    
    public int showNumberofPuppies()
	{
        return puppyNumber;
    }
    
    public void setPuppies(Dog setPuppies)
	{
        if (puppyNumber < 10)
		{
            dogPuppies[puppyNumber] = setPuppies;
            puppyNumber++;
        }
		else
		{
            System.out.println("Too many puppies!");
        }
    }
    
    public void showPuppies()
	{
        for (int i = 0; i < puppyNumber; i++)
		{
            String puppyName = dogPuppies[i].showName();
            System.out.println("Puppy name is: " + puppyName + " (");
            if (dogPuppies[i].isMale())
            {
                System.out.println("Male)");
            }
            else
            {
                System.out.println("Female)");
            }
        }
    }
    
    public void bark()
	{
        System.out.println("Woof! Woof!");
    }
}