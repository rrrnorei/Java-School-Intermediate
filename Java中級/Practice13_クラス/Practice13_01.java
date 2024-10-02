class Animal {
  String name = "Jhon";
  String type = "nothing";

  /**
   * 動物に合わせて鳴き声を出力するメソッド
   *
   */
  public void cryAnimals() {
      System.out.println(
          switch (type) {
              case "cat" -> "nya-";
              case "dog" -> "wan";
              default -> "特定できませんでした";
          }
      );
  }
}

public class Practice13_01 {
  public static void main(String[] args) {
    Animal dog = new Animal();
    dog.name = "pochi";
    dog.type = "dog";
    System.out.println(dog.name);
    dog.cryAnimals();

    Animal cat = new Animal();
    cat.name = "tama";
    cat.type = "cat";
    System.out.println(cat.name);
    cat.cryAnimals();
  }
}
