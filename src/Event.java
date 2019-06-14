import java.time.LocalDate;

/*
 * Event class: correspond to a specific event.
 * Usage: store information of an event: name, date, time interval
 */


public class Event {
	
	private String name;
	private LocalDate date;
	private TimeInterval timeInterval;
	
	/*
	 * Construct an event
	 * @param n a string contains name of the event
	 * @param d a Date object that specified the date scheduled for the event.
	 * @param t a TimeInterval object specified the time interval of the event
	 */
	
	public Event(String n, LocalDate d, TimeInterval t) {
			name = n;
			date = d;
			timeInterval = t;
	}
	
	/*
	 * Check if this event is conflict with the event e (two TimeIntervals overlap)
	 * @param e an event to be checked for conflict
	 * @return true if two event are conflict, false otherwise
	 */
	public boolean isConflict(Event e) {
		return timeInterval.isOverlap(e.timeInterval);
	}
	
	/*
	 * Check if this event is scheduled after the event e.
	 * @param e an event to be checked.
	 * @return true if this event is after the event e, false otherwise
	 */
	public boolean isAfter(Event e) {
		return timeInterval.isAfter(e.timeInterval);		
	}
	
		
}
