class Numbers
{
  public static void main(String args[])
  {
    int x=10,y=30;
    if(x==y)
    System.out.println("equal");
    else if(x>y)
     System.out.println(x+""+"greater is x");
    else 
     System.out.println(y+""+"greater is y");
}
}

class Equal
{
  public static void main(String args[])
  {
    int x=10,y=10;
    System.out.println(x==y?"equal":x>y?"greater is x":"greater is y");
  }
}
