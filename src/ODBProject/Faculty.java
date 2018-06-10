package ODBProject;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Faculty implements Serializable {
	
	@Id @GeneratedValue
	private long id;
	private static final long serialVersionUID = 1L;
	private String Name;
	
	Faculty(String name)
	{
		Name = name;
	}
	
	public String DescribeFaculty()
	{
		return Name;
	}
}
