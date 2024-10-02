class Coffee {
  String brandName; //ブランド名
  String sweetness; //甘さ
  boolean milk; //ミルク有無
  int price; //価格

  //コンストラクタ
  public Coffee(String brandName, String sweetness, boolean milk, int price) {
    this.brandName = brandName;
    this.sweetness = sweetness;
    this.milk = milk;
    this.price = price;
  }

  // buyDrink()メソッド
  public void buyDrink() {
    String withMilk;
    if (milk) {
      withMilk = "ミルク 入りです";
      } else {
        withMilk = "ミルク 無しです";
        }
      System.out.println(brandName + " の甘さは " + sweetness + "、" + withMilk + price + " 円になります。");
  }
}

class Juice {
  String brandName; //ブランド名
  String flavour; //味
  int price; //価格

  //コンストラクタ
  public Juice(String brandName, String flavour, int price) {
    this.brandName = brandName;
    this.flavour = flavour;
    this.price = price;
  }

  // buyDrink()メソッド
  public void buyDrink() {
    System.out.println(brandName + " の" + flavour + " 味です。" + price + " 円になります。");
  }
}

public class ComprehensiveIntermediate02_05 {
  public static void main(String[] args) {
    // バヤリース
    Juice orangJuice = new Juice("バヤリース", "オレンジ", 130);
    // 午後の紅茶
    Juice afternoonTea = new Juice("午後の紅茶", "レモンティー", 150);
    // ボス
    Coffee bitterCoffee = new Coffee("ボス", "控えめ", false, 110);
    // ジョージア
    Coffee sweetCoffee = new Coffee("ジョージア", "控えめ", true, 120);

    orangJuice.buyDrink();
    afternoonTea.buyDrink();
    bitterCoffee.buyDrink();
    sweetCoffee.buyDrink();
  }
}
