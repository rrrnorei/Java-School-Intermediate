import java.util.Random;

class Practice10_03{
  public static void main(String[] args) {
    int age = new Random().nextInt(21);
    int gender = new Random().nextInt(2);

    System.out.println(age + " " + gender);
    switch (age) {
      case 0,1,2,3 -> {
        System.out.println(
          switch (gender) {
            case 0 -> "あなたは babyな男 です";
            default -> "あなたは babyな女 です";
          }
        );
      }
      case 4,5 -> {
        System.out.println(
          switch (gender) {
            case 0 -> "あなたは childな男 です";
            default -> "あなたは childな女 です";
          }
        );
      }
      case 6,7,8,9,10,11,12,13,14,15,16,17 -> {
        System.out.println(
          switch (gender) {
            case 0 -> "あなたは kidな男 です";
            default -> "あなたは kidな女 です";
          }
        );
      }
      default -> {
        System.out.println(
          switch (gender) {
            case 0 -> "あなたは adultな男 です";
            default -> "あなたは adultな女 です";
          }
        );
      }
    };
  }
}      