

import java.io.IOException;

public class TestInput {
  public static void main(String[] args) throws IOException {
    while (true) {
      int c = System.in.read();
      System.out.println("[" + c + "] [" + ((char) c) + "]");
    }
  }
}
