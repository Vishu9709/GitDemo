package aac;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class HashTablExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
				
				Hashtable<Integer,String> hm=new Hashtable<Integer,String>();
				hm.put(0, "Hello");
				hm.put(1, "Bye");
				hm.put(2, "Morning");
				hm.put(3, "evening");   //key value can be string also
				
				//System.out.println(hm.get(2));
			
				Set	sn=hm.entrySet(); //it will make it set
				Iterator it=  sn.iterator();
				while(it.hasNext()) {
				
					Map.Entry mp=(Map.Entry)it.next();  ///it will seperate key and value
					System.out.println(mp.getKey());
					System.out.println(mp.getValue());
				}
				
				
			

			}

		}
	
		
	