import java.util.HashMap;
import java.util.Map;

public class StudentHashMapMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, Student> hmStd = new HashMap<>();
		
		String[] name = {"Shekhar","Manu","Mummy", "Papa"};
		Student stu;
		/*for(int i = 0;i<4;i++) {
			stu = new Student(i,name[i]);
			
			hmStd.put(stu.id, stu);
		}
		
		for(Map.Entry entry : hmStd.entrySet()) {
			System.out.println(" id is "+entry.getKey()+" Student object is "+ entry.getValue());
		}*/
		
		HashMap<Student, Integer> percentHm = new HashMap<>();
		
		for(int i = 0;i<4;i++) {
			stu = new Student(i,name[i]);
			
			percentHm.put(stu, i+20);
			
			stu = new Student(i,name[i]);
			percentHm.put(stu, i+30);
			
		}
		
		for(Student std : percentHm.keySet()) {
			System.out.println(" id is "+std+" Student object is "+percentHm.get(std));
		}
		
	}

}
