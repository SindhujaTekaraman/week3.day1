package week3.day1;

public class Automation extends MultipleLanguage
{
	//To implement the method - selenium() from Interface - TestTool
		public void selenium() 
		{
			System.out.println("Implemented method from Interface - TestTool");
		}
		//To implement the method - java() from Interface - Language
		public void java() 
		{
			System.out.println("Implemented method from Interface - Language");		
		}

		//To implement the abstract method - ruby() from Abstract Class - MultipleLanguage
		public void ruby() 
		{
			System.out.println("Implemented Abstract Class unimplemented method - ruby()");
		}

		public static void main(String[] args)
		{
			//Object creation
			Automation objAutomation = new Automation();
			
			//To call methods from Class - Automation
			objAutomation.selenium();
			objAutomation.java();
			objAutomation.ruby();
			
			//To call method from Abstract Class - MultipleLanguage
			objAutomation.python();
		}
	}
