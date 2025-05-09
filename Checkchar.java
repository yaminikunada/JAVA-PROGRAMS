class Charcheck
{
 public static void main(String args[])
 {
  char x='a';
  if(x>='A' && x<='Z')
   System.out.println(x +" capital letter");
  else if(x>='a' && x<='z')
   System.out.println(x +" small letter");
  else if(x>='0' && x<='9')
   System.out.println(x +" digit");
  else if(x==' ')
   System.out.println(x +" space");
  else
   System.out.println(x +" symble");
 }
}