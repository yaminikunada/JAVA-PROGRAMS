class Ranks
{
 public static void main(String args[])
 {
  int marks=70,rank=0;
  String c="obc";
  if(marks>=60)
   {
    if(c=="oc"||c=="bc")
    {
    rank=120000;
     System.out.println("rank 120000");
    if(rank==120000)
     System.out.println( "you got seat in sv collage");
    }
    else if(c=="obc"||c=="sc")
    {
     rank=70000;
      System.out.println("rank 70000");
     if(rank==70000)
      System.out.println("you got seat in bc collage");	
    }
    else if(c=="st")
    {
     rank=20000;
      System.out.println("rank 20000"); 
     if(rank==20000)
      System.out.println(  "you got seat in svh collage");
    }
   }
  else if(marks>=45)
   {
    if(c=="oc"||c=="bc")
    {
     rank=80000;
      System.out.println("rank 80000");
     if(rank==80000)
      System.out.println( "you got seat in sv collage");
    }
    else if(c=="obc"||c=="sc")
    {
     rank=50000;
      System.out.println("rank 50000");
     if(rank==50000)
      System.out.println("you got seat in bc collage");	
    }
    else if(c=="st")
    {
     rank=30000;
      System.out.println("rank 30000"); 
     if(rank==30000)
      System.out.println(  "you got seat in svh collage");
    }
   }
  else if(marks>=35)
   {
    if(c=="oc"||c=="bc")
    {
     rank=60000;
      System.out.println("rank 60000");
     if(rank==60000)
      System.out.println( "you got seat in sv collage");
    }
    else if(c=="obc"||c=="sc")
    {
     rank=30000;
       System.out.println("rank 30000");
     if(rank==30000)
      System.out.println("you got seat in bc collage");	
    }
    else if(c=="st")
    {
     rank=15000;
      System.out.println("rank 15000"); 
     if(rank==15000)
      System.out.println(  "you got seat in svh collage");
    }  
   }
  else
   {
    System.out.println( " you are not eligible");
   }
 }
}																																																																																																																																																																																																																																								