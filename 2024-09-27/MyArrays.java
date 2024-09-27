public class MyArrays{
  public static String arrayToString(int[] nums)
  {
    String result = "[";
    for(int i = 0; i < nums.length; i++)
    {
      if(i == nums.length-1)
      {
        result += nums[i];
      }
      else
      {
      result += nums[i] + ",";
      }
    }
    return result + "]";
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

  public static int[] concatArray(int[] ary1, int[] ary2){
    int[] result = new int[ary1.length + ary2.length];
    int i = 0;
    for(i = 0; i<ary1.length;i++){
      result[i] = ary1[i];
    }
    for(int x = 0; x < ary2.length; x++){
      result[i] = ary1[x];
    }
    return result;
  }
  public static void main(String[] args)
  {

  }
}
