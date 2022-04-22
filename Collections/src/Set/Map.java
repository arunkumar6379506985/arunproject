package Set;

import java.util.HashMap;


public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> ar=new HashMap<>();	
		ar.put(6, "java");
		ar.put(8, "python");
		ar.put(9, "selenium");
		ar.put(null, "kumar");
		ar.put(null, "k");
	System.out.println(ar);
	//ar.clear();
	System.out.println(ar);
	System.out.println(ar.containsKey(8));
	System.out.println(ar.keySet());
	System.out.println(ar.containsValue("selenium"));
	System.out.println(ar.values());
	System.out.println(ar.entrySet());
	
	}
	



	

}
