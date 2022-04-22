package Set;


import java.util.LinkedHashMap;

public class LinkedHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String> arun=new LinkedHashMap<>();	
		arun.put(6, "java");
		arun.put(8, "python");
		arun.put(9, "selenium");
		arun.put(null, "c");
		arun.put(null, "c++");
	System.out.println(arun);
	//ar.clear();
	System.out.println(arun);
	System.out.println(arun.containsKey(8));
	System.out.println(arun.keySet());
	System.out.println(arun.containsValue("selenium"));
	System.out.println(arun.values());
	System.out.println(arun.entrySet());
	
	}
	


	}


