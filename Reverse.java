public class Reverse
{

  // reverses the given string or even int
  public String rev(String n)
  {
    String temp = "";
    for(int i=n.length()-1; i >= 0;i--)
      temp+=n.charAt(i)+"";
    return temp;
  }
  public int rev(int n)
  {
    return Integer.parseInt(rev(n+""));
  }
  /*
  public static void main(String[] args) {
    Reverse obj = new Reverse();
    System.out.println(obj.rev(123));
  }
  */
}
