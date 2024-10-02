import java.util.HashMap;

public class ComprehensiveIntermediate02_01 {
  public static void main(String[] args) {
    HashMap<String, Integer> map = new HashMap<>();

    map.put("国語",90);
    map.put("数学",80);
    map.put("英語",70);

    map.forEach((subject, score) ->
    System.out.println(subject + ":" + score));
    
  }
}
