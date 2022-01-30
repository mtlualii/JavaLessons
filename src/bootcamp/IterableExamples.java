package bootcamp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterableExamples {
	
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,1,1));
		list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,1,1));
		list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,1,1,1));
		
		/*
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) %2 != 0 ) {
				list.remove(i);
			}
		}
		*/
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			
			if(it.next() % 2 !=0) {
				it.remove();
			}
			
		}
		
		
		
		System.out.println(list);
		
		
	}
	

}
