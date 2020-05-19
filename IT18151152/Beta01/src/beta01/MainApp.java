/**
 * 
 */
package beta01;

import java.util.ArrayList;

/**
 * @author oop17
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<IShow> list = new ArrayList<IShow>();
		
		Superman s = new Superman("Superman", "strong", null, "Tall");
		Batman b = new Batman("Batman", "None",null);
		
		Book b1 = new Book(01, "Book", "Jane");
		
	}

}
