package ODBProject;

import javax.persistence.Entity;

@Entity
public final class Student extends Person{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long AlbumID;
	private String Group;
	
	public Student(String name, String surname, int age, Faculty faculty, String group)
	{
		AlbumID = PersonOID;
		Name = name;
		Surname = surname;
		Age = age;
		Faculty = faculty;
		Group = group;
	}
	
	public void addCourse(Course c)
	{
		Courses.add(c);
	}
	
	public void addScientificCircle(ScientificCircle c)
	{
		ScientificCircles.add(c);
	}
	
	@Override
	protected void DescribeYourself() {
		System.out.print("\nStudent " + this.Name + " " + this.Surname +
				" AlbumID:" + this.AlbumID + ", Age "
				+ this.Age + " from Faculty " + this.Faculty + 
				" Group:" + this.Group + "attends for courses: ");
		
		for(int i = 0; i < Courses.size(); i++)
		{
			System.out.print(Courses.get(i));
			if(Courses.size() - 1 != i)
				System.out.print(", ");
			
			else
				System.out.print(". ");
		}
		
		if(ScientificCircles.size() > 0)
		{
			System.out.print("Student also attends for Scientific Circles: ");	
		
			for(int i = 0; i < ScientificCircles.size(); i++)
			{
				System.out.print(ScientificCircles.get(i));
				
				if(ScientificCircles.size() - 1 != i)
					System.out.print(", ");
				
				else
					System.out.print(". ");
			}
		}
		
	}
}
