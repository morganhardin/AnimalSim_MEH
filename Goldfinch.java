/** This class is a subclass of Animal where
 * it can call its variables and methods. It 
 * also implements the Flyable and Walkable
 * classes, having their methods within this
 * class.
 * 
 * @author morganhardin
 *
 */
public class Goldfinch extends Animal implements Flyable, Walkable
{
	/** This private variable is created
	 * here so that it can be used and
	 * called upon within this class.
	 * 
	 */
	private double wingSpan;
	
	/** This empty constructor uses Animal's
	 * protected variables and sets them equal to
	 * 0, true or false, and has a new variation of
	 * location (0,0). It also has its own 
	 * private variable wingSpan set equal to 9.0.
	 * 
	 */
	public Goldfinch()
	{
		simID = 0;
		Location location = new Location(0,0);
		full = false;
		rested = true;
		wingSpan = 9.0;
	}
	/** This preferred constructor takes the
	 * protected and private variables and sets
	 * them equal to the inputed values, and 
	 * true or false.
	 * 
	 * @param simID
	 * @param l
	 * @param ws
	 */
	public Goldfinch(int simID, Location l, double ws)
	{
		this.simID = simID;
		this.location = l;
		this.wingSpan = ws;
		full = false;
		rested = true;
	}
	/** This fly method stems from the Flyable
	 * interface and sets location equal to the 
	 * coordinates inputed. It then prints out
	 * the new coordinates that the Goldfinch
	 * flew to.
	 * 
	 */
	public void fly(Location l)
	{
		this.location = l;
		System.out.println("Flew to " + location);
	}
	/** This walk method stems from the Walkable
	 * interface and changes the coordinates
	 * based on what the user inputs to make the
	 * Goldfinch move in a certain direction.
	 * 
	 */
	public void walk(int direction)
	{
		Location myLocation = new Location();
		myLocation.update(6, 3);
		
		if (direction == 1)
		{
			myLocation.update(myLocation.getCoordinates()[0], myLocation.getCoordinates()[1] + 1);
			System.out.println("Walked North to: " + myLocation.toString());
		}
		else if (direction == -1)
		{
			myLocation.update(myLocation.getCoordinates()[0], myLocation.getCoordinates()[1] -1);
			System.out.println("Walked South to: " + myLocation.toString());
		}
		else if (direction == -2)
		{
			myLocation.update(myLocation.getCoordinates()[0] + 1, myLocation.getCoordinates()[1]);
			System.out.println("Walked West to: " + myLocation);
		}
		else if (direction == 2)
		{
			myLocation.update(myLocation.getCoordinates()[0] -1, myLocation.getCoordinates()[1]);
			System.out.println("Walked East to: " + myLocation);
		}
	}
	/** This getter method returns wingSpan.
	 * 
	 * @return
	 */
	public double getWingSpan() 
	{
		return wingSpan;
	}
	/** This setter method sets the user input equal
	 * to wingSpan if it is in between 5.0 and 11.0.
	 * If the inputed value is greater than 11 or 
	 * less than 5, an InvalidWingspanException
	 * will be caught and thrown and will print
	 * out the message "Invalid Wing Span".
	 * 
	 * @param wingSpan
	 */
	public void setWingSpan(double wingSpan) 
	{
		try
		{
			this.wingSpan = wingSpan;
			
			if (wingSpan > 11.0 || wingSpan < 5.0)
			{
				throw new InvalidWingspanException("Invalid Wingspan");
			}
		}
		catch (InvalidWingspanException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}
