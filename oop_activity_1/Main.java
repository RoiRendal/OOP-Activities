public class Main
{
    public static void main(String[] args)
	{
        Dog myDog = new Dog();
        myDog.setName("Morris");
        myDog.setMale(true);
        
        Dog firstPuppy = new Dog();
        firstPuppy.setName("Gillian");
        firstPuppy.setMale(false);
        
        Dog secondPuppy = new Dog();
        secondPuppy.setName("Lazare");
        secondPuppy.setMale(true);
        
        Dog thirdPuppy = new Dog();
        thirdPuppy.setName("Raimund");
        thirdPuppy.setMale(true);

        Dog fourthPuppy = new Dog();
        fourthPuppy.setName("Wilfried");
        fourthPuppy.setMale(true);
        
        myDog.setPuppies(firstPuppy);
        myDog.setPuppies(secondPuppy);
        myDog.setPuppies(thirdPuppy);
        myDog.setPuppies(fourthPuppy);
        
        String dogName = myDog.showName();
        System.out.println("My dog is called: " + dogName);
        
        if (myDog.isMale())
		{
            System.out.println("My dog is a boy");
        }
		else
		{
            System.out.println("My dog is a girl");
        }
        
        int puppyCount = myDog.showNumberofPuppies();
        System.out.println("My dog has this many puppies: " + puppyCount);
        
        System.out.println("Here are the names of the puppies:");
        myDog.showPuppies();
        
        System.out.println("Now my dog will bark:");
        myDog.bark();
    }
}