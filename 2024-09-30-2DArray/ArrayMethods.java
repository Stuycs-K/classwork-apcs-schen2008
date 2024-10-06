// Sean Chen, seanc4194@nycstudents.net, Stephen Chen stephenc88@nycstsudents.net
public class ArrayMethods{
  public static void main(String[] args){
    int[][] arr1 = {{1,2},{4,5},{6,7}};
    int[][] arr2 = {};
    int[][] arr3 = {{1},{2,3},{4,5,6}};
    int[][] arr4 = {{}};
    int[][] arr5 = {{1,2},{},{5,6,7}};
    int[][] swap1 ={{6,8},{99,9},{16,-6}};
    int[][] swap2 ={{6,8,1,2,3},{99,9,0,0,0},{16,-6,-3,3,2}};
    System.out.println("arrToString");
    System.out.println(arrToString(arr1));
    System.out.println(arrToString(arr2));
    System.out.println(arrToString(arr3));
    System.out.println(arrToString(arr4));
    System.out.println(arrToString(arr5));
    System.out.println("arr2DSum");
    System.out.println(arr2DSum(arr1));
    System.out.println(arr2DSum(arr2));
    System.out.println(arr2DSum(arr3));
    System.out.println(arr2DSum(arr4));
    System.out.println(arr2DSum(arr5));
    System.out.println("swapRC");
    System.out.println(arrToString(swapRC(arr1)));
    System.out.println(arrToString(swapRC(swap1)));
    System.out.println(arrToString(swapRC(swap2)));
    System.out.println("replaceNegative");
    int[][] test1 = {};
    int[][] test2 = {{}};
    int[][] test3 = {{-1, -2, -3}};
    int[][] test4 = {{1, 2, -3}, {7, -8, 2}};
    int[][] test5 = {{0, -5, -2}, {11,12,-13}, {3, 3, -3}};
    int[][] test6 = {{-4, 0}, {7}, {-2, 9, -10}};
    replaceNegative(test1);
    replaceNegative(test2);
    replaceNegative(test3);
    replaceNegative(test4);
    replaceNegative(test5);
    replaceNegative(test6);
    System.out.println(arrToString(test1));
    System.out.println(arrToString(test2));
    System.out.println(arrToString(test3));
    System.out.println(arrToString(test4));
    System.out.println(arrToString(test5));
    System.out.println(arrToString(test6));


  }
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
  /*Return the sum of all of the values in the 2D array */
  public static int arr2DSum(int[][]nums){
    int sum = 0;
    for(int i = 0; i < nums.length; i++){
      for(int x = 0; x < nums[i].length; x++){
        sum += nums[i][x];
      }
    }
    return sum;
  }
  /**Rotate an array by returning a new array with the rows and columns swapped.
  * You may assume the array is rectangular and neither rows nor cols is 0.
  * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  */
  public static int[][] swapRC(int[][]nums){
    int sublen = nums[0].length;
    int mainlen = nums.length;
    int[][] result = new int[sublen][mainlen];
    // need a loop that iterates through the first value of every sublist, then the second value of every sublist, etc
    for(int i = 0; i < nums.length; i++){
      for(int x = 0; x < sublen; x++){
        result[x][i] = nums[i][x];
      }
    }
    return result;

  }
  public static void replaceNegative(int[][] vals){
    for (int i = 0; i < vals.length; i++){
      for (int j = 0; j < vals[i].length; j++){
        if (vals[i][j] < 0){
          if(i == j){
            vals[i][j] = -1;
          }
          else{
            vals[i][j] = 0;
          }
        }
      }
    }
  }
  //4. Make a copy of the given 2d array.
//When testing : make sure that changing the original does NOT change the copy.
//DO NOT use any built in methods that "copy" an array.
//You SHOULD write a helper method for this.
//If you don't see a good way to do that, you should stop and look at prior methods.
public static int[] returnCopy(int[] nums){
  int[] result = new int[nums.length];
  for(int i = 0; i < result.length;i++){
    result[i] = nums[i];
  } 
  return result;
} 
  public static int[][] copy(int[][] nums){
    int[][] result = new int[nums.length][];
    for(int i = 0; i < result.length;i++){
      result[i] = returnCopy(nums[i]);
    }
    return result;
  } 
}




