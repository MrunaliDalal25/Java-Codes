package Collection;

import java.util.List;
import java.io.*;
import java.util.*;

public class ArrayList{

	public static void main(String[] args) {
		
		 List<String> list = new ArrayList<String> ();

		String str= "hi" ;

		list.add("string");

		list.add (str);

		list.add (str+ str);

		System.out.println (list.size());

		System.out.println (list.contains (42));

		System.out.println (list.contains ("hihi"));

		list.remove ("hi");

		System.out.println (list.size());

		list.add("hi");

		list.add(str);

		System.out.println (list.size());
	}

}

