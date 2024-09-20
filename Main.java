public class Main
{
    public static void main(String[] args)
	{
        Dog myDog = new Dog();
        myDog.setName("Morris");
        myDog.setMale(true);
        
        Dog firstPuppy = new Dog();
        firstPuppy.setName("Gillian");
        
        Dog secondPuppy = new Dog();
        secondPuppy.setName("Lazare");
        
        Dog thirdPuppy = new Dog();
        thirdPuppy.setName("Raimund");

        Dog fourthPuppy = new Dog();
        fourthPuppy.setName("Wilfried");
        
        myDog.newPuppy(firstPuppy);
        myDog.newPuppy(secondPuppy);
        myDog.newPuppy(thirdPuppy);
        myDog.newPuppy(fourthPuppy);
        
        String dogName = myDog.showName();
        System.out.println("My dog is called: " + dogName);
        
        boolean isItMale = myDog.isMale();
        if (isItMale)
		{
            System.out.println("My dog is a boy");
        }
		else
		{
            System.out.println("My dog is a girl");
        }
        
        int puppyCount = myDog.showPuppyNumber();
        System.out.println("My dog has this many puppies: " + puppyCount);
        
        System.out.println("Here are the names of the puppies:");
        myDog.listPuppies();
        
        System.out.println("Now my dog will bark:");
        myDog.makeBark();
    }
}