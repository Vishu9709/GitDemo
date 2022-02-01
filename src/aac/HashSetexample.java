package aac;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Hashset,treeset,Linkeed Hashset implements set interface
		//doesnot not accept duplicate values
		// There is no guarantee elements stored in sequence
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("USA");
		hs.add("Uk");
		hs.add("USA");
		hs.add("INDIA");
		hs.add("abc");
		hs.add("ytu");
		System.out.println(hs);
		System.out.println(hs.size());
		
		//Iterator
	Iterator<String> i= hs.iterator();
	while(i.hasNext()) {
	
	System.out.println(i.next());
	
	}
		
	}

}
