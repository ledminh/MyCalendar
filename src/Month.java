import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;



/*
 * Month class: correspond to a specific month on calendar
 * Usage: store all days that have events scheduled on that month
 */
public class Month {
	private LocalDate date;
	private ArrayList<Day> dayList;
	
	
	/*
	 * Construct a Month object with no event scheduled
	 * @param d a Date object specified the first day of that month
	 */
	public Month(LocalDate d) {
		date = d;
		dayList = new ArrayList<Day>();
	}
	
	/*
	 * Add an event to that month
	 * @param e an Event object to be added
	 * @return true if adding success, false otherwise (when there is a 
	 *         conflict or the event is already scheduled in this month)
	 */
	public boolean addEvent(Event e) {
		LocalDate eventDate = e.getDate();
		
		Iterator<Day> it = dayList.iterator();
		int index = 0;
		
		while(it.hasNext()) {
			LocalDate currentDate = it.next().getDate();
			
			if(currentDate.isEqual(eventDate)) {
				dayList.get(index).addEvent(e);
			}
			else if(currentDate.isAfter(eventDate)) {
				Day day = new Day(eventDate);
				day.addEvent(e);				
				dayList.add(index, day);
			}
		}
		
		return true;
	}
}
