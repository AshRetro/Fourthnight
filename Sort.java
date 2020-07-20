public class Sort{

  // sorts the given string in ascending order
  // accordingly to the ascii code
  public String sort(String s)
  {
    int temp[] = new int[s.length()];
    for(int i = 0; i<temp.length;i++)
    {
      temp[i] = (int)(s.charAt(i));
    }
    for(int i=0;i<temp.length;i++)
    {
      int min = i;
      for(int j=i+1;j<temp.length;j++)
      {
        if(temp[min]>temp[j])
          min = j;
      }
      if(min != i)
      {
        int k = temp[i];
        temp[i] = temp[min];
        temp[min] = k;
      }
    }
    s = "";
    for(int i=0;i<temp.length;i++)
    {
      s += (char)(temp[i]);
    }
     return s;
  }
  /*
  public static void main(String[] args) {
    Sort obj = new Sort();
    System.out.println(obj.sort("582"));
  }
  */
}
