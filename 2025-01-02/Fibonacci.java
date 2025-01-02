public class Fibonacci{
  public static int fib(int n){
    int sum = 0;
    if(n==1){
      return 1;
    }
    else if(n == 0){
      return 0;
    }
    else{
      sum += fib(n-1) + fib(n-2);
    }
    return sum;
  }
  public static void main(String[] args){
    if(args[1].equals("fib")){
      fib(Integer.parseInt(args[0]));
      System.out.println(fib(Integer.parseInt(args[0])));
    }
  }
}
