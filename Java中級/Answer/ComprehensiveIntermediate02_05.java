class Juice {
    String makerKind;
    String taste;
    int fee;

    public void buyDrink() {
        switch (makerKind) {
            case "バヤリース":
                System.out.println(makerKind + " の " + taste + " 味です。 " + fee + " 円になります。");
                break;
            case "午後の紅茶":
                System.out.println(makerKind + " の " + taste + " 味です。 " + fee + " 円になります。");
                break;
            default:
                System.out.println("バヤリース または 午後の紅茶 を設定してください。");
                break;
        }
    }
}

class Coffee {
    String makerKind;
    String taste;
    String milkFlag;
    int fee;

    public void buyDrink() {
        switch (makerKind) {
            case "ボス":
                System.out.println(makerKind + " の甘さは " + taste + " 、ミルク" + milkFlag + "です。 " + fee + " 円になります。");
                break;
            case "ジョージア":
                System.out.println(makerKind + " の甘さは " + taste + " 、ミルク" + milkFlag + "です。 " + fee + " 円になります。");
                break;
            default:
                System.out.println("ボス または ジョージア を設定してください。");
                break;
        }

    }
}

public class ComprehensiveIntermediate02_05 {
    public static void main(String[] args) {
        Juice juice = new Juice();
        Coffee coffee = new Coffee();

        juice.makerKind = "バヤリース";
        juice.taste = "オレンジ";
        juice.fee = 130;
        juice.buyDrink();

        juice.makerKind = "午後の紅茶";
        juice.taste = "レモンティー";
        juice.fee = 150;
        juice.buyDrink();

        coffee.makerKind = "ボス";
        coffee.taste = "控え目";
        coffee.milkFlag = "無し";
        coffee.fee = 110;
        coffee.buyDrink();

        coffee.makerKind = "ジョージア";
        coffee.taste = "甘め";
        coffee.milkFlag = "入り";
        coffee.fee = 120;
        coffee.buyDrink();
    }
}
