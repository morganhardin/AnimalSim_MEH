/** This class is a subclass of Animal
 * and can call its methods. It also implements
 * the walkable and swimmable interfaces, 
 * meaning it has their methods within this
 * class.
 * 
 * @author morganhardin
 *
 */
public class BrownBear extends Animal implements Walkable, Swimmable
{
	/** This private variable creates the
	 * subSpecies variable so that it can be
	 * used within this class.
	 * 
	 */
	private String subSpecies;
	
	/** The empty constructor calls the protected
	 * variables from the Animal class and sets
	 * them equal to 0, true or false, or a new
	 * variation of location (0,0). It also
	 * takes its own private variable subSpecies
	 * and sets it equal to Alaskan.
	 * 
	 */
	public BrownBear()
	{
		simID = 0;
		Location location = new Location(0,0);
		full = false;
		rested = true;
		subSpecies = "Alaskan";
	}
	/** The preferred constructor takes both the
	 * protected and private variables and sets them
	 * equal to the inputed variables or true and false.
	 * 
	 * @param simID
	 * @param l
	 * @param subSpecies
	 */
	public BrownBear(int simID, Location l, String subSpecies)
	{
		this.simID = simID;
		this.location = location;
		this.subSpecies = subSpecies;
		full = false;
		rested = true;
	}
	/** This walk method stems from the walkable
	 * interface and changes the coordinates
	 * based on what the user inputs to make the
	 * bear move in a certain direction.
	 * 
	 */
	public void walk(int direction)
	{
		Location myLocation = new Location();
		myLocation.update(6, 3);
		
		if (direction == -1)
		{
			myLocation.update(myLocation.getCoordinates()[0], myLocation.getCoordinates()[1] + 3);
			System.out.println("Walked North to: " + myLocation.toString());
		}
		else if (direction == 1)
		{
			myLocation.update(myLocation.getCoordinates()[0], myLocation.getCoordinates()[1] - 3);
			System.out.println("Walked South to: " + myLocation.toString());
		}
		else if (direction == -2)
		{
			myLocation.update(myLocation.getCoordinates()[0] + 3, myLocation.getCoordinates()[1]);
			System.out.println("Walked West to: " + myLocation);
		}
		else if (direction == 2)
		{
			myLocation.update(myLocation.getCoordinates()[0] - 3, myLocation.getCoordinates()[1]);
			System.out.println("Walked East to: " + myLocation);
		}
	}
	/** This swim method stems from the swimmable
	 * interface and changes the coordinates
	 * based on what direction the user inputs
	 * to make the bear swim in a certain direction.
	 * 
	 */
	public void swim(int direction)
	{
		Location myLocation = new Location();
		myLocation.update(6, 3);
		
		if (direction == -1)
		{
			myLocation.update(myLocation.getCoordinates()[0], myLocation.getCoordinates()[1] + 2);
			System.out.println("Walked North to: " + myLocation.toString());
		}
		else if (direction == 1)
		{
			myLocation.update(myLocation.getCoordinates()[0], myLocation.getCoordinates()[1] - 2);
			System.out.println("Walked South to: " + myLocation.toString());
		}
		else if (direction == -2)
		{
			myLocation.update(myLocation.getCoordinates()[0] + 2, myLocation.getCoordinates()[1]);
			System.out.println("Walked West to: " + myLocation);
		}
		else if (direction == 2)
		{
			myLocation.update(myLocation.getCoordinates()[0] - 2, myLocation.getCoordinates()[1]);
			System.out.println("Walked East to: " + myLocation);
		}
	}
	/** This getter method returns the bear's
	 * subSpecies.
	 * 
	 * @return
	 */
	public String getSubSpecies() 
	{
		return subSpecies;
	}
	/** This setter method has a try catch block
	 * that takes the user input and determines if 
	 * it is equal to a certain type of bear. If the
	 * input is equal to the strings in the if statement,
	 * then subSpecies will be equal to that string that
	 * was inputed. If not, an InvalidSubspeciesException
	 * is caught and thrown, printing out "Invalid
	 * Species".
	 * 
	 * @param subSpecies
	 */
	public void setSubSpecies(String subSpecies) 
	{
		try
		{
			this.subSpecies = subSpecies;
			
			if (subSpecies.equals("Alaskan") || subSpecies.equals("Asiatic") || subSpecies.equals("European") || subSpecies.equals("Grizzly") || subSpecies.equals("Kodiak") || subSpecies.equals("Siberian"))
			{
				this.subSpecies = subSpecies;
			}
			else
			{
				throw new InvalidSubspeciesException("Invalid Species");
			}
		}
		catch (InvalidSubspeciesException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}
