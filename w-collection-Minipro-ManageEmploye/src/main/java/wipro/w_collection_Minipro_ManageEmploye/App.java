package wipro.w_collection_Minipro_ManageEmploye;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
    	
    	System.out.println("Enter number of Employess");
    	int n=sc.nextInt();
    	ArrayList<Employee> a=new ArrayList<Employee>(n);
        for(int i=0;i<n;i++) {
        	
        	System.out.println("Enter Employee "+(i+1)+" Detals");
        	System.out.println("Enter First Name");
        	String f=sc.next();
        	System.out.println("Enter Second Name");
        	String l=sc.next();
        	System.out.println("Enter mobile number");
        	String m=sc.next();
        	System.out.println("Enter email");
        	String e=sc.next();
        	System.out.println("Enter address");
        	String ad=sc.next();
        	Employee employee=new Employee(f,l,m,e,ad);
        	a.add(employee);
        }
        System.out.println("employee Details:");
        System.out.printf("%-15s%-15s%-15s%-30s%-15s","First Name","Last Name","Mobile","Email","Address"); 
        System.out.println();
        
        Iterator it=a.iterator();
        while(it.hasNext()) {
        	
        	Employee empl=(Employee)it.next();
        	
        	System.out.printf("%-15s%-15s%-15s%-30s%-15s",empl.fname,empl.lname,empl.mob,empl.em,empl.add);
        	System.out.println();
        }
    
    }
}
