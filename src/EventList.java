import java.util.ArrayList;
import java.util.Iterator;

/*
 * EventList class: A list of events
 */
public class EventList {
	
	private ArrayList<Event> eventList;
	
	/*
	 * Construct an empty EvenList
	 */
	public EventList() {
		eventList = new ArrayList<Event>();
	}
	
	/*
	 * Add an event to the list
	 * @param e an event object to be added to the list
	 * @return true if adding success. False if adding not success because there is a conflict 
	 * between the event e and existing events on the list
	 * postcondition: the list is in chronological order
	 */
	public boolean add(Event e) {
		Iterator<Event> it = eventList.iterator();
		int i = 0;
		
		while(it.hasNext()) {
			Event currentE = it.next();
			if(currentE.isConflict(e)) {
				return false;
			}
			else if(currentE.isAfter(e)) {
				eventList.add(i, e);
				return true;
			}
			
			i++;
		}
		
		eventList.add(e);
		
		return true;
		
	}
	
	
	/*
	 * Return the earliest event then remove it from the list
	 * @return an event that is at the top of the list (the earliest event on the list)
	 * postcondition: the event returned is removed from the list
	 */
	public Event pop(){
		Event event = eventList.get(0);
		
		eventList.remove(0);
		
		return event;
	}
	
	/*
	 * Remove the event at index i from the list
	 * @param i int the index of the event that will be removed from the list
	 */
	public void remove(int i) {
		eventList.remove(i);
	}
	
	
}
