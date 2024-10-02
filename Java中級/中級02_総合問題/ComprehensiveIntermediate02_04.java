import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class ComprehensiveIntermediate02_04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    int inputNum = 0;

    
    while (true) {
      try {
        System.out.println("ジャンケン");
        System.out.print("0:グー 1:チョキ 2: パー ＞数字を入力してください");
        inputNum = sc.nextInt();
        if (inputNum < 0 || inputNum > 2) {
          System.out.println("0,1,2のいずれかの数字を入力してください");
          continue;
        }
        break;
      } catch (InputMismatchException e) {
        System.out.println("数字を入力してください。");
        sc.next();
      }
    }

    int cpuNum = rand.nextInt(3);

    if (inputNum == 0 && cpuNum == 0) {
      System.out.println("あなた「グー」 相手「グー」であいこ");
    } else if (inputNum == 0 && cpuNum == 1) {
      System.out.println("あなた「グー」 相手「チョキ」で勝ち");
    } else if (inputNum == 0 && cpuNum == 2) {
      System.out.println("あなた「グー」 相手「パー」で負け");
    } else if (inputNum == 1 && cpuNum == 0) {
      System.out.println("あなた「チョキ」 相手「グー」で負け");
    } else if (inputNum == 1 && cpuNum == 1) {
      System.out.println("あなた「チョキ」 相手「チョキ」であいこ");
    } else if (inputNum == 1 && cpuNum == 2) {
      System.out.println("あなた「チョキ」 相手「パー」で勝ち");
    } else if (inputNum == 2 && cpuNum == 0) {
      System.out.println("あなた「パー」 相手「グー」で勝ち");
    } else if (inputNum == 2 && cpuNum == 1) {
      System.out.println("あなた「パー」 相手「チョキ」で負け");
    } else if (inputNum == 2 && cpuNum == 2) {
      System.out.println("あなた「パー」 相手「パー」であいこ");
      } else {
        System.out.println("正しく入力してください");
    }

    sc.close();
  }
}
