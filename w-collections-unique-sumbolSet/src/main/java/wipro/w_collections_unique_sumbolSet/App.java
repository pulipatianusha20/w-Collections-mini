package wipro.w_collections_unique_sumbolSet;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

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
        Set<Card> ts=new TreeSet<Card>(); 
        boolean t=false;
        int count=0;
        while(t!=true) {
        	System.out.println("Enter a Card:");
        	String sys=sc.next();
        	int n=sc.nextInt();
        	Card c=new Card(sys,n);
        	count++;
        	ts.add(c);
        	if(ts.size()==4)
        		t=true;
        }
        System.out.println("Four cards gathered in "+count+" cards");
		Iterator it=ts.iterator();
        System.out.println("Cards in a Set are :");
        while(it.hasNext()) {
        	Card ct=(Card)it.next();
        	System.out.println(ct.sys+" "+ct.num);
        }
    }
}
