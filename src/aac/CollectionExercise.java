package aac;

import java.util.ArrayList;

public class CollectionExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4,5,5,5,9,6,6,8,4};
		//Print unique number from list
		//create empty arraylist
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			int k=0;
			
			if(!al.contains(a[i])) {
				al.add(a[i]);
				k++;
				
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						k++;
						
					}
					
				}
				System.out.println(a[i]+"->"+k);
				if(k==1) {
					System.out.println(a[i]+ "is a unique number");
					System.out.println("These are the changes for git");
				}
			}
			
			
		}
		
		
		
		

	}

}
