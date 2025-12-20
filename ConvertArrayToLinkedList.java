package Collection;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.List;

public class ConvertArrayToLinkedList {

	public static void main(String[] args) {
		
      String[] array= {"Sahil","Vaibhav","Akash","Mayank"};
      System.out.println(Arrays.toString(array));
		
		List<String> list = new ArrayList<String>();
		for(String name : array)
		{
			list.add(name);
			Iterator<String> itr = list.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		}
	}
}