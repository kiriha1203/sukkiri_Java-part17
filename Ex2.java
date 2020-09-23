import java.io.*;

public class Ex2 {
  public static void main(String[] args) {
    try {
      var fw = new FileWriter("data.txt");
      fw.write("hello!");
      fw.close();
    } catch (Exception e) {
      System.out.println("なんらかの例外が発生しました");
    }
  }
}