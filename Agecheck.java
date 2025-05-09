class Age
{
 public static void main(String args[])
 {
  int age=9;
  if(age>100||age<=0)
   System.out.println(age+ " invalid input");
  else if(age>=60)
   System.out.println(age+ " senior citizen");
  else if(age>=18)
   System.out.println(age+ "major");
  else if(age<=10)
   System.out.println(age+ "kid");
  else if(age<18)
   System.out.println(age+ "minor");
 }
}