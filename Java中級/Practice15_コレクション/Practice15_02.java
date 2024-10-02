import java.util.TreeSet;
import java.util.Set;

public class Practice15_02 {
  public static void main(String[] args) {
    Set<String> ts = new TreeSet<>();

    ts.add("kubo");
    ts.add("mitoma");
    ts.add("kamada");
    ts.add("kamada");

    System.out.println(ts);
  }
}