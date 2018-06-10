package ODBProject;

import javax.persistence.Entity;

@Entity
public final class Worker extends Person {

	private static final long serialVersionUID = 1L;
	private long WorkerID;
	private int Salary;
	
	public Worker(String name, String surname, int age, Faculty faculty, int salary)
	{
		Name = name;
		WorkerID = PersonOID;
		Surname = surname;
		Age = age;
		Faculty = faculty;
		Salary = salary;
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
		System.out.print("\nWorker " + this.Name + " " + this.Surname +
				" WorkerID:" + this.WorkerID + ", Age "
				+ this.Age + " from Faculty " + this.Faculty + 
				" with Salary:" + this.Salary + " teaches: ");
		
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
			System.out.print("Worker also take part in Scientific Circles: ");	
		
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
	
