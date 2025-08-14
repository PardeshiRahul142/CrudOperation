//Q2. Write a java program to create pojo class name as Employee with a following properties like as id, name, email, salary to perform 
//		Case 1: Add 5 Records Of Employee.
//		Case 2: Display All Employee Details.
//		Case 3: Update Employee Record By Name.
//		Case 4: Delete Employee Record By salary.
//		Case 5: Search Employee Record By Id.
//
package m.d;
import java.util.*;
class EmpInfo
{
	private int  id;
	private String name;
	private String email;
	private int salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

}
public class EmployeeCase {

	public static void main(String[] args) {
		 EmpInfo e[]=new EmpInfo[2];
		do
		{
		   Scanner sc=new Scanner(System.in);
		   
		   System.out.println("1. Add records");
		   System.out.println("2. display recoreds ");
		   System.out.println("3. Update Employee Record By Name");
		   System.out.println("4. Delete Employee Record By salary.");
		   System.out.println("5. Search Employee Record By Id.");
		   System.out.println("6. Exit");
		   int choice =sc.nextInt();
		  switch(choice)
		  {
		    case 1:  
		    	       for(int i=0;i<e.length;i++)
		    	       {
		    	    	     e[i]=new EmpInfo();
		    	    	     System.out.println("id, name, email, salary ");
		    	    	     int id=sc.nextInt();
		    	    	     sc.nextLine();
		    	    	     String name=sc.nextLine();
		    	    	     String email=sc.nextLine();
		    	    	     int salary=sc.nextInt();
		    	    	     
		    	    	     e[i].setId(id);
		    	    	     e[i].setName(name);
		    	    	     e[i].setEmail(email);
		    	    	     e[i].setSalary(salary);
	  
		    	        }
		    	       System.out.println("Recoed inserted Successfully ! ");
		    	         break;
		    case 2: 
		            	System.out.println("---------------------------------");
		         	System.out.println("id\tname\temail\tsalary");
		         	System.out.println("---------------------------------");
		    	       
		    	       for(int i=0;i<e.length;i++)
		    	       { 
		    	    	      if(e[i].getId() != -1)
		    	    	      {
				          System.out.println(e[i].getId()+"\t"+e[i].getName()+"\t"+e[i].getEmail()+"\t"+e[i].getSalary());
		  			   }   
		    	       }
		    	       System.out.println("---------------------------------");
		    	           break;
		    	           
		    case 3:
		    	 
		    	      System.out.println("Enter name where record update :");
		    	      sc.nextLine();
		    	      String name=sc.nextLine();
		    	      boolean isUpadated =false;
		    	        for(int i=0;i<e.length;i++)
		    	        { 
		    	        	   if(e[i].getName().equalsIgnoreCase(name) )
		    	        	   {
		    	        		   System.out.println("id, name, email, salary ");
				    	    	     int id=sc.nextInt();
				    	    	     sc.nextLine();
				    	    	     String n=sc.nextLine();
				    	    	     String email=sc.nextLine();
				    	    	     int salary=sc.nextInt();
				    	    	     
				    	    	     e[i].setId(id);
				    	    	     e[i].setName(n);
				    	    	     e[i].setEmail(email);
				    	    	     e[i].setSalary(salary);
				    	    	     isUpadated=true;
		    	        	   }
		    	        	   if(isUpadated)
		    	        	   {
		    	        		   System.out.println("record updated !");
		    	        		   break;
		    	        	   }
		    	        	   
		    	        }
		    	        if(!isUpadated)
	    	        	    {
	    	        		   System.out.println("Not record found !");
	    	        		 }
		    	            break;
		    case 4:
		    	         
		   
	    	      System.out.println("Enter salary where record delete :");
	    	       int sal=sc.nextInt();
	    	       boolean isDeleted =false;
	    	       for(int i=0;i<e.length;i++)
	    	        {  
	    	        	  if(e[i].getSalary() == sal )
	    	        	   {
	    	        		  isDeleted=true;
	    	        		  e[i].setId(-1);
	    	           }
	    	        	   if(isDeleted)
	    	        	   {
	    	        		   System.out.println("Record deleted !");
	    	        		   break;
	    	        	   }
	    	        	   
	    	           }
	    	        if(!isDeleted)
  	        	    {
  	        		   System.out.println("Not record found !");
                }
		    	          break;
		    	        
		    case 5: 
		    	       System.out.println("Enter the id for Search Employee Record");
		    	       int id=sc.nextInt();
		    	       boolean flag=false;
		    	       for(int i=0;i<e.length;i++)
		    	       {
		    	       if(e[i].getId() == id)
		    	       {
		    	    	     flag=true;
		    	    	   System.out.println("id :"+ e[i].getId()+" "+"name :"+ e[i].getName() +"  "+ "email :"+e[i].getEmail()+"  "+"salary :"+e[i].getSalary());
		    	       }
		    	       }
		    	       if(!flag)
		    	       {
		    	    	   System.out.println("Invalid id ");
		    	       }
		    	           break;
		    	 
		    case 6:
		    	         sc.close();
		    	          break;
		    	          
		    	default :
		    		     System.out.println("choice miss match:");
		    	             break;    	       
		  }
 		  }while(true);
   }
}



