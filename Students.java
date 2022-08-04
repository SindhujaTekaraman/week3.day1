package week3.day1;

public class Students 
{
	//To create Method - getStudentInfo() with multiple argument combinations
	public void getStudentInfo(String id)
	{
		System.out.println("Student ID: " + id);
	}
	public void getStudentInfo(String id, String name)
	{
		System.out.println("Student ID: " + id);
		System.out.println("Student Name: " + name);
	}
	public void getStudentInfo(String email, long phoneNumber)
	{
		System.out.println("Student email: " + email);
		System.out.println("Student Phone Number: " + phoneNumber);
	}

	public static void main(String[] args) 
	{
		//Object creation
		Students objStudent = new Students();

		//To call the Method - getStudentInfo() by passing values for all argument combinations
		objStudent.getStudentInfo("BK2789234511");
		objStudent.getStudentInfo("BK2789234511", "Sindhu");
		objStudent.getStudentInfo("sindhu.r@gmail.com", 7728046177l);
	}
}
