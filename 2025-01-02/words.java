public class words {

  public static void main(String[] args) {
    makeWords(3, "", "abc");
  }

  public static void makeWords(int remainingLetters, String result, String alphabet) {
    for (int i = 0; i < remainingLetters; i++) {
      result += alphabet.substring(i, i+1);
      makeWords(remainingLetters - 1, result, alphabet.substring(1));
    }

  }

}
