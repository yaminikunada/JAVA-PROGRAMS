class Leastfactor
{
  public static void main (String args[])
  {
     int n1=6,n2=12,least=0,num=0;	
     int start=num,end=n1,nstart=n2;
      num=n1>n2?n1:n2;//12
         
	while(end<=start)
	{//6<=12,6<=11,6<=10,6<=9,6<=8,6<=7,
           
	  if(n1%start==0 && n2%start==0)//6%12 f 6%11 f 6%10 f 6%9f 6%8 f 
            {
              least=start;
	     System.out.println(start);
            }
          start--;//11 10 9 8 7
          }
	   System.out.println("least factor is "+least);
    }
}