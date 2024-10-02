import java.util.*;

public class ComprehensiveIntermediate02_02 {
  public static void main(String[] args) {
    MenuManager manager = new MenuManager();
    // サンドイッチメニューの表示
    manager.showMenu("sandwitch");
    // サンドイッチメニューにビッグバーガーを追加
    manager.setMenu("sandwitch","ビッグバーガー");
    // サンドイッチメニューの表示
    manager.showMenu("sandwitch");
    // 「ホットミルク」をメニューから検索
    manager.searchMenu("ホットミルク");
    // 「オレンジジュース」をメニューから検索
    manager.searchMenu("オレンジジュース");
  }
}


class MenuManager {
  private HashMap<String, ArrayList<String>> map;

  // コンストラクタ
  MenuManager() {
    map = new HashMap<>();

    // サンドイッチメニューの登録
    ArrayList<String> list = new ArrayList<>();
    list.add("ハンバーガー");
    list.add("チーズバーガー");
    list.add("フィレオフィッシュ");
    map.put("sandwitch", list);

    // ドリンクメニューの登録
    list = new ArrayList<>();
    list.add("コーラ");
    list.add("オレンジジュース");
    list.add("コーヒー");
    map.put("drink", list);

    // サイドメニューの登録
    list = new ArrayList<>();
    list.add("フライドポテト");
    list.add("チキンナゲット");
    list.add("アップルパイ");
    map.put("sidemenu", list);
  }

  // ここにsearchMenuを作成します。
  public void searchMenu(String menuName) {
    boolean found = false;
    // マップのエントリをループ
    for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
      // メニューリストの検索
      if (entry.getValue().contains(menuName)) {
        // 見つかったときの処理
        System.out.println(menuName + "は" + entry.getKey() + "に含まれています。");
        found = true;
        break;
      }
    }
    // 見つからなかったときの処理
    if (!found) {
      System.out.println("該当するメニューはありません。");
    }
  }            

  // ここにsetMenuを作成します。
  public void setMenu(String category, String menu) {
    // カテゴリがあるかチェック
    if (map.containsKey(category)) {
      // カテゴリがある場合の処理
      map.get(category).add(menu);
    } else {
      // カテゴリがない場合の処理
      ArrayList<String> newList = new ArrayList<>();
      newList.add(menu);
      map.put(category, newList);
    }
  }

  // ここにshowMenuを作成します。
  public void showMenu(String category) {
    // カテゴリがあるかチェック
    if (map.containsKey(category)) {
      // カテゴリがある場合の処理
      System.out.println(map.get(category));
    } else {
      // カテゴリがない場合の処理
      System.out.println("該当するカテゴリはありません。");
    }
  }
}

