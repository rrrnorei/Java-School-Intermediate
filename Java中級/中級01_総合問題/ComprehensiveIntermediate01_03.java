import java.util.Scanner;

public class ComprehensiveIntermediate01_03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("係数aを入力してください > ");
    double a = sc.nextDouble();

    System.out.print("係数bを入力してください > ");
    double b = sc.nextDouble();

    System.out.print("係数cを入力してください > ");
    double c = sc.nextDouble();

    double D = b * b - 4 * a * c;

    if (D > 0) {
      System.out.println("２つの実数解がある");
      } else if (D == 0) {
      System.out.println("重解がある");
      } else {
      System.out.println("２つの虚数解がある");
    }
    sc.close();
  }
}
