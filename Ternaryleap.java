class Ternaryleap
{
 public static void main(String args[])
 {
  int start=1600,end=2000;
  while(start<=end)
  {
  System.out.print(((start%4==0)&&(start%100!=0)||(start%400)==0)?(start%6==0)?start+"\n":"");
  start++;
  }
 }
}