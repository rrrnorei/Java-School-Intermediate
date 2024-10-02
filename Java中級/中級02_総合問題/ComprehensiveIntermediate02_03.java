import java.util.Scanner;
import java.util.Random;

public class ComprehensiveIntermediate02_03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    System.out.println("ゾロ目で大当たり！チャンスは30回");
    System.out.print("begin と入力してください> ");

    String text = sc.next();

    if("begin".equals(text)) {
      for (int i = 1; i <= 30; i++) {
        int num1 = rand.nextInt(9) + 1;
        int num2 = rand.nextInt(9) + 1;
        int num3 = rand.nextInt(9) + 1;

        System.out.println(i + "回目" + num1 + num2 + num3);
        
        if (num1 == num2 && num2 == num3) {
          System.out.println(i+"回目で大当たりです。おめでとうございます！");
          break;
        } else if (i == 30) {
          System.out.println("残念でした。終わります。");
        }
      }
    } else {
      System.out.print("begin と入力してください> ");
    }

    sc.close();
  }
}
