/** This class is a user created
 * exception that extends the
 * Exception class.
 * 
 * @author morganhardin
 *
 */
public class InvalidCoordinateException extends Exception
{
	/** This method allows other classes to
	 * call this exception and input their
	 * own message.
	 * 
	 * @param message
	 */
	public InvalidCoordinateException(String message)
	{
		/** This calls the exception class and
		 * takes the inputed message into
		 * the class to be called and printed.
		 * 
		 */
		super(message);
	}
}
