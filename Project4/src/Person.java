
public class Person implements Comparable<Person> {
	
	private String firstName;
	private String lastName;
	private int idNumber;
	private String dateOfBirth;
	
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String name) 
	{
		firstName = name;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String name)
	{
		lastName = name;
	}
	public int getIdNumber()
	{
		return idNumber;
	}
	public void setIdNumber(int number)
	{
		idNumber = number;
	}
	public String getDateOfBirth()
	{
		return dateOfBirth;
	}
	public void setDateOfBirth(String date)
	{
		dateOfBirth = date;
	}
	
	public String toString()
	{
		return idNumber + " " + firstName + " " + lastName + " " + dateOfBirth;
	}
	
	public int compareTo(Person p) 
	{
		if (p.getIdNumber() == idNumber)
		{
			return 0;
		}
		else if (p.getIdNumber() < idNumber)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
	
}
