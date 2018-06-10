package ODBProject;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public final class ScientificCircle implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue
	private long circleID;
	
	private String Name;
	
	public ScientificCircle(String name)
	{
		Name = name;
	}
	
	public long getID()
	{
		return circleID;
	}
	
	public String DescribeCircle()
	{
		return Name;
	}
}
