class Main
{
	public static void main(String args[])
	{
		Practise p=new Practise(10,"ab");
		Practise p1=new Practise("ab");

		p.name="abc";
		p.id=12;
		p.isDisplay();


	}
}		
class Practise
{
	int id;
	String name;
	Practise(int id,String name)
	{
		this.id=id;
	}
	Practise(String name)
	{
		name=name;
	}
	void isDisplay()
	{
		System.out.println(id+" "+name);
	}
}
