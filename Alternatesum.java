class Alternate
{
 public static void main(String args[])
  {
   int num=981624,rem=0,sum=0,temp=num,count=0;

   do
   {
     rem=num%10;//4 5 6 7 8
     num=num/10;
         count++;
        
     if(count%2==0)//1%2 2
     {
       sum+=rem;
	
     }
	 
    }
   while(num!=0);
  System.out.println(sum);
 }
}  










