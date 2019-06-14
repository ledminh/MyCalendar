	/*
	 * TimeInterval class: correspond to an interval in time.
	 * Usage: store duration of an event. 
	 */

	class TimeInterval {
		private int beginTime;
		private int endTime;
		
		private final int MAX_TIME = 24*60 - 1;
		private final int MIN_TIME = 0;
		
		/*
		 * Construct a time interval
		 * @param beginT a string contains begin time of the interval
		 * @param endT a string contains end time of the interval
		 * precondition: beginT and endT must follow the format: "hh:mm"
		 */
		public TimeInterval(String beginT, String endT) throws Exception {
			beginTime = toInt(beginT);
			endTime = toInt(endT);
			
			if(beginTime >= endTime || 
					beginTime == -1 || 
					endTime == -1 ) {
				throw new Exception("Invalid time interval! \n"
									+ "Start time must be earlier than finish time.");
			}
		}
		
			
		/*
		 * Check if it is overlap with the otherTI time interval
		 * @param otherTI a TimeInterval object, to be checked for overlap
		 * @return true if overlap, false otherwise.
		 */
		public boolean isOverlap(TimeInterval otherTI) {
			return !(otherTI.endTime  <= beginTime)            // -----not here----beginTime------------endTime--------------- 
						&& !(otherTI.beginTime >= endTime); 	  // -----------------beginTime------------endTime---not here----	
		}
		
		
		/*
		 * Check if this time interval is after the time interval otherTI 
		 * @param otherTI a TimeInterval object to be checked
		 * @return true if this time interval is after the time interval otherTI, false otherwise.
		 */
		public boolean isAfter(TimeInterval otherTI) {
			return beginTime >= otherTI.endTime;
		}
		
		
		/*
		 * Convert TimeInterval to string
		 * @return a string represents time interval in the format: "hh:mm"
		 */
		public String toString() {
			String beginHour = (beginTime/60 > 10)? "" + beginTime/60: "0" + beginTime/60,
				beginMin = (beginTime%60 > 10)? "" + beginTime%60: "0" + beginTime%60;
			
			String endHour = (endTime/60 > 10)? "" + endTime/60: "0" + endTime/60,
				endMin = (endTime%60 > 10)? "" + endTime%60: "0" + endTime%60;
						
			return beginHour + ":" + beginMin + " - " + endHour + ":" + endMin;
			
		}
		
	
		/*
		 * Convert the string specifies time in format hh:mm to int
		 * @param s String a string specifies time in format hh:mm
		 * @return int value of the time: number of minutes from midnight until that time. 
		 * 	       -1 if the value is out of range
		 */
		private int toInt(String s) {
			int result = 0;
			
			String [] aS =  s.split(":");
			
			result = Integer.parseInt(aS[0])*60 + Integer.parseInt(aS[1]);
			
			if(result < MIN_TIME || result > MAX_TIME) {
				result = -1;
			}
			
			return result;
		}
	}	