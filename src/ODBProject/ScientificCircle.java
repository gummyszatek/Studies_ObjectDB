package ODBProject;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public final class ScientificCircle implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue
	private long id;
	
	private String Name;
	
	public ScientificCircle(String name)
	{
		Name = name;
	}
	
	public String DescribeCircle()
	{
		return Name;
	}
}
