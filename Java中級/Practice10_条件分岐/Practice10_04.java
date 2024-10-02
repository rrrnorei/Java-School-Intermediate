import java.util.Random;

public class Practice10_04 {
  public static void main(String[] args) {
    int color = new Random().nextInt(5)+1;

    System.out.println(color);
    System.out.println(
      switch(color) {
        case 1 -> "今日のラッキーカラーは ピンク です";
        case 2,3,4 -> "今日のラッキーカラーは レッド です";
        default -> "今日のラッキーカラーは ゴールド です";
      }
    );
  }  
}
