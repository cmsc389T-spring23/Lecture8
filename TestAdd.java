import junit.framework.*;

public class TestAdd extends TestCase {

  public void testAdd() {
    int result = Calculator.add(1,2);
    assertTrue(result == 3);
  }

}
