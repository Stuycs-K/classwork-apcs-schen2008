public class MyArrays{
  public static Sttring arrayToString(int[] nums)
  {
    String result = "[";
    for(int i = 0; i < nums.length; i++)
    {
      if(i == nums.length-1)
      {
        result += nums[i]
      }
      else
      {
      result += nums[i] + ",";
      }
    }
    return result + "]"
  }
  public static int[] returnCopy(int[] ary)
  {
    int[] result = new int[ary.length];
    for(int i = 0; i < ary.length; i++)
    {
      result[i] = ary[i];
    }
    return result;
  }
  
  public static void main(String[] args)
  {

  }
}
