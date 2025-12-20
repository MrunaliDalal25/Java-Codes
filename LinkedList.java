package Collection;
import java.util.*;
public class LinkedList {

	public static void main(String[] args) {
		List<String>list=new java.util.LinkedList<String>();
		list.add("Sharanya");
		list.add("Riddhi");
		list.add("Mrunali");
		list.add("Kashish");
		
		Iterator<String>itr=list.iterator();
		while(itr.hasNext());
		{
			System.out.println(itr.next());
		}
	}

}
