
public class Student extends Person {
	
	private String collegeName;
	
	public void setCollegeName(String name)
	{
		collegeName = name;
	}
	public String getCollegeName()
	{
		return collegeName;
	}
	
	public String toString()
	{
		return super.toString() + " [" + collegeName + "]";
	}
}
