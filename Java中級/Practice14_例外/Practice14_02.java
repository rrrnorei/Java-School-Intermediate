import java.util.Random;

public class Practice14_02 {
    public static void main(String[] args) {

        try {
        // こちらに処理を記述
            randomNums();
        } catch (ArithmeticException e) {
            System.out.println("計算例外をキャッチしました。");
        } catch (NullPointerException e) {
            System.out.println("ぬるぽをキャッチしました。");
        } finally {
            System.out.println("finally 計算終了");
        }
            System.out.println("処理終了");
    }

    public static void randomNums() {
        int num = new Random().nextInt(2);

        if (num == 0) {
            int excNum = 1 / 0;
            
        } else {
            String str = null;
            System.out.println(str.length());
        }
    }
}