import junit.framework.*;

public class TestSub extends TestCase {

  public void testAdd() {
    int result = Calculator.sub(1,2);
    assertTrue(result == -1);
  }

}
