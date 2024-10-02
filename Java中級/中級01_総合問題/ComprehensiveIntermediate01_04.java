import java.util.Scanner;

public class ComprehensiveIntermediate01_04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("人数を入力してください");
    int numberOfPeople = sc.nextInt();

    int entryFee;

    if (numberOfPeople >= 20) {
      entryFee = 500;
    } else if (numberOfPeople >= 5) {
        entryFee = 550;
    }else {
      entryFee = 600;
    }

    System.out.println("入場料の合計は" + numberOfPeople * entryFee + "円です");

    sc.close();
  }
}
