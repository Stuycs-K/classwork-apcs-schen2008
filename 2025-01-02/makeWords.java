public class makeWords{
  public static void makeWords(int remainingLetters, String result, String alphabet){
    if(remainingLetters == 0){
      System.out.println(result);
      return;
    }else if(alphabet.equals("")){
      return;
    }
    for (int i = 0; i < alphabet.length(); i++) {
      makeWords(remainingLetters - 1, result + alphabet.charAt(i), alphabet);
  } 
  }
  public static void main(String[] args){
    String alphabet = "abc"; 
    int wordLength = 3;      
    makeWords(wordLength, "", alphabet);
  }
}
