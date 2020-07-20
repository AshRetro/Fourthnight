public class Contains
{

  // tells whether a string is present in another
  // m for master , s for small
  public boolean has(String m,String s)
  {
    while(m.length()>s.length())
    {
      if(m.indexOf(s.charAt(0))!=-1)
      m = m.substring(m.indexOf(s.charAt(0)));
      else
      break;
      if(m.startsWith(s))
        return true;
      if(m.length()>0)
      m = m.substring(1);
      else
      break;
    }
    return false;
  }
  /*
  public static void main(String[] args) {
    Contains obj = new Contains();
    System.out.println(obj.has("thi is awesome.","fat"));
  }
  */
}
