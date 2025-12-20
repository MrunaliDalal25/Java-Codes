package Collection;
import java.util.Map.Entry;

import java.util.Map;

public class HashMap {

	public static void main(String[] args) {
		
			HashMap<Integer,String> map = new HashMap<Integer,String>();
			map.put(1, "Pranali");
			map.put(2, "Priya");
			map.put(3, "Nikita");
			map.put(4, "Sayali");
			
			for(Map.Entry m : map.entrySet())
			{
				System.out.println(m.getKey()+ " " +m.getValue());
			}
	}
}