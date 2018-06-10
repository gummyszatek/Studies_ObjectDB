package ODBProject;

public final class Course {

	private String Name;
	private String Schedule;
	private String Room;
	
	public Course(String name, String schedule, String room)
	{
		Name = name;
		Schedule = schedule;
		Room = room;
	}
	
	public Course()
	{
		Name = "Empty";
		Schedule = "Empty";
		Room = "Empty";
	}
	
	public void DescribeCourse()
	{
		System.out.print("Course: " + this.Name + " \nSchedule: " + this.Schedule + "\nRoom: " + this.Room);
	}
	
}
