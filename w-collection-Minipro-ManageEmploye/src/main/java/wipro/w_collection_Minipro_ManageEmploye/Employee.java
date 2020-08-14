package wipro.w_collection_Minipro_ManageEmploye;



public class Employee implements Comparable<Employee> {
	String fname;
	String lname;
	String mob;
	String em;
	String add;
	Employee(String fname,String lname,String mob,String em,String add){
		this.fname=fname;
		this.lname=lname;
		this.mob=mob;
		this.em=em;
		this.add=add;
	}
	public int compareTo(Employee obj){
	    if(fname.compareTo(obj.fname)<0)
	        return -1;
	    else if(fname.compareTo(obj.fname)>0)
	        return 1;
	    else 
	        return 0;
	        
	}
	
    public String toString() {
		return fname+" "+lname+" "+mob+" "+em+" "+add;
	}
	
}
