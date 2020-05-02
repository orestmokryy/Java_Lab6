package ua.lviv.iot;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class BankHiderTest {
  @Test
  public void test() {

    String yourText = "smthg 1111 2222 3333 4444 something 5555 6666 7777 8888";
// -- Here are some quick inputs --
// there is your card number: 1111222233334444
// there is your card number: 1111 2222 3333 4444
// there is your card number: 1111 2222 3333 4444 and 1111222233334444
    
    InputStream inputedString = new ByteArrayInputStream(yourText.getBytes());
    System.setIn(inputedString);

    @SuppressWarnings("resource")
    Scanner myScanner = new Scanner(System.in);
    String text = myScanner.nextLine();
    System.out.println("Here is your original line:");
    System.out.println(text);
    BankHider.printText(text);
  }
}