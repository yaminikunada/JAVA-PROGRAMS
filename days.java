class Month
{
 public static	void main (String args[])
 {
  int num=2;
  if(num==1||num==3||num==5||num==7||num==8||num==10||num==12)
    System.out.println(num+ " it has 31 days");									
  else if(num==4||num==6||num==8||num==9||num==11)
    System.out.println(num + " it has 30 days");
  else if(num==2)
   System.out.println(num+ " it  has 28/29 days");	
 else
   System.out.println(num+ " invalid input");
 }
}							