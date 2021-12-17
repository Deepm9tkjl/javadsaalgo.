import java.util.Scanner;

public class abtoab{

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int b1 = scn.nextInt();
    int  b2 = scn.nextInt();
    int d = getvalue(n, b1, b2);
    System.out.println(d);
  }
  public static int getvalue(int n, int b1, int b2) {
    int d1 = abd(n, b1);
    int d2 = dab(d1, b2);
    return d2;
  }
  public static int dab(int n, int b) {
    int p = 1, da = 0;
    while (n > 0) {
      int dig = n % b;
      n = n / b;
      da = da + dig * p;
      p = p * 10;
    }
    return da;
  }
  public static int abd(int n, int b) {
    int ab = 0, p = 1;
    while (n > 0) {
      int dig = n % 10;
      n = n / 10;
      ab = ab + dig * p;
      p = p * b;
    }
    return ab;
  }
}