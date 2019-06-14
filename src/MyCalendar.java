/* MyCalendar: a simple calendar app written in Java and
 * running in console.
 *   
 * @author: Minh Le
 * @version: 1.0  06/13/2019
 * 
 */


/*
 * The main system that controls all processes of the program
 */

public class MyCalendar {
	public static String INPUT_FILE = "events.txt";
	public static String OUTPUT_FILE = "output.txt";
	
	private MonthTree monthTree;
	private InOut inOut;
	private StateMachine stateMachine;
	
	/*
	 * Construct a new MyCalendar system
	 */
	public MyCalendar() {
		
	}

	/*
	 * Run the system
	 */
	public void run() {
		
	}
	
	/*
	 *  Load all events from INPUT_FILE to monthTree
	 *  @return true if loading successful, false otherwise
	 */	
	private boolean load() {
		return true;
	}
	
	/*
	 * Export all events from monthTree to OUTPUT_FILE
	 * @return true if exporting successful, false otherwise
	 */
	private boolean export() {
		return true;
	}
	
}
