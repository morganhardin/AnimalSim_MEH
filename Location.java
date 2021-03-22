import java.util.*;

public class Location 
{
	/** This private variables are instantiated
	 * here so that they can be used and called
	 * upon within this class.
	 * 
	 */
	private int xCoord;
	private int yCoord;
	
	/** This empty constructor class sets the 
	 * private variables equal to 0 to 
	 * instantiate them.
	 * 
	 */
	public Location()
	{
		xCoord = 0;
		yCoord = 0;
	}
	/** This preferred constructor sets the inputed
	 * x and y variables equal to xCoord and yCoord.
	 * 
	 * @param x
	 * @param y
	 */
	public Location(int x, int y)
	{
		xCoord = x;
		yCoord = y;
	}
	/** This update method takes inputed values
	 * and sets them equal to 0 in order to update
	 * the coordinates. It also has a try catch
	 * block that throws an InvalidCoordinateException
	 * if x or y is less than 0. If either is a 
	 * negative number, an error message of
	 * "Invalid Coordinates" will be printed.
	 * 
	 * @param x
	 * @param y
	 */
	public void update(int x, int y)
	{
		try
		{
			xCoord = x;
			yCoord = y;
			
			if (x < 0 || y < 0)
			{
				throw new InvalidCoordinateException("Invalid Coordinates");
			}
		}
		catch (InvalidCoordinateException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	/** This method creates an array of two variables,
	 * xCoord and yCoord, that creates and returns
	 * the coordinates.
	 * 
	 * @return
	 */
	public int[] getCoordinates()
	{
		int[] coordinates = {xCoord, yCoord};
		return coordinates;
	}
	/** This toString method takes the array in the 
	 * getCoordinates method and makes it a string
	 * so that it can be called upon and returned
	 * in other classes.
	 * 
	 */
	@Override
	public String toString() 
	{
		return "Coordinates: " + Arrays.toString(getCoordinates());
	}
}
