package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Set {

	//public static HashSet<String> hsr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs =new HashSet<String>();
		System.out.println("is empty"+hs.isEmpty());
		hs.add("pollachi");
		hs.add("bangalore");
		hs.add("coimbatore");
		Iterator<String> ite = hs.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		hs.remove("bangalore");
	
		Iterator<String> ite1 = hs.iterator();
		while(ite1.hasNext()) {
			System.out.println(ite1.next());
		}
	
	
		LinkedHashSet<String> hs1 =new LinkedHashSet<String>();
		System.out.println("is empty"+hs1.isEmpty());
		hs1.add("java");
		hs1.add("c");
		hs1.add("c++");
		Iterator<String> ite11 = hs1.iterator();
		while(ite11.hasNext()) {
			System.out.println(ite11.next());
		}
		
		
		LinkedHashSet<Float> ns =new LinkedHashSet<Float>();
		System.out.println("is empty"+ns.isEmpty());
		ns.add(5.6f);
		ns.add(10.7f);
		ns.add(15.8f);
		Iterator<Float> num = ns.iterator();
		while(num.hasNext()) {
			System.out.println(num.next());
		}
	
	
	
	
	
	}

}
