import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(1, "Java");
		hm.put(2, "PHP");
		hm.put(3, ".Net");
		hm.put(4, "Node Js");
		hm.put(5, "Ruby");
		hm.put(6, "Python");
		
		for (Integer temp : hm.keySet()) {
			System.out.println("Key is : "+temp+" Value is "+hm.get(temp));
		}
		
		System.out.println("********************************");
		
		for (Map.Entry entry : hm.entrySet()) {
			Integer key = (Integer) entry.getKey();
			String val = (String) entry.getValue();
			
			System.out.println("Key is : "+key+" Value is "+val)	;
			
		}
		
		LinkedHashMap<String, Integer> hmNw = new LinkedHashMap<>();
		
		hmNw.put("Student1", 10);
		hmNw.put("Student2", 20);
		hmNw.put("Student3", 30);
		hmNw.put("Student4", 40);
		hmNw.put("Student5", 50);
		
		System.out.println(hmNw);
		
		
		for(Map.Entry entry : hmNw.entrySet()) {
			System.out.println("Name is "+entry.getKey() + " marks are "+entry.getValue());
		}
		
	}

}
