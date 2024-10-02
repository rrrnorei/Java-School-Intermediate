import java.util.Random;

public class Practice11_03 {
  public static void main(String[] args) {
    int X = 1;
    while (X <= 10) {
      int num = new Random().nextInt(6)+1;
      System.out.println(num);
      if (num % 2 != 0) {
        System.out.println(X + "回目、" + num + "が出ました");
      } 
      X++;
    }
  }
}
