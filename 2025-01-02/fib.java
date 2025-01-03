public class fib {

  public static void main(String[] args) {
    System.out.println(recFib(Integer.parseInt(args[0])));
  }

  public static int recFib(int n) {
    if (n < 2) return n; //base case
    return recFib(n - 1) + recFib(n - 2);
  }

}
