import java.io.*;

public class Ex3 {
  public static void main(String[] args) {
    FileWriter fw = null;
    try {
      fw = new FileWriter("data.txt");
      fw.write("hello!");
    } catch (Exception e) {
      System.out.println("なんらかの例外が発生しました");
    } finally {
      if (fw != null) {
        try {
          fw.close();
        } catch (IOException e) {
          ;
        }
      }
    }
  }
}