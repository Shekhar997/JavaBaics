import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		
		for(int i = 0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		for (Integer integer : arr) {
			System.out.println(integer);
		}
		
		System.out.println("The size of the array is "+ arr.size());
		
		System.out.println(arr);
		
		List<String> strList = new ArrayList<>();
		
		//List is a parent and ArrayList is a child
		
		strList.add("Shekhar");
		strList.add("John");
		strList.add("David");
		strList.add("Jack");
		
		System.out.println(strList);
		
		for (String string : strList) {
			System.out.println(string);
			
		}
		
		Iterator iterator = strList.iterator();
		
		while (iterator.hasNext()) {
			String object = (String) iterator.next();
			System.out.println(object);
			
		}
		
		ArrayList<String> arr2 = new ArrayList<>();
		
		arr2.add("Shekhar");
		arr2.add("Manu");
		arr2.add("Papa");
		arr2.add("Mummy");
		arr2.add("Brio");
		arr2.add("Rapid");
		arr2.add("Ludhiana");
		arr2.add("Patiala");
		arr2.add("Rajasthan");
		arr2.add("Noida");
		
		System.out.println("*******************************");
		
		Iterator iterator2 = arr2.iterator();
		
		for (; iterator2.hasNext();) {
			String string = (String) iterator2.next();
			
			System.out.println(string);
			
		}
		
		System.out.println("*******************************");
		
		for(int i =0;i<arr2.size();i++) {
			System.out.println(arr2.get(i));
		}
		
		System.out.println("*******************************");
		
		ArrayList<Integer> arr3 = new ArrayList<>();
		
		arr3.add(1);
		arr3.add(2);
		arr3.add(3);
		arr3.add(4);
		arr3.add(5);
		arr3.add(6);
		arr3.add(7);
		arr3.add(8);
		arr3.add(9);
		arr3.add(10);
		
		arr3.remove(2);
		
		System.out.println(arr3);
		
		System.out.println("*******************************");
		
		arr3.remove(Integer.parseInt("1"));
		
		System.out.println(arr3);
	}

}
