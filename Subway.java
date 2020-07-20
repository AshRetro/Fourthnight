public class Subway
{
  /*
  sub(char a)
  sub(char a, char b)
  sub(char a, int b)
  sub(int a , char b)
  sub(int a)
  sub(int a , int b)
  */
  //superior function to substring
  public String sub(String m,char s)
  {
    return (m.indexOf(s)!=-1)?m.substring(m.indexOf(s)):"::FaLsE";
  }

  //
  public String sub(String m,char s1,char s2)
  {
    return ((m.indexOf(s1)!=-1)&&(m.indexOf(s2)!=-1))?m.substring(m.indexOf(s1),m.indexOf(s2)):"::FaLsE";
  }

  //
  public String sub(String m,int s1,char s2)
  {
    if(s1<0)
    {
        s1 = m.length() + s1;
        if(m.indexOf(s2) < s1)
          return m.substring(s1) + m.substring(0,m.indexOf(s2));
        else
          return m.substring(s1,m.indexOf(s2));
    }
    return (m.indexOf(s2) < s1)?m.substring(s1) + m.substring(0,m.indexOf(s2)):m.substring(s1,m.indexOf(s2));
  }

  //
  public String sub(String m,char s1,int s2)
  {
    if(s2 < 0)
    {
        s2 = m.length() + s2;
        if(s2 < m.indexOf(s1))
          return m.substring(m.indexOf(s1)) + m.substring(0,s2);
        else
          return m.substring(m.indexOf(s1),s2);
    }
    return (s2 < m.indexOf(s1))?m.substring(m.indexOf(s1)) + m.substring(0,s2):m.substring(m.indexOf(s1),s2);
  }

  //
  public String sub(String m,int s)
  {
    return (s < 0)?m.substring(m.length()+s):m.substring(s);
  }

  //
  public String sub(String m,int s1,int s2)
  {
    s1 = (s1<0)?m.length()+s1:s1;
    s2 = (s2<0)?m.length()+s2:s2;
    if(s1 < s2)
      return m.substring(s1,s2);
    return m.substring(s1)+m.substring(0,s2);
  }

  /*
  public static void main(String[] args) {
    Subway obj = new Subway();
    System.out.println(obj.sub("happiest",5,8));
  }
  */
}
