class Ternary
{
 public static void main(String[] args)
{
 int a=5,b=10;
int res=a>b?a+b:a-b;
System.out.println(res);
}
}
class Ternaryeven
{
 public static void main(String[] args)																																																																						
{
 int a=5;
 String res1=a%2==0?"even":"odd";
 System.out.println(res1);
}																																																																																																																																																																																																																																																																		
}
class Ternarymax
{
public static void main(String[] args)																																																																						
{
int a=20,b=50;
int res2=a>b?a:b;
System.out.println(res2+" max value");
}
}
class Ternarysqrt
{
public static void main(String[] args)
{
int a=2;
int s=(int)Math.sqrt(a);
String res=s*s==a?"perfect":"not perfect";
System.out.println(res);
}
}
class Ternarychar
{
public static void main(String[] args)
{
int a=200;
if(a<100)
{ 
char c='y';
 char res=(char)(c-32); 
 System.out.println(res);
}
else
{
 char ch='A';
  char res=(char)(ch+32);
 System.out.println(res);
}
}
}
class Ternarysame
{
 public static void main(String[] args)
{
 char c1='h',c2='G';
if(c1==c2)
{
 System.out.println("same characters");
}
else
{
char res=(char)(c2+32);
System.out.println( c1 +" and "+c2+"  are not same  ");
}
}
}





