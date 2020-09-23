import java.io.*;

public class Ex4 {
  public static void main(String[] args) {
    try (var fw = new FileWritter("data.txt");) {
      fw.write("hello!");
    } catch (Exception e) {
      System.out.println("なんらかの例外が発生しました");
    }
  }
}