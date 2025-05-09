class Secondlarge
{
 public static void main(String args[])
 {
  int num=987654,rem=0,firstlarge=Integer.MIN_VALUE,secondlarge=Integer.MAX_VALUE;
  do
    {
	rem=num%10;//2 5 4 1
        num=num/10;
     
        if(rem>firstlarge)
        
          firstlarge=rem;//5
        else if(rem>secondlarge && secondlarge!=firstlarge)
            secondlarge=rem;
        
      }
      
     while(num!=0);
    
 
    System.out.println(" first largest digit is "+firstlarge);
     System.out.println("second largest digit is "+secondlarge);
 


 }
}