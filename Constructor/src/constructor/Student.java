package constructor;

public class Student {
	int code;
	String name;
	Student()
	{
		this.code=100;
		this.name="Raja Naveen";
	}
	Student(int code,String name)
	{
		this.code=code;
		this.name=name;
	}
	public void showData()
	{
		System.out.println("Code:"+this.code);
		System.out.println("Name:"+this.name);
	}

}
