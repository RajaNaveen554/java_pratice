package constructor;

public class Constructor1 {

	public static void main(String[] args) {
		//default constructor
		Student student=new Student();
		student.showData();
		//parameterized constructor
		Student s=new Student(101,"Raja Naveen");
		s.showData();
	}

}
