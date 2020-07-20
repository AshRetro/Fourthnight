public class Cat{

  // charAt function but now it accepts
  // negative values
  public char cAt(String s,int n)
  {
    if(n<0)
      n = s.length() + n;
    return s.charAt(n);
  }
  /*
  public static void main(String[] args) {
    Cat obj = new Cat();
    System.out.println(obj.cat("hello",0));
  }
  */
}
