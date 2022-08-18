package org.zsgs1;

class StudentsDetails
{
	String studentName;
	static String teacherName;
	public  void  getDetails()
	{
		System.out.println("Student Name:"+studentName);
		System.out.println("Teacher Name:"+teacherName);
		System.out.println();
		
	}
	public StudentsDetails(String sName,String tName)
	{
		this.studentName=sName;
		teacherName=tName;
		
	}
}
public class Program_8{

	
	
	public static void main(String[] args) {

		StudentsDetails std1=new StudentsDetails("steve","jack");
		StudentsDetails std2=new StudentsDetails("tek","jack");
		StudentsDetails std3=new StudentsDetails("jerry","jack");
		std1.getDetails();
		std2.getDetails();
		std3.getDetails();
		/*The teacher name is declared static variable if we change it one place all the
		 * positions it changed
		*/
		StudentsDetails.teacherName="jone";
		std1.getDetails();
		std2.getDetails();
		std3.getDetails();
		
		//Don't create object to static variable And method
		//static method belong to the class
		//all the objects shared the static variable of class
	    //We cannot directly call non static global variable and method into the static field
		
		//we call the static method or variable in other class with that class name
		
	    StudentsDetails.teacherName="jecop";
	    
	    
		
		

	}

}
