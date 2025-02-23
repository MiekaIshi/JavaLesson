import org.json.*;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
  public static void main(String[] args) {
    // JSONオブジェクトの作成
    JSONObject jsonObject = new JSONObject();
    jsonObject.put("name", "John Doe");
    jsonObject.put("age", 30);
    jsonObject.put("city", "New York");

    // JSONファイルを書き込む
    try (FileWriter file = new FileWriter("data.json")) {
        file.write(jsonObject.toString(4)); // インデント付きで書き込む
        file.flush();
        System.out.println("JSONファイルが作成されました。");
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}