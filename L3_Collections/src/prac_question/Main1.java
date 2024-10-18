package prac_question;
import java.util.LinkedList;;

public class Main1 {
	
	public static void main(String[] args) {
		
		LinkedList<Student> ll = new LinkedList<>();
		
		Student stuTemp;
		for(int i = 0;i<10;i++) {
			stuTemp = new Student(i,"Name = "+i,getMarks());
			
			ll.add(stuTemp);
		}
		
		for(int i = 0;i<ll.size();i++) {
			int sum = 0;
			
			stuTemp = ll.get(i);
			
			for(int j = 0;j<stuTemp.marks.length;j++) {
				
				int marks = stuTemp.marks[j];
				
				sum += marks;
				
			}
			
			System.out.println(stuTemp + "sum : "+sum);
		}
		
	}
	
	public static int[] getMarks() {
		int[] marks = {
				((int)Math.random() * 100 - 30 +1) + 30,
				((int)Math.random() * 100 - 30 +1) + 30,
				((int)Math.random() * 100 - 30 +1) + 30,
				((int)Math.random() * 100 - 30 +1) + 30,
				((int)Math.random() * 100 - 30 +1) + 30,
		};
		
		return marks;
	}

}
