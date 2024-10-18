import java.util.Arrays;
import java.util.Objects;

public class Student {

	int id;
	String name;
	int[] marks;
	int tm;
	
	public Student() {
		// TODO Auto-generated constructor stub
		
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(marks);
		result = prime * result + Objects.hash(id, name, tm);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return (id == other.id && Arrays.equals(marks, other.marks) && Objects.equals(name, other.name)
				&& tm == other.tm);
	}

	public int totalMarks(int[] marks) {
		int Tmark = 0;
		
		for(int i = 0;i<marks.length;i++) {
			Tmark = Tmark+marks[i];
		}
		
		return Tmark;
	}
	
	

	public Student(int id, String name, int[] marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.tm = totalMarks(this.marks);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + tm  + "]";
	}
	
	

}
