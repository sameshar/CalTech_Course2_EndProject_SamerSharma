package bean;

public class Batch {
	String bId;
	String weekday;
	String time;
	public String getbId() {
		return bId;
	}
	public void setbId(String i) {
		this.bId = i;
	}
	
////not in Akash's code
//	@Override
//    public String toString() {
//        return weekday; // Return the name or any meaningful value here
//    }

	public String getWeekday() {
		return weekday;
	}
	public void setWeekday(String weekday) {
		this.weekday = weekday;
	}
	

	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
//constructors
	public Batch(String bId, String weekday, String time) {
		super();
		this.bId = bId;
		this.weekday = weekday;
		this.time = time;
	}
	public Batch() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
}
