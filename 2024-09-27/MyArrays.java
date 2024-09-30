public class MyArrays{
  public static String aryToString(int[] nums)
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
      result += nums[i] + ", ";
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
  
  public static int[] concatArray(int[]ary1,int[]ary2){
    int[] result = new int[ary1.length + ary2.length]; 
    int track = 0;
    for (int i = 0; i < ary1.length; i++){
      result[track] = ary1[i]; 
      track++; 
    }
    for (int x = 0; x < ary2.length; x++){
      result[track] = ary2[x]; 
      track++; 
    }
    return result;
  }
  public static void main(String[] args)
  {
    int[] arr1 = {1,2,3,4,5};
    int[] arr2 = {};
    int[] arr3 = {10000,1000,10,0,-5};
    int[] arr4 = {0,0,0,0,0,0,0,0,1};
    int[] arr5 = {-5,-24,1,55,4,5,15};

  System.out.println("ARYTOSTRING");

  System.out.println(aryToString(arr1));
  System.out.println(aryToString(arr2));
  System.out.println(aryToString(arr3));
  System.out.println(aryToString(arr4));
  System.out.println(aryToString(arr5));

System.out.println("RETURN COPY");

  System.out.println("expected: " + aryToString(arr1) + " result: " + aryToString(returnCopy(arr1)));
  System.out.println("expected: " + aryToString(arr2) + " result: " + aryToString(returnCopy(arr2)));
  System.out.println("expected: " + aryToString(arr3) + " result: " + aryToString(returnCopy(arr3)));
  System.out.println("expected: " + aryToString(arr4) + " result: " + aryToString(returnCopy(arr4)));
  System.out.println("expected: " + aryToString(arr5) + " result: " + aryToString(returnCopy(arr5)));

 System.out.println("CONCAT ARRAY");

  System.out.println(aryToString(concatArray(arr1, arr2)));
  System.out.println(aryToString(concatArray(arr1, arr3)));
  System.out.println(aryToString(concatArray(arr1, arr4)));
  System.out.println(aryToString(concatArray(arr1, arr5)));
  System.out.println(aryToString(concatArray(arr2, arr3)));
  System.out.println(aryToString(concatArray(arr2, arr4)));

  }
}