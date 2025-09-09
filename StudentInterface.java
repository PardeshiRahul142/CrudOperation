//Q2. Student Record System – Search Operation via Interface
//Description:
// Create interface StudentOperations with methods addStudent() and 
// searchStudentByRollNo(int rollNo). Implement in class StudentManager.
//Store student roll number and name.
//
//Allow search by roll number.
//Focus:
// Interface method with parameter, logical search using loop.
import java.util.*;
interface Student
{
	public void addStudent();
	public void SearchStudent(int rollNo);
}
class StudInfoGet
{
	private int rollNo;
	private String name;
	public StudInfoGet(int r,String n)
	{
		this.rollNo=r;
		this.name=n;
	}
	public int getRollNo()
	{
		return rollNo;
	}
	public String getName()
	{
		return name;
	}
}
class StudentManager implements Student
{
	
	StudInfoGet []st;
	int count=0;
	 StudentManager(int size)
	{
	  st=new StudInfoGet[size];
	}
	 
	public void addStudent()
	{
		Scanner sc=new Scanner(System.in);
		if(count<st.length)
		{
			System.out.println("Enter the student roll , name");
			int roll=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			
			st[count]=new StudInfoGet(roll,name);
			count++;
			System.out.println("add student successfully ");
		}
		else
		{
			System.out.println("Not add Student ");
		}
	}
	public void SearchStudent(int Eroll)
	{
	    boolean isFound=false;
	    for(int i=0;i<st.length;i++)
	    {
	        if(st[i].getRollNo()==Eroll)
	        {
	      	  System.out.println("Roll :"+st[i].getRollNo() +" "+"Name :"+st[i].getName());
	      	   isFound=true;
		        break;
	        }
	       
     	}
	    if(!isFound)
	    {
	    	  System.out.println("RollNo not found");
	    }
     }
}
public class StudentInterface 
{   public static void main(String[] args) 
	{
	StudentManager stdm=new StudentManager(2);
	Scanner sc=new Scanner(System.in);
	
	while(true)
	{
		System.out.println("--------------------Meanu---------------------");
		System.out.println("case 1.Add student ");
		System.out.println("case 2.Search Student ");
		System.out.println("case 3.exit");
		System.out.println("Enter the your choice :");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:  stdm.addStudent();
		         break;
		         
		case 2:
			    System.out.println("Enter roll number");
	            int r=sc.nextInt();
			    stdm.SearchStudent(r);
			    break;
		case 3:
			   System.out.println("Existing :");
			   return;
	    default :
	    	          System.out.println("Choice miss match");
		}
	}
	
	
	}

}
