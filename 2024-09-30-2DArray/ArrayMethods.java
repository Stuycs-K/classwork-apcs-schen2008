// Sean Chen, seanc4194@nycstudents.net, Stephen Chen stephenc88@nycstsudents.net
public class ArrayMethods{
  public static String arrToString(int[] nums){
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
  public static void main(String[] args){
    int[][] arr1 = {{1,2},{4,5},{6,7}};
    int[][] arr2 = {};
    int[][] arr3 = {{1},{2,3},{4,5,6}};
    int[][] arr4 = {{}};
    int[][] arr5 = {{1,2},{},{5,6,7}};
    System.out.println("arrToString");
    System.out.println(arrToString(arr1));
    System.out.println(arrToString(arr2));
    System.out.println(arrToString(arr3));
    System.out.println(arrToString(arr4));
    System.out.println(arrToString(arr5));
  }

  public static String arrToString(int[][] nums){
    String result = "[";
    for (int i = 0; i < nums.length; i++){
        if (i == nums.length-1){
          result += arrToString(nums[i]);
        }
        else{
          result += arrToString(nums[i]) + ",";
        }
    }
    return result + "]";
  }
}
