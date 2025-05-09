class Prameter_cons
{
	public static void main(String args[])
	{
		Student student=new Student();
		student.printData();
		Student student1=new Student(11,"gay","gay@gmail.com","b",35.89);
		student1.printData();


		
	}
}
class Student
{
	int roll;
	String name,email,section;
	double marks;
	Student()
	{
		roll=10;
		name="yam";
		email="yam@gmail.com";
		section="a";
		marks=23.0;
	}
	Student(int r,String n,String e,String s,double m)
	{
		roll=r;
		name=n;
		email=e;
		section=s;
		marks=m;
	}
	void printData()
	{
		System.out.println(roll+" "+name+" "+email+" "+section+" "+marks);
	}
}