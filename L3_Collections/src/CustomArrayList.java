import java.util.ArrayList;
import java.util.Iterator;

public class CustomArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Student> arrList = new ArrayList<>();
		
		Student s;
		
		for(int i = 0;i<10;i++) {
			
			int[] marks = {10,20,30,40,50};
			
			s= new Student(i,""+i,marks) ;
			arrList.add(s);
		}
		
		Iterator iterator = arrList.iterator();
		
		for(;iterator.hasNext();) {
			Student student = (Student) iterator.next();
			
			
			System.out.println(student);
			
		}
		
	}

}
