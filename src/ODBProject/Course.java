package ODBProject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public final class Course {

	@Id @GeneratedValue
	private long roomID;
	private static final long serialVersionUID = 1L;
	
	private String Name;
	private String Schedule;
	private String Room;
	
	public Course(String name, String schedule, String room)
	{
		Name = name;
		Schedule = schedule;
		Room = room;
	}
	
	public long getID()
	{
		return roomID;
		
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
