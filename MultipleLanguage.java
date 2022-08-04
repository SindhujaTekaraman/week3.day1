package week3.day1;

public abstract class MultipleLanguage implements Language, TestTool
{
	public void python()
	{
		System.out.println("Implemented Abstract Class method - python()");
	}
	//To create an unimplemented abstract method
	public abstract void ruby();
}
