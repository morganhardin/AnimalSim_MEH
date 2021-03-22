/** This class is an interface that allows
 * the Goldfinch and Brown Bear classes
 * to implement it.
 * 
 * @author morganhardin
 *
 */
public interface Walkable 
{
	/** This method is empty so that it 
	 * can be implemented in other 
	 * classes and have different 
	 * uses based on what class
	 * it is used within.
	 * 
	 * @param direction
	 */
	public void walk(int direction);
}
