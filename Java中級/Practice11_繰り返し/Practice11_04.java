import java.util.Scanner;

public class Practice11_04 {
  public static void main(String[] args) {
    // 2. のやり直すための処理を書く
    Scanner sc = new Scanner(System.in);
    int num = 0;
    while (true) {
      System.out.print("何段>");
      num = sc.nextInt();

      if(num < 1 || num > 5) {
        System.out.println("1 ~ 5 までの整数を入力してください");
      } else {
        break;
      }
    }
      // 3. の処理を書く
      for(int i = 1; i <= num; i++) {
        for(int space = 5; space > i; space--) {
          System.out.print(" ");
        }
        for(int mark = 1; mark <= i; mark++) {
          System.out.print("*");
        }
        System.out.println("");
      }
      
    sc.close();
  }
}
