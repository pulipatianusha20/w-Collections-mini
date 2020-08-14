package wipro.w_collections_unique_sumbolSet;

public class Card implements Comparable<Card>{
	String sys;
	int num;
	Card(String sys,int num){
		this.sys=sys;
		this.num=num;
	}
	public int compareTo(Card obj){
	    if(sys.compareTo(obj.sys)<0)
	        return -1;
	    else if(sys.compareTo(obj.sys)>0)
	        return 1;
	    else 
	        return 0;
	        
	}
	
}