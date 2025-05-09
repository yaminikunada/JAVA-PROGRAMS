import  java.util.Scanner;
class Position
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int count=s.nextInt();
		int rem=0,temp=num,ncount=0;
		while(num!=0)//2345
		{
			
			num=num/10;//
			ncount++;//4
		}
		num=temp;//2345
		int pos=0;
                while(num!=0)//
		{
			 rem=num%10;//5 4  3 2
			 //count++;//1 2 3 4 5
			if(count<=ncount)//1<4  2<4 3<4 4<=4
				pos=rem;//5 4 3 4
			 count++;
		      num=num/10;	
                 }
		System.out.println(pos);

		
		
	}
}
