//Q3. Library Book System – Count Available Books
//Description:
// Define an interface LibraryOperations with addBook() and countAvailableBooks().
// Class Library should implement this.
//Book has title, author, and availability flag.
//Count how many books are currently available.
//Focus:
// Boolean condition and counting logic inside interface method.
import java.util.*;
interface LibraryOperation
{
	public void addBook();
	public void countAvailableBooks();
}
class Library
{
	private String title;
	private String author;
	private boolean Avb;
	
	public void setTitle(String title)
	{
		this.title=title;
	}
	public String getTitle()
	{
		return title;
	}
	public void setAuthor(String author)
	{
		this.author=author;
	}
	public String getAuthor()
	{
		return author;
	}
	public void setIsAvb(boolean Avb)
	{
		this.Avb=Avb;
	}
	public boolean getIsAvb()
	{
		return Avb;
	}
}
class LibraryInter implements LibraryOperation
{
	Scanner sc=new Scanner(System.in);
	Library []lb;
	int count =0;
	LibraryInter(int size)
	{
		lb=new Library[size];
	}
	
	public void addBook()
	{
	  if(count < lb.length)
	  {
		  System.out.println("Enter the bname , author , isAvb");
		  sc.next();
		  String author=sc.nextLine();
		  String name=sc.nextLine();
		  boolean avaliable=sc.nextBoolean();
			  lb[count]=new Library();
			  lb[count].setAuthor(author);
			  lb[count].setTitle(name);
			  lb[count].setIsAvb(avaliable);
			  
			  count++;
			  
			System.out.println("Book add Successfully !");
		  }
	  
	  else
	  {
		  System.out.println("Can not added employe");
	  }
	}
	public void countAvailableBooks()
	{
		int isAvb=0;
		for(int i=0;i<lb.length;i++)
		{
			if(lb[i].getIsAvb() == true)
			{
				isAvb++;
			}
				
		}
		System.out.println("total book avaliable is "+isAvb);
	}
}
public class LibraryInterface 
{   public static void main(String[] args)
	{
	LibraryInter li=new LibraryInter(2);
	Scanner sc=new Scanner(System.in);
	while(true)
	{
		System.out.println("-----------------------Meanu----------------------------");
		System.out.println("1.addBook");
		System.out.println("2.Count avaliable books");
		System.out.println("3.Exit");
		System.out.println("Enter your choice :");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			    li.addBook();
			    break;
		case 2:
			    li.countAvailableBooks();
			    break;
		case 3:
			   System.out.println("Exit");
			     return;
		 default :
			      System.out.println("Invalid choice");
		}
	}
	}
}
