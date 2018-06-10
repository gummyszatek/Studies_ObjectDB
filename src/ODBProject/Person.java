/**
 * 
 */
package ODBProject;
import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * @author Andrzej S.
 *
 */

@Entity
public abstract class Person implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue
	protected long PersonOID;
	
	protected String Name;
	protected String Surname;
	protected int Age;
	protected Faculty Faculty;
	protected List<Course> Courses;
	protected List<ScientificCircle> ScientificCircles;
	
	protected abstract void DescribeYourself();
	
}
