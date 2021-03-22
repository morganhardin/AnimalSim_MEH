/** This class is abstract so that
 * the Goldfinch and Brown Bear
 * classes can call its methods and 
 * use the protected variables in their
 * own classes.
 * 
 * @author morganhardin
 *
 */
public abstract class Animal 
{
	/** These protected variables are instantiated in
	 * the Animal class where they can be passed down 
	 * to the other classes that extend this class.
	 * 
	 */
	protected int simID;
	protected Location location;
	protected boolean full;
	protected boolean rested;
	
	/** This empty constructor class sets all of the
	 * protected variables equal to 0, true or false,
	 * or creates a new variation of location 
	 * equal to (0,0).
	 * 
	 */
	public Animal()
	{
		simID = 0;
		Location location = new Location(0,0);
		full = false;
		rested = true;
	}
	/** This preferred constructor sets the protected
	 * variables equal to the user inputed data that
	 * will then be passed down within this class
	 * and the extended classes.
	 * 
	 * @param simID
	 * @param l
	 */
	public Animal(int simID, Location l)
	{
		this.simID = simID;
		this.location = l;
		full = false;
		rested = true;
	}
	/** This eat method chooses a random double number
	 * between 0 and 1, determines if it is above or below
	 * 0.5, and then returns false if it is equal to 0.5
	 * or less than it and true if it is greater than 0.5.
	 * 
	 * @return
	 */
	public boolean eat()
	{
		if (Math.random() <= 0.5)
		{
			full = false;
		}
		else
		{
			full = true;
		}
		return full;
	}
	/** This sleep method chooses a random double number
	 * between 0 and 1, determines if it is above or below
	 * 0.5, and then returns false if it is equal to 0.5
	 * or less than it and true if it is greater than 0.5.
	 * 
	 * @return
	 */
	public boolean sleep()
	{
		if (Math.random() <= 0.5)
		{
			rested = false;
		}
		else
		{
			rested = true;
		}
		return rested;
	}
	/** This getter method returns simId.
	 * 
	 * @return
	 */
	public int getSimID() 
	{
		return simID;
	}
	/** This setter method uses a try catch block to 
	 * determine if simID is above or below 0. If it is
	 * above 0, the inputed value is now set equal to
	 * simID. If it is below 0, then 
	 * InvalidSimIDException is caught and thrown,
	 * printing out an error message of "Invalid Sim ID".
	 * 
	 * @param simID
	 */
	public void setSimID(int simID) 
	{
		try
		{
			this.simID = simID;
			
			if (simID <= 0)
			{
				throw new InvalidSimIDException("Invalid Sim ID");
			}
		}
		catch (InvalidSimIDException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	/** This getter method returns location.
	 * 
	 * @return
	 */
	public Location getLocation() 
	{
		return location;
	}
	/** The setter method takes the inputed location
	 * and sets it equal to location so it can be
	 * called by the getter method.
	 * 
	 * @param location
	 */
	public void setLocation(Location location) 
	{
		this.location = location;
	}
	/** This getter method returns the boolean 
	 * variable full. 
	 * 
	 */
	public boolean isFull() 
	{
		return full;
	}
	/** This setter method takes the inputed full
	 * variable and sets it equal to this full
	 * variable so that it can be called by the 
	 * getter method.
	 * 
	 * @param full
	 */
	public void setFull(boolean full) 
	{
		this.full = full;
	}
	/** This getter method returns the boolean
	 * variable rested.
	 * 
	 * @return
	 */
	public boolean isRested() 
	{
		return rested;
	}
	/** This setter method takes the inputed rested
	 * variable and sets it equal to this rested
	 * variable so that it can be called by the
	 * getter method.
	 * 
	 * @param rested
	 */
	public void setRested(boolean rested) 
	{
		this.rested = rested;
	}
}
