import java.util.*;
import java.util.List;
public class Coll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> Lst= new ArrayList();
		Lst.add("arun");
		Lst.add("hari");
		Lst.add("vignesh");
	//	Lst.add(1.56);
		//System.out.println("is empty    "+Lst.isEmpty());
		//System.out.println(Lst);
		//System.out.println("size   "+Lst.size());
		//System.out.println("clear   "+Lst.remove(0));
		//System.out.println(Lst.contains(Lst));
		System.out.println(Lst.equals(Lst));
		System.out.println(Lst.getClass());
		System.out.println(Lst.indexOf(5));
		System.out.println("get    "+Lst.get(2));
		System.out.println(Lst.addAll(2, Lst));
		System.out.println("Intex     "+Lst.indexOf(Lst));
		System.out.println(Lst.remove(2));
		for(String a:Lst) {
		System.out.println(a);
		System.out.println(Lst.set(2, a));
		System.out.println(Lst.lastIndexOf(0));
		
		String a1="kumar";
		System.out.println(Lst.set(0, a1));
		//Iteration<String>1Lst=Lst.listIterator();
		//while(1Lst.hasNext()) {
		System.out.println(1L);
		}
		}
	

	private static Object next() {
		// TODO Auto-generated method stub
		return null;
	}

}
