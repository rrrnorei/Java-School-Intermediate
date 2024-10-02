public class Practice12_02 {
  public static void main(String[] args) {
    greet("朝");
    greet("昼");
    greet("夜");
  }

  private static void greet(String timeZone) {
    switch (timeZone) {
      case "朝":
        System.out.println("Good morning!!");
        break;
      case "昼":
        System.out.println("Good afternoon!!");
        break;
      case "夜":
        System.out.println("Good evening!!");
        break;
      default:
        System.out.println("How are you?");
        break;
    }
  }
}
