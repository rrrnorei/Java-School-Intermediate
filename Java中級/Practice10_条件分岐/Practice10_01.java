import java.util.Random;

class Practice10_01 {
  public static void main(String[] args) {
    // 0-1の乱数を gender に代入
    int gender = new Random().nextInt(2);

    switch (gender) {
      case 0:
        System.out.println("あなたは 男 です");
        break;
      case 1:
        System.out.println("あなたは 女 です");
        break;
    }
  }
}