import java.time.LocalDate;

/*
 * Day class: correspond to a specific day on calendar.
 * Usage: store a date and events scheduled on that date
 */

public class Day {
	private LocalDate date;
	private EventList eventList;
	
	
	/*
	 * Construct a Day object with an empty EventList
	 * @param d a LocalDate object specified the Day's date
	 */
	public Day(LocalDate d) {
		date = d;
		eventList = new EventList();
	}
	
	/*
	 * Add an event to that month
	 * @param e an Event object to be added
	 * @return  true if adding success, false otherwise 
	 * 		    (when there is a conflict or the event is 
	 * 		    already scheduled in this day)
	 */
	public boolean addEvent(Event e) {
		return eventList.add(e);
		
	}
}
