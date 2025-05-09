class 	Prog14
{
 public static void main(String args[])
 {
  int num=123;
  if(num%2==0)
  {
   double square=Math.sqrt(num);
   if(square==(int)square)
    	System.out.println(num +" number is even and it is a perfect square");																																																															 																																																																																																																																																																																	
   else
    System.out.println(num +" number is even and it is not a perfect square");
  }
  else
  {
    int	last=num%10;
    if(last%5==0)
     System.out.println(last +" number is odd and it is divisible by 5");																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								    else
     System.out.println(last +" number is odd and it is a not divisible by 5");																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
   }
 }
}																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								