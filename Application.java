public class Application 
{
	public static void main(String[] args) throws InvalidCoordinateException, InvalidSimIDException, InvalidWingspanException, InvalidSubspeciesException
	{
		/** These create new instances of 
		 * the Location, Goldfinch, and 
		 * Brown Bear class within memory
		 * so that their methods can be
		 * called and used within this
		 * application class.
		 * 
		 */
		Location myLocation = new Location();
		Goldfinch myGoldfinch = new Goldfinch();
		BrownBear myBrownBear = new BrownBear();
		/** Animal myAnimal = new Animal();
		 * 	Error since abstract class
		 * cannot be instantiated.
		 */
		
		/** This first section prints the Code List
		 * for the walk method to change the 
		 * coordinates by walking or swimming
		 * north, south, east, or west.
		 * 
		 */
		System.out.println("*********************************************\n\t     Code List to Move\n*********************************************");
		System.out.println("Enter -1 to go South\nEnter 1 to go North\nEnter -2 to go West\nEnter 2 to go East");
		
		/** This prints the coordinates and calls the
		 * getCoordinates method using the toString
		 * method from the Location class.
		 * It also prints the invalid coordinates exception.
		 * 
		 */
		System.out.println("*********************************************\n\t      Location Tests\n*********************************************");
		myLocation.update(6, 5);
		System.out.println(myLocation.toString() + "\n");
		myLocation.update(-1, 0);
		
		/** This animal header has nothing
		 * printed within it because the Animal
		 * class is abstract, meaning it cannot
		 * be instantiated and a new instance of
		 * it cannot be created.
		 * 
		 */
		System.out.println("*********************************************\n\t       Animal Tests\n*********************************************");
		
		/** This Goldfinch section begins by printing
		 * the sim ID, updating the coordinates, 
		 * calling the getCoordinates method within
		 * the toString method, and printing the
		 * wingspan. It also calls the eat and sleep
		 * method in the Animal class to print
		 * true or false. This also shows the walk
		 * and fly methods being called using each direction.
		 * It also has the invalid sim ID exception and
		 * the invalid wingspan exception.
		 * 
		 */
		System.out.println("*********************************************\n\t      Goldfinch Tests\n*********************************************");
		myGoldfinch.setSimID(1);
		System.out.println("Sim ID: " + myGoldfinch.getSimID());
		myLocation.update(4, 8);
		System.out.println(myLocation.toString());
		myGoldfinch.setWingSpan(9.6);
		System.out.println("Wing Span: " + myGoldfinch.getWingSpan());
		System.out.println("Full: " + myGoldfinch.eat());
		System.out.println("Rested: " + myGoldfinch.sleep());
		
		System.out.println();
		myGoldfinch.setSimID(0);
		myGoldfinch.setWingSpan(4.7);
		System.out.println();
		
		myLocation.update(6,3);
		System.out.println(myLocation.toString());
		myGoldfinch.walk(-1);;
		myGoldfinch.walk(1);
		myGoldfinch.walk(-2);
		myGoldfinch.walk(2);
		
		myLocation.update(9,2);
		System.out.println();
		myGoldfinch.fly(myLocation);
		
		/** This Brown Bear section begins by printing
		 * the sim ID, updating the coordinates, 
		 * calling the getCoordinates method within
		 * the toString method, and printing the
		 * subSpecies. It also calls the eat and sleep
		 * method in the Animal class to print
		 * true or false. This also shows the walk
		 * and swim methods being called using each direction.
		 * It also has the invalid sim ID exception and
		 * the invalid subSpecies exception.
		 * 
		 */
		System.out.println("*********************************************\n\t     Brown Bear Tests\n*********************************************");
		myBrownBear.setSimID(2);
		System.out.println("Sim ID: " + myBrownBear.getSimID());
		myLocation.update(8, 3);
		System.out.println(myLocation.toString());
		myBrownBear.setSubSpecies("Asiatic");
		System.out.println("Subspecies: " + myBrownBear.getSubSpecies());
		System.out.println("Full: " + myBrownBear.eat());
		System.out.println("Rested: " + myBrownBear.sleep());
		
		System.out.println();
		myLocation.update(6,3);
		System.out.println(myLocation.toString());
		myBrownBear.walk(-1);;
		myBrownBear.walk(1);
		myBrownBear.walk(-2);
		myBrownBear.walk(2);
		
		System.out.println();
		myLocation.update(6,3);
		System.out.println(myLocation.toString());
		myBrownBear.swim(-1);;
		myBrownBear.swim(1);
		myBrownBear.swim(-2);
		myBrownBear.swim(2);
		
		System.out.println();
		myBrownBear.setSubSpecies("Polar");
		
		System.out.println("*********************************************");
		
	}
}
