package Set;
import java.util.*;
public class TreeMapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> ar1=new TreeMap<Integer,String>();	
		ar1.put(6, "ooty");
		ar1.put(8, "munar");
		ar1.put(9, "valparai");
		ar1.put(5,"kodaikanal");
		
	System.out.println(ar1);
	//ar.clear();
	System.out.println(ar1);
	System.out.println(ar1.containsKey(8));
	System.out.println(ar1.keySet());
	System.out.println(ar1.containsValue("selenium"));
	System.out.println(ar1.values());
	System.out.println(ar1.entrySet());
	
	}
	

	}


