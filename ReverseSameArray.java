import java.util.Scanner;
class ReverseSameArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter elements");

		for(int x=0;x<=a.length-1;x++)
			a[x]=sc.nextInt();//1 2 3 4 5 
	        int start=0;	
		int temp=a[0];

		for(int x=a.length-1;x>0;x--)//4 3 2 1 0
		
    		{
			a[start]=a[x];//a[0]=a[4]=5//a[1]=a[3]=4//a[2]=a[2]=3//a[3]=a[1]=2//a[4]=a[1]=1
			start++;//1 2 3 4
                        a[a.length-1]=temp;

		}
		//a[a.length-1]=temp;
		
		for( int x=0;x<=a.length-1;x++)
		
			System.out.println("a["+x+"]"+a[x]);


	}
}
