package prac_question;

import java.util.ArrayList;

public class MainCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] marks = {25,30,27,4,21};
		
		Student stuTemp;
		
		ArrayList<Student> stuList = new ArrayList<>();
		
		for(int i = 0;i<10;i++) {
			stuTemp = new Student(i+1,"Name" + i,generateMarks());
			
			stuList.add(stuTemp);
		}
		
		int sum;
		
		for(int i = 0;i<stuList.size();i++) {
			stuTemp = stuList.get(i);
			sum=0;
			
			for(int j = 0;j<stuTemp.marks.length;j++) {
				sum += stuTemp.marks[j];
			}
			System.out.println(stuTemp + " Total "+ sum);
		}
	}
	
	public static int[] generateMarks() {
		int[] marks = {(int) Math.random() * (30-1+1)+1,
				(int) Math.random() * (30-1+1)+1,
				(int) Math.random() * (30-1+1)+1,
				(int) Math.random() * (30-1+1)+1,
				(int) Math.random() * (30-1+1)+1,
				};
		
		return marks;
	}

}
