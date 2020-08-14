package wipro.w_StringOperations;

import java.util.ArrayList;
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
    	Scanner sc=new Scanner(System.in);
        ArrayList<String> a=new ArrayList<String>();
        int n;
        do {
        	System.out.println("1.Insert\n2.Search\n3.Delete\n4.Display\n5.Exit");
        	System.out.println("Enter your choice");
        	 n=sc.nextInt();
        	 switch(n) {
        	 case 1: System.out.println("Enter item to be inserted");
        	 		String ele=sc.next();
        	 		a.add(ele);
        	 		break;
        	 case 2:System.out.println("Enter item to be search");
        	 		String s=sc.next();
        	 		if(a.contains(s))
        	 				System.out.println("Item  found in the list");
        	 		else
        	 			System.out.println("Item  not found in the list");
        	 		break;
        	 case 3:System.out.println("Enter item to be deleted");		
        	 		String d=sc.next();
        	 		if(a.contains(d)) {
        	 			a.remove(d);
        	 			System.out.println("Item Deleted Sucessfully");
        	 			}
        	 		else
        	 			System.out.println("Item does not exist");
        	 		break;
        	 case 4 :System.out.println("The Items in the list are :");
        	 			Iterator it=a.iterator();
        	 			while(it.hasNext()) {
        	 				System.out.println(it.next());
        	 			}
        	 			System.out.println();
        	 			break;
        	 case 5:System.exit(0);		
        	 	break;
        	 default :System.out.println("Invalid choice");
        	 			break;
        	 }
        }while(n!=5);
        
    }
}
